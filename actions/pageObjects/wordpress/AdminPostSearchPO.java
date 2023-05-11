package pageObjects.wordpress;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.wordpress.admin.AdminPostSearchPageUI;

public class AdminPostSearchPO extends BasePage{

	public AdminPostSearchPO (WebDriver driver) {
		this.driver = driver;
	}
	
	private WebDriver driver;

	public AdminPostAddNewPO clickToAddNewButton() {
		waitForElementVisible(driver, AdminPostSearchPageUI.ADD_NEW_BUTTON);
		clickToElement(driver, AdminPostSearchPageUI.ADD_NEW_BUTTON);
		return PageGeneratorManager.getAdminPostAddNewPage(driver);
		
	}

	public void enterToSearchTextbox(String postTitle) {
		waitForElementVisible(driver, AdminPostSearchPageUI.SEARCH_POST_TEXTBOX);
		senkeyToElement(driver, AdminPostSearchPageUI.SEARCH_POST_TEXTBOX, postTitle);
		
	}

	public void clickToSearchPostsButton() {
		waitForElementClickable(driver, AdminPostSearchPageUI.SEARCH_POST_BUTTON);
		clickToElement(driver, AdminPostSearchPageUI.SEARCH_POST_BUTTON);
		
	}

	public boolean isPostSearchTableDisplayed(String headerID, String cellValue) {
		int headerIndex = getElementSize(driver, AdminPostSearchPageUI.TABLE_HEADER_INDEX_BY_HEADER_NAME, headerID) + 1;
		waitForElementVisible(driver, AdminPostSearchPageUI.TABLE_HEADER_INDEX_BY_HEADER_NAME, String.valueOf(headerIndex), cellValue);
		return isElementDisplayed(driver, AdminPostSearchPageUI.TABLE_HEADER_INDEX_BY_HEADER_NAME, String.valueOf(headerIndex), cellValue);
	}


}
