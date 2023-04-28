package com.wordpress.admin;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import commons.BaseTest;

public class Post_01_Create_Read_Update_Delete_Update_Search extends BaseTest {
	
	@Parameters({ "browser", "urlAdmin"})
	@BeforeClass
	public void beforeClass(String browserName, String adminUrl) {
		log.info("Pre-Condition - Step 01: Open browser and admin Url");
	}

}
