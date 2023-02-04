package com.jquery.datatable;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.jQuery.HomePageObject;
import pageObjects.jQuery.PageGeneratorManager;

public class Level_10_DataTable_DataGrid extends BaseTest {
	List<String> actualAllCountryValues;
	List<String> expectedAllCountryValues;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		homePage = PageGeneratorManager.getHomePageObject(driver);

	}

	public void TC_01_Table_Paging() {
		homePage.openPagingByPageNumber("10");
		Assert.assertTrue(homePage.isPageNumberActived("10"));
		homePage.sleepInSecond(1);

		homePage.openPagingByPageNumber("20");
		homePage.sleepInSecond(1);
		Assert.assertTrue(homePage.isPageNumberActived("20"));

		homePage.openPagingByPageNumber("15");
		homePage.sleepInSecond(1);
		Assert.assertTrue(homePage.isPageNumberActived("15"));

		homePage.openPagingByPageNumber("5");
		homePage.sleepInSecond(1);
		Assert.assertTrue(homePage.isPageNumberActived("5"));

	}

	public void TC_02_Enter_To_Header() {
		homePage.refreshCurrentPage(driver);
		homePage.enterToHeaderTextboxByLabel("Females", "750");
		homePage.enterToHeaderTextboxByLabel("Country", "Aruba");
		homePage.enterToHeaderTextboxByLabel("Males", "756");
		homePage.enterToHeaderTextboxByLabel("Total", "1504");
		homePage.sleepInSecond(3);

	}

	@Test
	public void TC_03() {
		actualAllCountryValues = homePage.getValueEachRowAtAllPage();
		Assert.assertEquals(actualAllCountryValues, expectedAllCountryValues);

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private WebDriver driver;
	HomePageObject homePage;

}
