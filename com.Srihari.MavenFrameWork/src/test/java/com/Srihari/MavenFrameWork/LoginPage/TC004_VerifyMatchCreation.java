package com.Srihari.MavenFrameWork.LoginPage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.logging.Logger;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import com.Srihari.MavenFrameWork.testBase.testBase;
import com.Srihari.MavenFrameWork.uiActions.HomePage;
import com.Srihari.MavenFrameWork.uiActions.Portal_Player;

public class TC004_VerifyMatchCreation extends testBase {

	public static final Logger log = Logger.getLogger(TC001_vefifyLoginPageWithInvalidCredentials.class.getName());
	HomePage home;
	Portal_Player plyaerportal;

	@BeforeTest
	public void Setup() {
		init();
	}

	@Test
	public void VerifyMatchCreation() throws Exception {
		log.info("========Starting the vefifyLoginPageWithInvalidCredentials=====");
		HomePage home = new HomePage(driver);
		home.LoginApplication("sree.hari", "9010satya");
		log.info("========Finished the vefifyLoginPageWithInvalidCredentials=====");

		plyaerportal = new Portal_Player(driver);
		log.info("========Starting the match score test=====");
		plyaerportal.EnterMatchScoreDetails("KeeGohil", "WorldLeague", "Gurgaon", "Cheat", "BlackSheep", "34", "56",
				"3", "23", "3", "4", "2", "1", "1", "1");
		log.info("========Finished the Matchscored test=====");
		Thread.sleep(7000);
	}

	@AfterTest
	public void EndDriver() {
		driver.close();
	}
}
