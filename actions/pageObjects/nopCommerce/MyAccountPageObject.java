package pageObjects.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.MyAccountPageUI;

public class MyAccountPageObject extends BasePage {

	public MyAccountPageObject(WebDriver driver) {
		this.driver = driver;
	}

	private WebDriver driver;

	public boolean isMyAccountPageDisplayed() {
		waitForElementVisible(driver, MyAccountPageUI.MY_ACCOUNT_TEXT);
		return isElementDisplayed(driver, MyAccountPageUI.MY_ACCOUNT_TEXT);
	}

}
