package com.wordpress.admin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
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
	String authorName;
	String currentDay = getCurrentDate();
	String adminUrl, endUserUrl;
	
	@Parameters({ "browser", "urlAdmin"})
	@BeforeClass
	public void beforeClass(String browserName, String adminUrl, String endUserUrl) {
		log.info("Pre-Condition - Step 01: Open browser and admin Url");
		driver = getBrowserDriver(browserName, this.adminUrl);
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
		adminPostSearchPage = adminDashBoardPage.clickToPostMenuLink();
		
		log.info("Create_Post - Step 02: Get 'Search Posts' url");
		searchPostUrl = adminPostSearchPage.getPageUrl(driver);
		
		log.info("Create_Post - Step 03: Click to 'Add New' button");
		adminPostAddNewPage = adminPostSearchPage.clickToAddNewButton();
		
		log.info("Create_Post - Step 04: Enter to post title");
		adminPostAddNewPage.enterToAddNewPostTitle(postTitle);
		
		log.info("Create_Post - Step 05: Enter to body");
		adminPostAddNewPage.enterToAddnewPostBody(postBody );
		
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
		adminPostSearchPage = adminPostAddNewPage.openSearchPostPageUrl(searchPostUrl);
		
		log.info("Search_Post - Step 02: Enter to Search textbox");
		adminPostSearchPage.enterToSearchTextbox(postTitle);
		
		log.info("Search_Post - Step 03: Click to 'Search Posts' button");
		adminPostSearchPage.clickToSearchPostsButton();
		
		log.info("Search_Post - Step 04: Verify Search table contains '" + postTitle + "'");
		verifyTrue(adminPostSearchPage.isPostSearchTableDisplayed("title", postTitle));
		
		log.info("Search_Post - Step 05: Verify Search table contains '" + authorName + "'");
		verifyTrue(adminPostSearchPage.isPostSearchTableDisplayed("author", authorName));
		
		log.info("Search_Post - Step 06: Open End User site");
		userHomePage = adminPostSearchPage.openEndUserSite(driver, this.endUserUrl);
		
		log.info("Search_Post - Step 07: Verify Post infor displayed at Home page");
		verifyTrue(userHomePage.isPostInforDisplayedWithPostTitle(postTitle));
		verifyTrue(userHomePage.isPostInforDisplayedWithPostBody(postTitle, postBody));
		verifyTrue(userHomePage.isPostInforDisplayedWithPostAuthor(postTitle, authorName));
		verifyTrue(userHomePage.isPostInforDisplayedWithPostCurrentDay(postTitle, currentDay));
		
		log.info("Search_Post - Step 08: Click to Post title");
		userHomePage.clickToPostTitle(postTitle);
		
		log.info("Search_Post - Step 09: Verify Post infor displayed at Post detail page");
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
