package com.Srihari.MavenFrameWork.LoginPage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.Srihari.MavenFrameWork.testBase.testBase;
import com.Srihari.MavenFrameWork.uiActions.HomePage;

public class TC005_SideStripeNig extends testBase {

	HomePage home;

	@BeforeTest
	public void Setup() {
		init();
	}

	@Test
	public void SideStripeNig() throws Exception {

		home = new HomePage(driver);
		home.LoginApplication("david.davidson", "likewelt");

		home.CheckAllLinks();

	}

	@AfterTest
	public void EndDriver() {
		// driver.close();
	}
}
