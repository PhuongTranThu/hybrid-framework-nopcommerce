package javaException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceptionType {
	FirefoxDriver driver;

	@Test
	public void TC_01() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.get("http://live.techpanda.org/index.php/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//div[@id='header-account']//a[text()='My Account']")).click();

	}

	@Test
	public void TC_02() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.get("https://automationfc.github.io/basic-form/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("#disable_password")).sendKeys("123");

	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
