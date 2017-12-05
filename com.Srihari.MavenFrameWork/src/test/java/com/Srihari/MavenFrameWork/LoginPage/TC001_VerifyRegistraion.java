package com.Srihari.MavenFrameWork.LoginPage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.logging.Logger;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.Srihari.MavenFrameWork.testBase.testBase;
import com.Srihari.MavenFrameWork.uiActions.HomePage;

public class TC001_VerifyRegistraion extends testBase {

	public static final Logger log = Logger.getLogger(TC001_vefifyLoginPageWithInvalidCredentials.class.getName());

	HomePage home;
	// testBase tb;

	@BeforeTest
	public void setup() {
		init();
	}

	@Test
	public void VerifyRegistraion() throws Exception {

		log.info("========Starting the TC002_VerifyRegistraion===== ");
		HomePage home = new HomePage(driver);
		home.RegisterApplication("Thrors", "couyeZ", "koKriu", "srisri.pudu+8503@gmail.com","Bhaubali", "password", "password");
		log.info("========Finished the TC002_VerifyRegistraion===== ");
		Thread.sleep(7000);
		home.Refresh();
		home.shortName_Validtion("Alol", "oeWorld", "Fddu", "srisri.pudu+64@gmail.com", "password", "password");
	}

	@AfterTest
	public void endTest() {
		 driver.close();
	}

}
