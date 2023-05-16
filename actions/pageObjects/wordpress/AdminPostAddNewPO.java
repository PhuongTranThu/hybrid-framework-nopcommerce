package pageObjects.wordpress;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import io.qameta.allure.Step;
import pageUIs.wordpress.admin.AdminPostAddNewPageUI;

public class AdminPostAddNewPO extends BasePage{

	public AdminPostAddNewPO (WebDriver driver) {
		this.driver = driver;
	}
	
	private WebDriver driver;

	@Step("Enter to Add New Post button with value is {0}")
	public void enterToAddNewPostTitle(String valueTitle) {
		waitForElementVisible(driver, AdminPostAddNewPageUI.TITLE_TEXTBOX);
		senkeyToElement(driver, AdminPostAddNewPageUI.TITLE_TEXTBOX, valueTitle);
		
	}

	@Step("Enter to Add New Post body with value is {0}")
	public void enterToAddnewPostBody(String valueBody) {
		waitForElementClickable(driver, AdminPostAddNewPageUI.BODY_BUTTON);
		clickToElement(driver, AdminPostAddNewPageUI.BODY_BUTTON);
		
		waitForElementVisible(driver, AdminPostAddNewPageUI.BODY_TEXTBOX);
		senkeyToElement(driver, AdminPostAddNewPageUI.BODY_TEXTBOX, valueBody);
		
	}

	@Step("Click to Publish button")
	public void clickToPublishButton() {
		waitForElementVisible(driver, AdminPostAddNewPageUI.PUBLISH_BUTTON);
		clickToElement(driver, AdminPostAddNewPageUI.PUBLISH_BUTTON);
	}
	

	@Step("Click to Pre-Publish button")
	public void clickToPrePublishButton() {
		waitForElementVisible(driver, AdminPostAddNewPageUI.PRE_PUBLISH_BUTTON);
		clickToElement(driver, AdminPostAddNewPageUI.PRE_PUBLISH_BUTTON);
		
	}

	@Step("Verify Post message displayed")
	public boolean isPostMessageIsDisplayed() {
		waitForElementVisible(driver, AdminPostAddNewPageUI.PUBLISHED_MESSAGE);
		return isElementDisplayed(driver, AdminPostAddNewPageUI.PUBLISHED_MESSAGE);
		
	}

	@Step("Open Admin Search page ")
	public AdminPostSearchPO openSearchPostPageUrl(String searchPostUrl) {
		openPageUrl(driver, searchPostUrl);
		return PageGeneratorManager.getAdminPostSearchPage(driver);
		
	}


}
