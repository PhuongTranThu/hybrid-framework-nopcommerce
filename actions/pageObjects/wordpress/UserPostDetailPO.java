package pageObjects.wordpress;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.wordpress.admin.UserHomePageUI;
import pageUIs.wordpress.admin.UserPostDetailPageUI;

public class UserPostDetailPO extends BasePage{
	public UserPostDetailPO (WebDriver driver) {
		this.driver = driver;
	}
	
	private WebDriver driver;

	public boolean isPostInforDisplayedWithPostTitle(String postTitle) {
		waitForElementVisible(driver, UserPostDetailPageUI.POST_TITLE_TEXT, postTitle);
		return isElementDisplayed(driver, UserPostDetailPageUI.POST_TITLE_TEXT, postTitle);
	}

	public boolean isPostInforDisplayedWithPostBody(String postTitle, String postBody) {
		waitForElementVisible(driver, UserPostDetailPageUI.POST_BODY_TEXT_BY_POST_TITLE, postTitle, postBody);
		return isElementDisplayed(driver, UserPostDetailPageUI.POST_BODY_TEXT_BY_POST_TITLE, postTitle, postBody);
	}

	public boolean isPostInforDisplayedWithPostAuthor(String postTitle,String authorName) {
		waitForElementVisible(driver, UserPostDetailPageUI.POST_AUTHOR_TEXT_BY_POST_TITLE, postTitle, authorName);
		return isElementDisplayed(driver, UserPostDetailPageUI.POST_AUTHOR_TEXT_BY_POST_TITLE, postTitle, authorName);
	}

	public boolean isPostInforDisplayedWithPostCurrentDay(String postTitle,String currentDay) {
		waitForElementVisible(driver, UserPostDetailPageUI.POST_CURRENT_DATE_TEXT_BY_POST_TITLE, postTitle, currentDay);
		return isElementDisplayed(driver, UserPostDetailPageUI.POST_CURRENT_DATE_TEXT_BY_POST_TITLE, postTitle, currentDay);
	}

	public UserPostDetailPO clickToPostTitle(String postTitle) {
		waitForElementClickable(driver, UserPostDetailPageUI.POST_TITLE_TEXT, postTitle);
		clickToElement(driver, UserPostDetailPageUI.POST_TITLE_TEXT, postTitle);
		return PageGeneratorManager.getUserPostDetail(driver);
	}
}
