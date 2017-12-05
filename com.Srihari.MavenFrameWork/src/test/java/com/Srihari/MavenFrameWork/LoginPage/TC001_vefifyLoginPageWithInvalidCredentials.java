package com.Srihari.MavenFrameWork.LoginPage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import java.util.logging.Logger;

import org.testng.annotations.BeforeTest;
import com.Srihari.MavenFrameWork.testBase.testBase;
import com.Srihari.MavenFrameWork.uiActions.HomePage;

public class TC001_vefifyLoginPageWithInvalidCredentials extends testBase {
	public static final Logger log = Logger.getLogger(TC001_vefifyLoginPageWithInvalidCredentials.class.getName());
	HomePage home;

	@BeforeTest
	public void setup() {
		init();
	}

	@Test
	public void vefifyLoginPageWithInvalidCredentials() throws Exception {
		log.info("========Starting the vefifyLoginPageWithInvalidCredentials=====");
		HomePage home = new HomePage(driver);
		home.LoginApplication("Arun22", "sree");
		log.info("========Finished the vefifyLoginPageWithInvalidCredentials=====");
		Thread.sleep(10000);

	}

	@AfterClass
	public void endTest() {
		 driver.close();

	}

}
