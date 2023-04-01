package pageObject.bankGuru;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.bankGuru.HomePageUIBankGuru;
import pageUIs.bankGuru.ManagerPageUIBankGuru;
import pageUIs.bankGuru.NewCustomerPageUI;

public class NewCustomerPage extends BasePage {
	
	private WebDriver driver;
	public NewCustomerPage (WebDriver driver) {
		this.driver = driver;
	}
	public ManagerPageObject clickToSubmitButton() {
		waitForElementClickable(driver, HomePageUIBankGuru.SUBMIT_BUTTON);
		clickToElement(driver, HomePageUIBankGuru.SUBMIT_BUTTON);
		return PageGeneratorManager.getManagerPage(driver);
	}
	
	public void inputToAdressTextbox(WebDriver driver, String value) {
		waitForElementVisible(driver, NewCustomerPageUI.ADRESS_TEXTBOX);
		senkeyToElement(driver, NewCustomerPageUI.ADRESS_TEXTBOX, value);
	}

	

}