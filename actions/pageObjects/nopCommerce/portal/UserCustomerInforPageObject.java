package pageObjects.nopCommerce.portal;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.portal.UserCustomerInforPageUI;

public class UserCustomerInforPageObject extends BasePage {

	public UserCustomerInforPageObject(WebDriver driver) {
		this.driver = driver;
	}

	private WebDriver driver;

	public boolean isCustomerInforPageDisplayed() {
		waitForElementVisible(driver, UserCustomerInforPageUI.CUSTOMER_INFOR_HEADER);
		return isElementDisplayed(driver, UserCustomerInforPageUI.CUSTOMER_INFOR_HEADER);
	}

}
