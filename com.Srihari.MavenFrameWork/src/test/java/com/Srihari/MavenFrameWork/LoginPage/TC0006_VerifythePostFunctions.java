package com.Srihari.MavenFrameWork.LoginPage;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.Srihari.MavenFrameWork.testBase.testBase;
import com.Srihari.MavenFrameWork.uiActions.HomePage;
import com.Srihari.MavenFrameWork.uiActions.Newsfeed;

public class TC0006_VerifythePostFunctions extends testBase {

	HomePage home;
	Newsfeed feed;

	@BeforeTest
	public void setup() {
		init();
	}

	@Test
	public void VerifyPostfunctions() throws Exception {

		HomePage home = new HomePage(driver);
		home.LoginApplication("Arun22", "sree");

		Thread.sleep(10000);

		Newsfeed feed = new Newsfeed(driver);
		feed.SharePostOptions();
	}

	@AfterTest
	public void endTest() {
		 driver.close();
	}

}
