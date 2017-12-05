package com.Srihari.MavenFrameWork.Workload;

import org.testng.annotations.Test;
import java.util.logging.Logger;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Srihari.MavenFrameWork.LoginPage.TC001_vefifyLoginPageWithInvalidCredentials;
import com.Srihari.MavenFrameWork.testBase.testBase;
import com.Srihari.MavenFrameWork.uiActions.HomePage;
import com.Srihari.MavenFrameWork.uiActions.Workload;

public class TC_02_VerificationTest extends testBase {

	HomePage home;
	Workload WLM;

	public static final Logger log = Logger.getLogger(TC001_vefifyLoginPageWithInvalidCredentials.class.getName());

	@BeforeTest
	public void setup() {
		init();
	}

	@Test(priority = 0)
	public void RegisterCoachAccount() throws Exception {
		log.info("========Starting the test case with correct valid details=====");
		HomePage home = new HomePage(driver);
		home.LoginApplication("Anthony.admanstate", "mesabone");
		log.info("========Finished the test case correct details =====");
		Thread.sleep(8000);
	}

	@Test(priority = 1)
	public void ApplySearchFilterTest() throws Exception {
		Reporter.log("====== Player Filter =====", true);
		WLM = new Workload(driver);
		WLM.PlayerManagementFilterPlayer("David");
		Reporter.log("====== End Filter  =====", true);
	}

	@Test(priority = 2)
	public void PlayerWorkloadOpen() throws Exception {
		Reporter.log("====== CheckWorkload values =====", true);
		WLM = new Workload(driver);
		WLM.CheckWork();
		Reporter.log("====== Results showing successfully =====", true);
	}

	@AfterTest
	public void endTest() {
		driver.close();
	}

}
