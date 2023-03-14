package pageaction;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.PdtNouvellPageUI;

public class PdtNouvellePageObject extends BasePage {

	public PdtNouvellePageObject(WebDriver driver) {
		this.driver = driver;
	}

	private WebDriver driver;

	public void clickToCreateButton() {
		waitForElementClickable(driver, PdtNouvellPageUI.CREATE_BUTTON);
		clickToElement(driver, PdtNouvellPageUI.CREATE_BUTTON);

	}

	public void hoverToConcerneToolTip() {
		waitForElementVisible(driver, PdtNouvellPageUI.CONCERNE_TOOLTIP);
		hoverMouseToElement(driver, PdtNouvellPageUI.CONCERNE_TOOLTIP);

	}

	public void hoverToFactureToolTip() {
		waitForElementVisible(driver, PdtNouvellPageUI.FACTURE_TOOLTIP);
		hoverMouseToElement(driver, PdtNouvellPageUI.FACTURE_TOOLTIP);

	}

	public String getTextToConcerne() {
		waitForElementVisible(driver, PdtNouvellPageUI.CONCERNE_TEXT);
		return getElementText(driver, PdtNouvellPageUI.CONCERNE_TEXT);
	}

//	public String getTextToFacture() {
//		waitForElementVisible(driver, PdtNouvellPageUI.FACTURE_TEXT);
//		return getElementText(driver, PdtNouvellPageUI.FACTURE_TEXT);
//	}

	public void clickToConfirmButton() {
		waitForElementClickable(driver, PdtNouvellPageUI.CONFIRM_BUTTON);
		clickToElement(driver, PdtNouvellPageUI.CONFIRM_BUTTON);

	}

	public void hoverToCodeToolTip() {
		waitForElementVisible(driver, PdtNouvellPageUI.CODE_TOOLTIP);
		hoverMouseToElement(driver, PdtNouvellPageUI.CODE_TOOLTIP);

	}

	public String getTextToCode() {
		waitForElementVisible(driver, PdtNouvellPageUI.CODE_TEXT);
		return getElementText(driver, PdtNouvellPageUI.CODE_TEXT);
	}

	public void hoverToSocieteToolTip() {
		waitForElementVisible(driver, PdtNouvellPageUI.SOCIETE_TOOLTIP);
		hoverMouseToElement(driver, PdtNouvellPageUI.SOCIETE_TOOLTIP);

	}

	public String getTextToSociete() {
		waitForElementVisible(driver, PdtNouvellPageUI.SOCIETE_TEXT);
		return getElementText(driver, PdtNouvellPageUI.SOCIETE_TEXT);
	}

	public void hoverToFacturationToolTip() {
		waitForElementVisible(driver, PdtNouvellPageUI.FACTURATION_TOOLTIP);
		hoverMouseToElement(driver, PdtNouvellPageUI.FACTURATION_TOOLTIP);

	}

	public String getTextToFacturation() {
		waitForElementVisible(driver, PdtNouvellPageUI.FACTURATION_TEXT);
		return getElementText(driver, PdtNouvellPageUI.FACTURATION_TEXT);
	}

	public void hoverToAgenceToolTip() {
		waitForElementVisible(driver, PdtNouvellPageUI.AGENCE_TOOLTIP);
		hoverMouseToElement(driver, PdtNouvellPageUI.AGENCE_TOOLTIP);

	}

	public String getTextToAgence() {
		waitForElementVisible(driver, PdtNouvellPageUI.AGENCE_TEXT);
		return getElementText(driver, PdtNouvellPageUI.AGENCE_TEXT);
	}

	public void hoverToExploitantToolTip() {
		waitForElementVisible(driver, PdtNouvellPageUI.EXPLOITANT_TOOLTIP);
		hoverMouseToElement(driver, PdtNouvellPageUI.EXPLOITANT_TOOLTIP);

	}

	public String getTextToExploitant() {
		waitForElementVisible(driver, PdtNouvellPageUI.EXPLOITANT_TEXT);
		return getElementText(driver, PdtNouvellPageUI.EXPLOITANT_TEXT);
	}

	public String getTextToFacture() {
		waitForElementVisible(driver, PdtNouvellPageUI.FACTURE_TEXT);
		return getElementText(driver, PdtNouvellPageUI.FACTURE_TEXT);
	}

	public void hoverToDuToolTip() {
		waitForElementVisible(driver, PdtNouvellPageUI.DU_TOOLTIP);
		hoverMouseToElement(driver, PdtNouvellPageUI.DU_TOOLTIP);

	}

	public String getTextToDu() {
		waitForElementVisible(driver, PdtNouvellPageUI.DU_TEXT);
		return getElementText(driver, PdtNouvellPageUI.DU_TEXT);
	}

	public void hoverToAuToolTip() {
		waitForElementVisible(driver, PdtNouvellPageUI.AU_TOOLTIP);
		hoverMouseToElement(driver, PdtNouvellPageUI.AU_TOOLTIP);

	}

	public String getTextToAu() {
		waitForElementVisible(driver, PdtNouvellPageUI.AU_TEXT);
		return getElementText(driver, PdtNouvellPageUI.AU_TEXT);
	}

	public void hoverToDureeToolTip() {
		waitForElementVisible(driver, PdtNouvellPageUI.DUREE_TOOLTIP);
		hoverMouseToElement(driver, PdtNouvellPageUI.DUREE_TOOLTIP);

	}

	public String getTextToDuree() {
		waitForElementVisible(driver, PdtNouvellPageUI.DUREE_TEXT);
		return getElementText(driver, PdtNouvellPageUI.DUREE_TEXT);
	}

	public byte[] getTextToIndice() {
		// TODO Auto-generated method stub
		return null;
	}

	public void hoverToIndiceToolTip() {
		// TODO Auto-generated method stub

	}

	public void hoverToPrixToolTip() {
		// TODO Auto-generated method stub

	}

	public byte[] getTextToPrix() {
		// TODO Auto-generated method stub
		return null;
	}

	public void hoverToNomToolTip() {
		// TODO Auto-generated method stub

	}

	public byte[] getTextToNom() {
		// TODO Auto-generated method stub
		return null;
	}

	public void hoverToValeurToolTip() {
		// TODO Auto-generated method stub

	}

	public byte[] getTextToValuer() {
		// TODO Auto-generated method stub
		return null;
	}

	public void hoverToPartToolTip() {
		// TODO Auto-generated method stub

	}

	public byte[] getTextToPart() {
		// TODO Auto-generated method stub
		return null;
	}

	public void hoverToFreToolTip() {
		// TODO Auto-generated method stub

	}

	public byte[] getTextToFre() {
		// TODO Auto-generated method stub
		return null;
	}

	public void hoverToTunnelToolTip() {
		// TODO Auto-generated method stub

	}

	public byte[] getTextToTunnel() {
		// TODO Auto-generated method stub
		return null;
	}
}
