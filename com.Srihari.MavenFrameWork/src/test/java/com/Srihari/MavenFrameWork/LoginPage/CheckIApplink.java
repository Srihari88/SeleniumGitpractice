package com.Srihari.MavenFrameWork.LoginPage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Srihari.MavenFrameWork.testBase.testBase;
import com.Srihari.MavenFrameWork.uiActions.HomePage;

public class CheckIApplink extends testBase {
	HomePage home;

	@BeforeTest
	public void setup() {
		init();
	}

	@Test(priority = 1)
	public void PlayStore_link() throws InterruptedException {
		home = new HomePage(driver);
		home.IAppstore();
	}
	@AfterTest
	public void close() {
		driver.close();
	}

}
