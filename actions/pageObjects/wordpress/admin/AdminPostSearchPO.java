package pageObjects.wordpress.admin;

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


}
