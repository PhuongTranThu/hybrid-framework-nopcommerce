package pageObjects.wordpress;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.wordpress.admin.AdminDashboardPageUI;

public class AdminDashBoardPO extends BasePage{
	
	public AdminDashBoardPO (WebDriver driver) {
		this.driver = driver;
	}
	
	private WebDriver driver;

	public AdminPostSearchPO clickToPostMenuLink() {
		waitForElementVisible(driver, AdminDashboardPageUI.POSTS_LINK);
		clickToElement(driver, AdminDashboardPageUI.POSTS_LINK);
		return PageGeneratorManager.getAdminPostSearchPage(driver);
		
	}
	

}
