package com.Srihari.MavenFrameWork.LoginPage;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.Srihari.MavenFrameWork.testBase.testBase;
import com.Srihari.MavenFrameWork.uiActions.HomePage;

public class RegistrationFourmValidations extends testBase {

	HomePage home;

	@BeforeTest
	public void setup() {
		init();
	}

	@Test(priority = 0)
	public void VerifyRegisterButton() {
		home = new HomePage(driver);
		home.RegisterButton();
	}

	@Test(priority = 1)
	public void EmailValidation() throws Exception {
		home = new HomePage(driver);
		home.EmailValidation("PremaSE", "BadEDa", "PadDEina", "password", "password");
		home.Verification();
		home.FirstnameValidation("odimda", "ldEja", "srihari.naidu+odied@misport.com", "password", "password");
		home.FirstNameVerification();
	}
	
	@Test(priority = 2)
	public void NicknameValidation() throws Exception {
		home = new HomePage(driver);
		home.FirstnameValidation("odimda", "ldEja", "srihari.naidu+odied@misport.com", "password", "password");
		home.FirstNameVerification();
	}
	@AfterTest
	public void endTest() {
		 driver.close();

	}

}
