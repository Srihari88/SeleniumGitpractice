package com.Srihari.MavenFrameWork.LoginPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Srihari.MavenFrameWork.testBase.testBase;
import com.Srihari.MavenFrameWork.uiActions.HomePage;

public class GoolgePlaystore extends testBase {

	HomePage home;

	@BeforeTest
	public void setup() {
		init();
	}

	@Test(priority = 1)
	public void PlayStore_link() throws Exception {
		home = new HomePage(driver);
		home.GooglePlayStoreLink();
		driver.close();
	}


}
