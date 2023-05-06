package pageObjects.wordpress.admin;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.wordpress.admin.AdminPostAddNewPageUI;

public class AdminPostAddNewPO extends BasePage{

	public AdminPostAddNewPO (WebDriver driver) {
		this.driver = driver;
	}
	
	private WebDriver driver;

	public void enterToAddNewPostTitle(String valueTitle) {
		waitForElementVisible(driver, AdminPostAddNewPageUI.TITLE_TEXTBOX);
		senkeyToElement(driver, AdminPostAddNewPageUI.TITLE_TEXTBOX, valueTitle);
		
	}

	public void enterToAddnewPostBody(String valueBody) {
		waitForElementClickable(driver, AdminPostAddNewPageUI.BODY_BUTTON);
		clickToElement(driver, AdminPostAddNewPageUI.BODY_BUTTON);
		
		waitForElementVisible(driver, AdminPostAddNewPageUI.BODY_TEXTBOX);
		senkeyToElement(driver, AdminPostAddNewPageUI.BODY_TEXTBOX, valueBody);
		
	}

	public void clickToPublishButton() {
		waitForElementVisible(driver, AdminPostAddNewPageUI.PUBLISH_BUTTON);
		clickToElement(driver, AdminPostAddNewPageUI.PUBLISH_BUTTON);
	}
	

	public void clickToPrePublishButton() {
		waitForElementVisible(driver, AdminPostAddNewPageUI.PRE_PUBLISH_BUTTON);
		clickToElement(driver, AdminPostAddNewPageUI.PRE_PUBLISH_BUTTON);
		
	}

	public boolean isPostMessageIsDisplayed() {
		waitForElementVisible(driver, AdminPostAddNewPageUI.PUBLISHED_MESSAGE);
		return isElementDisplayed(driver, AdminPostAddNewPageUI.PUBLISHED_MESSAGE);
		
	}

	public AdminPostSearchPO openSearchPostPageUrl(String searchPostUrl) {
		openPageUrl(driver, searchPostUrl);
		return PageGeneratorManager.getAdminPostSearchPage(driver);
		
	}


}
