package com.wordpress.admin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import io.qameta.allure.Description;
import pageObjects.wordpress.AdminDashBoardPO;
import pageObjects.wordpress.AdminLoginPO;
import pageObjects.wordpress.AdminPostAddNewPO;
import pageObjects.wordpress.AdminPostSearchPO;
import pageObjects.wordpress.PageGeneratorManager;
import pageObjects.wordpress.UserHomePO;
import pageObjects.wordpress.UserPostDetailPO;

public class Post_01_Create_Read_Update_Delete_Update_Search extends BaseTest {
	
	String adminUsername = "admin";
	String adminPassword = "123456";
	String searchPostUrl;
	int  randomNumber = generateFakeNumber();
	String postTitle = "Title " + randomNumber;
	String postBody = "Body " + randomNumber;
	String authorName = "admin";
	String currentDay = getCurrentDate();
	String adminUrl, endUserUrl;
	
	@Parameters({ "browser", "urlAdmin", "urlUser"})
	@BeforeClass
	public void beforeClass(String browserName, String adminUrl, String endUserUrl) {
		log.info("Pre-Condition - Step 01: Open browser and admin Url");
		this.adminUrl = adminUrl;
		this.endUserUrl = endUserUrl;
		driver = getBrowserDriver(browserName, this.adminUrl);
		adminLoginPage = PageGeneratorManager.getAdminLoginPage(driver);

		
		adminLoginPage.inputToUserNameTextbox(adminUsername);
		
		adminLoginPage.inputToPasswordTextbox(adminPassword);
		
		adminDashBoardPage = adminLoginPage.clickToLoginButton();
				
	}
	
	@Description("Create new post")
	@Test
	public void Post_01_Create_new_Post() {
		adminPostSearchPage = adminDashBoardPage.clickToPostMenuLink();
		
		searchPostUrl = adminPostSearchPage.getPageUrl(driver);
		
		adminPostAddNewPage = adminPostSearchPage.clickToAddNewButton();
		
		adminPostAddNewPage.enterToAddNewPostTitle(postTitle);
		
		adminPostAddNewPage.enterToAddnewPostBody(postBody );
		
		adminPostAddNewPage.clickToPublishButton();
		
		adminPostAddNewPage.clickToPrePublishButton();
		
		verifyTrue(adminPostAddNewPage.isPostMessageIsDisplayed());
	}
	

	@Description("Search post")
	@Test
	public void Post_02_Search_Post() {
		adminPostSearchPage = adminPostAddNewPage.openSearchPostPageUrl(searchPostUrl);
		
		adminPostSearchPage.enterToSearchTextbox(postTitle);
		
		adminPostSearchPage.clickToSearchPostsButton();
		
		verifyTrue(adminPostSearchPage.isPostSearchTableDisplayed("title", postTitle));
		
		verifyTrue(adminPostSearchPage.isPostSearchTableDisplayed("author", authorName));
		
		userHomePage = adminPostSearchPage.openEndUserSite(driver, this.endUserUrl);
		
		verifyTrue(userHomePage.isPostInforDisplayedWithPostTitle(postTitle));
		verifyTrue(userHomePage.isPostInforDisplayedWithPostBody(postTitle, postBody));
		verifyTrue(userHomePage.isPostInforDisplayedWithPostAuthor(postTitle, authorName));
		verifyTrue(userHomePage.isPostInforDisplayedWithPostCurrentDay(postTitle, currentDay));
		
		userHomePage.clickToPostTitle(postTitle);
		
		verifyTrue(userPostDetailPage.isPostInforDisplayedWithPostTitle(postTitle));
		verifyTrue(userPostDetailPage.isPostInforDisplayedWithPostBody(postTitle, postBody));
		verifyTrue(userPostDetailPage.isPostInforDisplayedWithPostAuthor(postTitle, authorName));
		verifyTrue(userPostDetailPage.isPostInforDisplayedWithPostCurrentDay(postTitle, currentDay));
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserDriver();
	}
	
	private WebDriver driver;
	private AdminLoginPO adminLoginPage;
	private AdminDashBoardPO adminDashBoardPage;
	private AdminPostAddNewPO adminPostAddNewPage;
	private AdminPostSearchPO adminPostSearchPage;
	private UserHomePO userHomePage;
	private UserPostDetailPO userPostDetailPage;
	

}
