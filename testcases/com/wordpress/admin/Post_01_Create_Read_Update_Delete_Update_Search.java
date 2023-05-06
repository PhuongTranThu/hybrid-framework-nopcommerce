package com.wordpress.admin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.wordpress.admin.AdminDashBoardPO;
import pageObjects.wordpress.admin.AdminLoginPO;
import pageObjects.wordpress.admin.AdminPostAddNewPO;
import pageObjects.wordpress.admin.AdminPostSearchPO;
import pageObjects.wordpress.admin.PageGeneratorManager;

public class Post_01_Create_Read_Update_Delete_Update_Search extends BaseTest {
	
	String adminUsername = "admin";
	String adminPassword = "123456";
	String searchPostUrl;
	int  randomNumber = generateFakeNumber();
	String postTitleValue = "Title " + randomNumber;
	String postBodyValue = "Body " + randomNumber;
	
	@Parameters({ "browser", "urlAdmin"})
	@BeforeClass
	public void beforeClass(String browserName, String adminUrl) {
		log.info("Pre-Condition - Step 01: Open browser and admin Url");
		driver = getBrowserDriver(browserName, adminUrl);
		adminLoginPage = PageGeneratorManager.getAdminLoginPage(driver);

		
		log.info("Pre-Condition - Step 02: Enter to UserName textbox");
		adminLoginPage.inputToUserNameTextbox(adminUsername);
		
		log.info("Pre-Condition - Step 03: Enter to Password textbox");
		adminLoginPage.inputToPasswordTextbox(adminPassword);
		
		log.info("Pre-Condition - Step 04: Click to Login button");
		adminDashBoardPage = adminLoginPage.clickToLoginButton();
				
	}
	
	@Test
	public void Post_01_Create_new_Post() {
		log.info("Create_Post - Step 01: Click to 'Post' menu link");
		adminPostSearch = adminDashBoardPage.clickToPostMenuLink();
		
		log.info("Create_Post - Step 02: Get 'Search Posts' url");
		searchPostUrl = adminPostSearch.getPageUrl(driver);
		
		log.info("Create_Post - Step 03: Click to 'Add New' button");
		adminPostAddNewPage = adminPostSearch.clickToAddNewButton();
		
		log.info("Create_Post - Step 04: Enter to post title");
		adminPostAddNewPage.enterToAddNewPostTitle(postTitleValue);
		
		log.info("Create_Post - Step 05: Enter to body");
		adminPostAddNewPage.enterToAddnewPostBody(postBodyValue );
		
		log.info("Create_Post - Step 06: Click to 'Publish' button");
		adminPostAddNewPage.clickToPublishButton();
		
		log.info("Create_Post - Step 07: Click to 'PrePublish' button");
		adminPostAddNewPage.clickToPrePublishButton();
		
		log.info("Create_Post - Step 08: Verify 'Post published' message is displayed");
		verifyTrue(adminPostAddNewPage.isPostMessageIsDisplayed());
	}
	

	@Test
	public void Post_02_Search_Post() {
		log.info("Search_Post - Step 01: Open 'Search Post' page");
		adminPostAddNewPage.openSearchPostPageUrl(searchPostUrl);
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserDriver();
	}
	
	private WebDriver driver;
	private AdminLoginPO adminLoginPage;
	private AdminDashBoardPO adminDashBoardPage;
	private AdminPostAddNewPO adminPostAddNewPage;
	private AdminPostSearchPO adminPostSearch;

}
