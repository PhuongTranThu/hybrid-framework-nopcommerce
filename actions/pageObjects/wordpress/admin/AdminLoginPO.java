package pageObjects.wordpress.admin;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.wordpress.admin.AdminLoginPageUI;

public class AdminLoginPO extends BasePage{

	public AdminLoginPO (WebDriver driver) {
		this.driver = driver;
	}
	
	private WebDriver driver;

	public void inputToUserNameTextbox(String valueUserName) {
		waitForElementVisible(driver, AdminLoginPageUI.USER_NAME_TEXTBOX);
		senkeyToElement(driver, AdminLoginPageUI.USER_NAME_TEXTBOX, valueUserName);
		
	}

	public void inputToPasswordTextbox(String valuePassword) {
		waitForElementVisible(driver, AdminLoginPageUI.PASSWORD_TEXTBOX);
		senkeyToElement(driver, AdminLoginPageUI.PASSWORD_TEXTBOX, valuePassword);
		
	}

	public AdminDashBoardPO clickToLoginButton() {
		waitForElementVisible(driver, AdminLoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, AdminLoginPageUI.LOGIN_BUTTON);
		return PageGeneratorManager.getAdminDashBoardPage(driver);
	}
}
