package pageaction;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.PdtHomePageUI;

public class PdtHomePageObject extends BasePage {

	public PdtHomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	private WebDriver driver;

	public void inputToEmailAdress(String emailAdress) {
		waitForElementVisible(driver, PdtHomePageUI.EMAIL_TEXTBOX);
		senkeyToElement(driver, PdtHomePageUI.EMAIL_TEXTBOX, emailAdress);

	}

	public void inputToPassword(String password) {
		waitForElementVisible(driver, PdtHomePageUI.PASSWORD_TEXTBOX);
		senkeyToElement(driver, PdtHomePageUI.PASSWORD_TEXTBOX, password);

	}

	public void clickToButtonLogin() {
		waitForElementClickable(driver, PdtHomePageUI.LOGIN_BUTTON);
		clickToElement(driver, PdtHomePageUI.LOGIN_BUTTON);

	}

	public void hoverToQuestionContractualise() {
		waitForElementVisible(driver, PdtHomePageUI.QUESTION_CONTRACTUALISE_TOOL_TIP);
		hoverMouseToElement(driver, PdtHomePageUI.QUESTION_CONTRACTUALISE_TOOL_TIP);

	}

	public void hoverToQuestionDemande() {
		waitForElementVisible(driver, PdtHomePageUI.QUESTION_DEMANDE_TOOL_TIP);
		hoverMouseToElement(driver, PdtHomePageUI.QUESTION_DEMANDE_TOOL_TIP);

	}

	public void hoverToQuestionFluxAssocie() {
		waitForElementVisible(driver, PdtHomePageUI.QUESTION_FLUX_ASSOCIE_TOOL_TIP);
		hoverMouseToElement(driver, PdtHomePageUI.QUESTION_FLUX_ASSOCIE_TOOL_TIP);

	}

	public String getTextToContractualise() {
		waitForElementVisible(driver, PdtHomePageUI.CONTRACTUALISE_TEXT);
		return getElementText(driver, PdtHomePageUI.CONTRACTUALISE_TEXT);

	}

	public void clickToQuestion() {
		waitForElementClickable(driver, PdtHomePageUI.QUESTION_BUTTON);
		clickToElement(driver, PdtHomePageUI.QUESTION_BUTTON);
	}

	public String getTextToDemande() {
		waitForElementVisible(driver, PdtHomePageUI.DEMANDE_TEXT);
		return getElementText(driver, PdtHomePageUI.DEMANDE_TEXT);
	}

	public String getTextToFlux() {
		waitForElementVisible(driver, PdtHomePageUI.FLUX_ASSOCIE_TEXT);
		return getElementText(driver, PdtHomePageUI.FLUX_ASSOCIE_TEXT);
	}

	public void clickToCreatLink() {
		waitForElementClickable(driver, PdtHomePageUI.CREATE_LINK);
		clickToElement(driver, PdtHomePageUI.CREATE_LINK);

	}

}
