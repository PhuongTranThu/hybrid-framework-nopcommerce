package pageObject.bankGuru;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
	
	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}
	
	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}
	
	public static NewCustomerPage getNewCustomer(WebDriver driver) {
		return new NewCustomerPage(driver);
	}
	
	public static ManagerPageObject getManagerPage(WebDriver driver) {
		return new ManagerPageObject(driver);
	}

}
