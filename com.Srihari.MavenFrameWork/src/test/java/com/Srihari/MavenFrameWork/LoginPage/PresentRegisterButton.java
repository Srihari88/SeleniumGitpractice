package com.Srihari.MavenFrameWork.LoginPage;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.Srihari.MavenFrameWork.testBase.testBase;
import com.Srihari.MavenFrameWork.uiActions.HomePage;

public class PresentRegisterButton extends testBase {

	HomePage home;

	@BeforeTest
	public void setup() {
		init();
	}

	@Test
	public void VerifyRegisterButton() {
		home = new HomePage(driver);
		home.RegisterButton();
	}
	
	@AfterTest
	public void endTest() {
		 driver.close();

	}
}
