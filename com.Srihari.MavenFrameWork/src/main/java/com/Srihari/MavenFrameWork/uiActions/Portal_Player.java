package com.Srihari.MavenFrameWork.uiActions;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Portal_Player {

	WebDriver driver;

	public static final Logger log = Logger.getLogger(Portal_Player.class.getName());

	@FindBy(xpath = "//aside[@id='site-nav']/nav/ul/li[3]/a")
	WebElement ClickPortal;

	@FindBy(xpath = "//a[contains(text(),'Match Stats')]")
	WebElement Click_MatchScore;

	public void runURL() {
		driver.get("http://www.pitchvision.com/#/hub");
	}

	@FindBy(xpath = "//button[contains(text(),'Add New')]")
	WebElement Add_MatchScroe;

	@FindBy(xpath = ".//*[@id='content']/div/div/div/pv-registration/div/div/div[2]/div/form/div[1]/div[5]/div[2]/div/div[2]/input")
	WebElement SelDate;

	public void SelectDate() {
		driver.findElement(By
				.xpath(".//*[@id='playerMatchStatContent']/pv-add-portal-player-stat/div/div[2]/form/div/div[1]/div[2]/div/div/input"))
				.click();

		List<WebElement> dates = driver.findElements(By.xpath(
				".//*[@id='playerMatchStatContent']/pv-add-portal-player-stat/div/div[2]/form/div/div[1]/div[2]/div/div/ul/li/div/table/tbody/tr/td"));
		int total_node = dates.size();
		for (int i = 0; i < total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equals("28")) {
				dates.get(i).click();
				break;
			}
		}
	}

	@FindBy(name = "opposite")
	WebElement Enter_Opposition;

	@FindBy(name = "league")
	WebElement Enter_League;

	@FindBy(name = "venue")
	WebElement Enter_Venue;

	@FindBy(name = "match_type")
	WebElement Enter_matchType;

	public void match_format() {
		Select Mformat = new Select(driver.findElement(By.id("match_style")));
		Mformat.selectByVisibleText("T20");
	}

	public void match_grade() {
		Select Mgrade = new Select(driver.findElement(By.id("match_grade")));
		Mgrade.selectByVisibleText("School");
	}

	@FindBy(name = "team")
	WebElement Enter_teamname;

	public void Result() {
		Select Rest = new Select(driver.findElement(By.id("result")));
		Rest.selectByVisibleText("Lost");
	}

	public void Surface() {
		Select Surface_type = new Select(driver.findElement(By.id("surface_type")));
		Surface_type.selectByVisibleText("Grass");
	}

	public void Position() {
		Select Batsman_position = new Select(driver.findElement(By.id("batting_position")));
		Batsman_position.selectByVisibleText("4");
	}

	@FindBy(name = "batting_runs")
	WebElement Batting_runs;

	@FindBy(name = "batting_balls_faced")
	WebElement Batting_ballsfaced;

	public void portal_click() {
		ClickPortal.click();
	}

	public void HowOut() {
		Select Batsman_position = new Select(driver.findElement(By.name("batting_how_out")));
		Batsman_position.selectByVisibleText("Bowled");
	}

	@FindBy(name = "bowling_overs")
	WebElement Bowling_Overs;

	@FindBy(name = "bowling_runs")
	WebElement Bowling_Runs;

	@FindBy(name = "bowling_wickets")
	WebElement Bowling_wickets;

	@FindBy(name = "bowling_wides")
	WebElement Bowling_Wides;

	@FindBy(name = "bowling_no_balls")
	WebElement Bowling_noballs;

	@FindBy(name = "fielding_catches")
	WebElement Fielding_catchs;

	@FindBy(name = "fielding_stumpings")
	WebElement Fielding_Stumpings;

	@FindBy(name = "fielding_run_outs")
	WebElement Fielding_Runouts;

	public Portal_Player(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void EnterMatchScoreDetails(String oppo, String Leg, String vnu, String mname, String tname, String bruns,
			String bfaced, String bovers, String bowRuns, String BowWikt, String Wds, String nob, String cat,
			String stmp, String runout) throws Exception {

		ClickPortal.click();

		log.info("Clicked on the portal navigation ");

		Thread.sleep(4000);
		System.out.println("Reached the step");
		runURL();
		Thread.sleep(8000);
		Click_MatchScore.click();
		log.info("Clicked on the match scroe button " + Click_MatchScore);
		System.out.println("After clicked, Reached the step");
		Add_MatchScroe.click();
		log.info("Clicked on the Add match score button " + Add_MatchScroe);
		Thread.sleep(3000);
		SelectDate();
		log.info("Selecte the respective date ");
		Enter_Opposition.sendKeys(oppo);
		log.info("Enter the opposition name " + Enter_Opposition);
		Enter_League.sendKeys(Leg);
		log.info("Enter the league name " + Enter_League);
		Enter_Venue.sendKeys(vnu);
		log.info("Enter the Venue name " + Enter_Venue);
		Enter_matchType.sendKeys(mname);
		log.info("Enter matchType " + Enter_matchType);
		match_format();
		log.info("Enter the matchformat ");
		match_grade();
		Enter_teamname.sendKeys(tname);
		Result();
		Surface();

		Position();
		Batting_runs.sendKeys(bruns);
		Batting_ballsfaced.sendKeys(bfaced);
		HowOut();

		Bowling_Overs.sendKeys(bovers);
		Bowling_Runs.sendKeys(bowRuns);
		Bowling_wickets.sendKeys(BowWikt);
		Bowling_Wides.sendKeys(Wds);
		Bowling_noballs.sendKeys(nob);

		Fielding_catchs.sendKeys(cat);
		Fielding_Stumpings.sendKeys(stmp);
		Fielding_Runouts.sendKeys(runout);
	}

	public void portal_click1() {
		// TODO Auto-generated method stub

	}

}
