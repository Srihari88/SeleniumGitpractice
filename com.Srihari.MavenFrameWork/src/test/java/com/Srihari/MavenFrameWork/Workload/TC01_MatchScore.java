package com.Srihari.MavenFrameWork.Workload;

import org.testng.annotations.Test;
import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import com.Srihari.MavenFrameWork.LoginPage.TC001_vefifyLoginPageWithInvalidCredentials;
import com.Srihari.MavenFrameWork.testBase.testBase;
import com.Srihari.MavenFrameWork.uiActions.HomePage;
import com.Srihari.MavenFrameWork.uiActions.MatchScore;
import com.Srihari.MavenFrameWork.uiActions.Workload;

public class TC01_MatchScore extends testBase {

	HomePage home;
	MatchScore match;
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
		home.LoginApplication("David.Davidson", "likewelt");
		log.info("========Finished the test case correct details =====");
		Thread.sleep(10000);
	}

	@Test(priority = 1)
	public void Match_Score() {
		MatchScore match = new MatchScore(driver);
		try {
			match.AddMatchOnlyWithMatchStats("SriHari", "WorldLeague", "MacBook", "Nice", "40 over", "Club", "RoadSide",
					"Lost", "Grass");
			Assert.assertEquals("Server error", "Server error");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Found the issue somewhere..!!!!");
		}
	}

	@Test(priority = 2)
	public void ValidationOppition() throws InterruptedException {
		MatchScore match = new MatchScore(driver);
		match.OppotionValidation();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void ValidationLeague() throws InterruptedException {
		MatchScore match = new MatchScore(driver);
		match.VenueValidation();
		Thread.sleep(3000);

	}

}
