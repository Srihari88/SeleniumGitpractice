package com.Srihari.MavenFrameWork.LoginPage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.logging.Logger;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.Srihari.MavenFrameWork.LoginPage.TC001_vefifyLoginPageWithInvalidCredentials;
import com.Srihari.MavenFrameWork.testBase.testBase;
import com.Srihari.MavenFrameWork.uiActions.HomePage;
import com.Srihari.MavenFrameWork.uiActions.Newsfeed;

public class TC003_SharePostOnlyWithme extends testBase {

	public static final Logger log = Logger.getLogger(TC001_vefifyLoginPageWithInvalidCredentials.class.getName());
	HomePage home;
	Newsfeed feed;

	@BeforeTest
	public void Setup() {
		init();
	}

	@Test
	public void SharePostOnlyWithme() throws Exception {

		log.info("========Starting the vefifyLoginPageWithInvalidCredentials=====");
		HomePage home = new HomePage(driver);
		home.LoginApplication("david.davidson", "likewelt");
		log.info("========Finished the vefifyLoginPageWithInvalidCredentials=====");
		Thread.sleep(10000);

		log.info("========Starting the SharePostOnlyWithme=====");
		feed.Share_post("Share post only with me", "This the post I'm going to share as a personal post");
		log.info("========Finished the SharePostOnlyWithme=====");
		Thread.sleep(7000);
	}

	@AfterTest
	public void EndDriver() {
		driver.close();
	}

}
