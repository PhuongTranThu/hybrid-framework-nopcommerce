package functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageaction.PdtHomePageObject;
import pageaction.PdtNouvellePageObject;

public class UC74_Indicator {

	private WebDriver driver;
	private String projectPath = System.getProperty("user.dir");
	private PdtHomePageObject homePagePDT;
	private PdtNouvellePageObject nouvellePagePDT;
	private String emailAdress, password, textContractualise, textDemande, textFlux, textConcerne, textFacture, textCode;
	private String textSociete, textFacturation, textAgence, textExploitant, textDu, textAu, textDuree;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver");
		driver = new FirefoxDriver();
		homePagePDT = new PdtHomePageObject(driver);
		nouvellePagePDT = new PdtNouvellePageObject(driver);

		emailAdress = "admin@bfast-vn.net";
		password = "1";
		textContractualise = "Nombre de lignes contractualisées que vous avez saisies dans Plan de Transport.";
		textDemande = "Nombre de lignes que vous avez saisies dans Plan de Transport et n'ayant aucune Demande Client. Celles-ci se retrouvent dans la liste des Lignes à Compléter.";
		textFlux = "Taux de flux ayant un transporteur associé, dans la partie Transporteurs, sur l'ensemble des lignes que vous avez saisies dans Plan de Transport.";
		textConcerne = "Client principal pour lequel cette ligne est réalisée.";
		textFacture = "Client facturé quand cette ligne est réalisée.";
		textCode = "Commercial référent, ayant suivi l'appel d'offres ou principal interlocuteur du Client concerné. Le Commercial doit être lié au Client concerné dans Salesforce.";
		textSociete = "Société gérant cette ligne.";
		textFacturation = "Société facturant cette ligne.";
		textAgence = "Agence gérant cette ligne.";
		textExploitant = "Exploitant gérant cette ligne.";
		textDu = "Date de départ du contrat de la ligne.";
		textAu = "Date de fin du contrat de la ligne.";
		textDuree = "À cocher si nous voulons compléter en durée depuis la date de départ.";

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://plandetransport.pprod.cloud.transalliance.eu/login");

	}

	@Test
	public void TC_01_HomePage() {
		System.out.println("Step 01: Login");

		homePagePDT.inputToEmailAdress(emailAdress);
		homePagePDT.inputToPassword(password);
		sleepInSecond(2);

		homePagePDT.clickToButtonLogin();
		sleepInSecond(2);

		System.out.println("Step 02: Click question");
		homePagePDT.clickToQuestion();
		homePagePDT.hoverToQuestionContractualise();
		sleepInSecond(2);
		Assert.assertEquals(homePagePDT.getTextToContractualise(), textContractualise);

		homePagePDT.hoverToQuestionDemande();
		Assert.assertEquals(homePagePDT.getTextToDemande(), textDemande);
		homePagePDT.hoverToQuestionFluxAssocie();
		Assert.assertEquals(homePagePDT.getTextToFlux(), textFlux);

		homePagePDT.clickToCreatLink();
		nouvellePagePDT.clickToCreateButton();
		sleepInSecond(2);

		nouvellePagePDT.hoverToConcerneToolTip();
		Assert.assertEquals(nouvellePagePDT.getTextToConcerne(), textConcerne);
		nouvellePagePDT.hoverToFactureToolTip();
		Assert.assertEquals(nouvellePagePDT.getTextToFacture(), textFacture);
		sleepInSecond(5);
		nouvellePagePDT.clickToConfirmButton();

		nouvellePagePDT.hoverToCodeToolTip();
		Assert.assertEquals(nouvellePagePDT.getTextToCode(), textCode);
		sleepInSecond(5);
		nouvellePagePDT.clickToConfirmButton();

//		nouvellePagePDT.hoverToSocieteToolTip();
//		Assert.assertEquals(nouvellePagePDT.getTextToSociete(), textSociete);
		nouvellePagePDT.hoverToFacturationToolTip();
		Assert.assertEquals(nouvellePagePDT.getTextToFacturation(), textFacturation);
		nouvellePagePDT.hoverToAgenceToolTip();
		Assert.assertEquals(nouvellePagePDT.getTextToAgence(), textAgence);
		nouvellePagePDT.hoverToExploitantToolTip();
		Assert.assertEquals(nouvellePagePDT.getTextToExploitant(), textExploitant);
		sleepInSecond(10);
		nouvellePagePDT.clickToConfirmButton();

		nouvellePagePDT.hoverToDuToolTip();
		Assert.assertEquals(nouvellePagePDT.getTextToDu(), textDu);
		nouvellePagePDT.hoverToAuToolTip();
		Assert.assertEquals(nouvellePagePDT.getTextToAu(), textAu);
		nouvellePagePDT.hoverToDureeToolTip();
		Assert.assertEquals(nouvellePagePDT.getTextToDuree(), textDuree);

//		nouvellePagePDT.hoverToIndiceToolTip();
//		Assert.assertEquals(nouvellePagePDT.getTextToIndice(), );
//		nouvellePagePDT.hoverToPrixToolTip();
//		Assert.assertEquals(nouvellePagePDT.getTextToPrix(), );
//		nouvellePagePDT.hoverToNomToolTip();
//		Assert.assertEquals(nouvellePagePDT.getTextToNom(), );
//		nouvellePagePDT.hoverToValeurToolTip();
//		Assert.assertEquals(nouvellePagePDT.getTextToValuer(), );
//		nouvellePagePDT.hoverToPartToolTip();
//		Assert.assertEquals(nouvellePagePDT.getTextToPart(), );
//		nouvellePagePDT.hoverToFreToolTip();
//		Assert.assertEquals(nouvellePagePDT.getTextToFre(), );
//		nouvellePagePDT.hoverToTunnelToolTip();
//		Assert.assertEquals(nouvellePagePDT.getTextToTunnel(), );

	}

	@AfterClass
	public void afterClass() {
		driver.quit();

	}

	public void sleepInSecond(long timeInSecond) {
		try {
			Thread.sleep(timeInSecond * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
