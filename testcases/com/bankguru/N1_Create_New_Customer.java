package com.bankguru;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObject.bankGuru.LoginPageObject;
import pageObject.bankGuru.PageGeneratorManager;

public class N1_Create_New_Customer extends BaseTest{

	@Parameters ({"browser" , "url"})
	@BeforeClass
	public void beforeClass (String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		loginPage = PageGeneratorManager.getLoginPage(driver);
//		
//		int a= 2;
//		int b= 3;
//		
//		assertEquals(a, b);
		
		
	}
	
	@Test
	public void TC_01() {
		
	}
	@Test
	public void TC_02() {
		
	}
	
	@AfterClass
	public void afterClass() {
		//driver.quit();
		
	}
	
	private WebDriver driver;
	private LoginPageObject loginPage;
	
	
}
