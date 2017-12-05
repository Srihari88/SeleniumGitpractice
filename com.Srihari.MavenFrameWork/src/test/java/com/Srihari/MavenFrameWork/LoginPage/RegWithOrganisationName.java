package com.Srihari.MavenFrameWork.LoginPage;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.Srihari.MavenFrameWork.testBase.testBase;
import com.Srihari.MavenFrameWork.uiActions.HomePage;

public class RegWithOrganisationName extends testBase {

	HomePage home;
	// testBase tb;

	@BeforeTest
	public void setup() {
		init();
	}

	@Test
	public void VerifyRegistraion() throws Exception {

		HomePage home = new HomePage(driver);
		home.RegisterApplication("TxER", "coccZu", "edERuy", "srisri.pudu+7r0tE35@gmail.com", "AppleSIEphone", "password",
				"password");
		home.screenshot();
		Thread.sleep(7000);
		home.Refresh();

	}

	@AfterTest
	public void endTest() {
		driver.close();

	}

}
