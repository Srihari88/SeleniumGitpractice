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

public class TC_01_OpenWorkLoad extends testBase {

	HomePage home;
	Workload WLM;

	public static final Logger log = Logger.getLogger(TC001_vefifyLoginPageWithInvalidCredentials.class.getName());

	@BeforeTest
	public void setup() {
		init();
	}

	@Test(priority = 0)
	public void OpenWorkload() throws Exception {
		log.info("========Starting the test case with correct valid details=====");
		HomePage home = new HomePage(driver);
		home.LoginApplication("david.davidson", "likewelt");
		log.info("========Finished the test case correct details =====");
		Thread.sleep(10000);
	}

	@Test(priority = 1)
	public void WorkloadOpen() throws Exception {
		WLM = new Workload(driver);
		Reporter.log("====== Start Test=====", true);
		WLM.GoPortal();
		Reporter.log("====== Work load page opened =====", true);

	}

	@Test(priority = 2)
	public void AddWorkLoad() throws Exception {
		WLM = new Workload(driver);
		Reporter.log("====== Start add work load values =====", true);
		WLM.WorkLoadManagementEntiy("57");
		Reporter.log("====== Added workload values =====", true);
		Thread.sleep(3000);

	}

	@Test(priority = 3)
	public void IndoorLeague() throws Exception {
		WLM = new Workload(driver);
		Reporter.log("====== Start Adding the workload =====", true);
		WLM.IndoorLeagueWorkload("83");
		Reporter.log("====== Added successfully =====", true);
		Thread.sleep(3000);

	}

	@Test(priority = 4)
	public void ConcreteWorkLoadValue() throws Exception {
		WLM = new Workload(driver);
		Reporter.log("====== Start Adding the ConcreteWorkload =====", true);
		WLM.TestConcreteWorkLoad("12");
		Reporter.log("====== Added successfully =====", true);
		Thread.sleep(3000);

	}

	@Test(priority = 5)
	public void IndoorCricketCentreWorkLoadValues() throws Exception {
		WLM = new Workload(driver);
		Reporter.log("====== Start Adding the IndoorCricketCentreWorkLoadValues =====", true);
		WLM.TestIndoorCricketCentre("22");
		Reporter.log("====== Added successfully =====", true);
		Thread.sleep(3000);

	}

	@Test(priority = 6)
	public void OutdoorNetwGrassWorkLoad() throws Exception {
		WLM = new Workload(driver);
		Reporter.log("====== Start Adding the OutdoorNetwGrassWorkLoad =====", true);
		WLM.TestOutdoorNetGrass("32");
		Reporter.log("====== Added successfully =====", true);
		Thread.sleep(3000);
	}

	@Test(priority = 7)
	public void OutdoorNetwMattingWorkLoad() throws Exception {
		WLM = new Workload(driver);
		Reporter.log("====== Start Adding the OutdoorNetwMattingWorkLoad =====", true);
		WLM.TestOutdoorNetMatting("42");
		Reporter.log("====== Added successfully =====", true);
		Thread.sleep(3000);
	}

	@Test(priority = 8)
	public void SprungFloorwCricketMatWorkLoad() throws Exception {
		WLM = new Workload(driver);
		Reporter.log("====== Start Adding the SprungFloorwCricketMatWorkLoad =====", true);
		WLM.TestSprungFloorCricketMat("52");
		Reporter.log("====== Added successfully =====", true);
		Thread.sleep(3000);
	}

	@Test(priority = 9)
	public void WoodenSprungFloorSportsHall() throws Exception {
		WLM = new Workload(driver);
		Reporter.log("====== Start Adding the WoodenSprungFloorSportsHall =====", true);
		WLM.TestSprungWoodenSprungFlooSportsHall("62");
		Reporter.log("====== Added successfully =====", true);
		Thread.sleep(3000);
	}

	@Test(priority = 10)
	public void ChangeGraphs() throws Exception {
		WLM = new Workload(driver);
		Reporter.log("====== Changed the tha graphs =====", true);
		WLM.Changetabs();
		Reporter.log("====== All tabs changed successfully =====", true);

	}

	@Test(priority = 11)
	public void EditWorkloadValues() throws Exception {
		WLM = new Workload(driver);
		Reporter.log("====== Start edit values =====", true);
		WLM.EditMatchValues("77");
		Reporter.log("====== Values edited successfully =====", true);

	}

	@Test(priority = 12)
	public void DeleteWorkloadValues() throws Exception {
		WLM = new Workload(driver);
		Reporter.log("====== Start Delete values =====", true);
		WLM.DeleteWorkLoad();
		Reporter.log("====== Values deleted successfully =====", true);

	}

	@AfterTest
	public void endTest() {
		driver.close();
	}

	@Test(priority = 13)
	public void RegisterCoachAccount() throws Exception {
		log.info("========Starting the test case with correct valid details=====");
		HomePage home = new HomePage(driver);
		setup();
		home.LoginApplication("Anthony.admanstate", "mesabone");
		log.info("========Finished the test case correct details =====");
		Thread.sleep(10000);
	}

	@Test(priority = 14)
	public void ApplySearchFilterTest() throws Exception {
		Reporter.log("====== Player Filter =====", true);
		WLM = new Workload(driver);
		WLM.PlayerManagementFilterPlayer("David");
		Reporter.log("====== End Filter  =====", true);
	}

	@Test(priority = 15)
	public void PlayerWorkloadOpen() throws Exception {
		Reporter.log("====== CheckWorkload values =====", true);
		WLM = new Workload(driver);
		WLM.CheckWork();
		Reporter.log("====== Results showing successfully =====", true);

	}

}
