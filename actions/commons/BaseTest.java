package commons;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	private WebDriver driver;

	protected WebDriver getBrowserDriver(String browserName) {
		BrowserName browser = BrowserName.valueOf(browserName.toUpperCase());

		switch (browser) {
		case FIREFOX:
			driver = WebDriverManager.firefoxdriver().create();
			break;

		case CHROME:
			driver = WebDriverManager.chromedriver().create();
			break;

		case EDGE:
			driver = WebDriverManager.edgedriver().create();
			break;

		case OPERA:
			driver = WebDriverManager.operadriver().create();
			break;

		default:
			throw new RuntimeException("Browser is invalid");
		}

		driver.get(GlobalConstants.PORTAL_PAGE_URL);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}

	private String getEnvironmentUrl(String serverName) {
		String envUrl = null;
		EnvironmentList environment = EnvironmentList.valueOf(serverName.toUpperCase());
		if (environment == EnvironmentList.DEV) {
			envUrl = "https://demo.nopcommerce.com";
		} else if (environment == EnvironmentList.TESTING) {
			envUrl = "https://demo.nopcommerce.com";
		} else if (environment == EnvironmentList.STAGING) {
			envUrl = "";
		} else if (environment == EnvironmentList.PRODUCTION) {
			envUrl = "";
		}
		return envUrl;

	}

	public int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);
	}

}
