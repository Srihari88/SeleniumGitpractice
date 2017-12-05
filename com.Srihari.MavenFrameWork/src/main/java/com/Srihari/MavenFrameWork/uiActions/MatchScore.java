package com.Srihari.MavenFrameWork.uiActions;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MatchScore {

	WebDriver driver;
	Actions action;
	public static final Logger log = Logger.getLogger(MatchScore.class.getName());

	@FindBy(xpath = "//aside[@id='site-nav']/nav/ul/li[3]/a")
	@CacheLookup
	WebElement ClickPortal;

	@FindBy(xpath = "//a[contains(text(),'Match Stats')]")
	@CacheLookup
	WebElement Click_MatchScore;

	public void refresh() {
		driver.navigate().refresh();
	}

	public void MatchScoreClick() {

		// driver.findElement(By.xpath("//a[contains(text(),'Match Stats')]"));
		driver.findElement(By.xpath(
				"//a[contains(@ng-click,'openPlayerMatchStatModal(playerDetail);') or contains(text(),'Match Stats')]"));

	}

	@FindBy(css = "a[ng-click='openPlayerMatchStatModal(playerDetail);'][class='vertical-btn']")
	@CacheLookup
	WebElement MatchScorebutton;

	@FindBy(xpath = "//button[contains(text(),'Add New')]")
	@CacheLookup
	WebElement Add_MatchScroe;

	@FindBy(xpath = ".//*[@id='content']/div/div/div/pv-registration/div/div/div[2]/div/form/div[1]/div[5]/div[2]/div/div[2]/input")
	@CacheLookup
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
	@CacheLookup
	WebElement Enter_Opposition;

	@FindBy(name = "league")
	@CacheLookup
	WebElement Enter_League;

	@FindBy(name = "venue")
	@CacheLookup
	WebElement Enter_Venue;

	@FindBy(name = "match_type")
	@CacheLookup
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
	@CacheLookup
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
	@CacheLookup
	WebElement Batting_runs;

	@FindBy(name = "batting_balls_faced")
	@CacheLookup
	WebElement Batting_ballsfaced;

	public void portal_click() {
		ClickPortal.click();
	}

	public void HowOut() {
		Select Batsman_position = new Select(driver.findElement(By.name("batting_how_out")));
		Batsman_position.selectByVisibleText("Bowled");
	}

	@FindBy(name = "bowling_overs")
	@CacheLookup
	WebElement Bowling_Overs;

	@FindBy(name = "bowling_runs")
	@CacheLookup
	WebElement Bowling_Runs;

	@FindBy(name = "bowling_wickets")
	@CacheLookup
	WebElement Bowling_wickets;

	@FindBy(name = "bowling_wides")
	@CacheLookup
	WebElement Bowling_Wides;

	@FindBy(name = "bowling_no_balls")
	@CacheLookup
	WebElement Bowling_noballs;

	@FindBy(name = "fielding_catches")
	@CacheLookup
	WebElement Fielding_catchs;

	@FindBy(name = "fielding_stumpings")
	@CacheLookup
	WebElement Fielding_Stumpings;

	@FindBy(name = "fielding_run_outs")
	@CacheLookup
	WebElement Fielding_Runouts;

	@FindBy(css = ".fa.fa-floppy-o.fa-2x")
	@CacheLookup
	WebElement SaveMatch;

	public MatchScore(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void AddMatchOnlyWithMatchStats(String oppo, String Leg, String vnu, String mname, String m_format,
			String m_grade, String tname, String result, String surface) throws Exception {

		ClickPortal.click();
		Thread.sleep(4000);
		System.out.println("Reached the step");
		MatchScorebutton.click();
		Thread.sleep(2000);
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
		SaveMatch.click();
		ServerError.getText();

		System.out.println(ServerError.getText());

		String s = "Server error";
		if (s.equalsIgnoreCase("Server error")) {
			System.out.println("Failed TestCase");
		}

	}

	public void OppotionValidation() {
		Enter_Opposition.clear();
		SaveMatch.click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(".alert.alert-dismissible.alert-danger.white-text")));
		String Oppo_Store = element.getText();
		System.out.println(Oppo_Store);

		// .alert.alert-dismissible.alert-danger.white-text

	}

	public void LeagueValidation() {
		Enter_League.clear();
		SaveMatch.click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element1 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(".alert.alert-dismissible.alert-danger.white-text>span")));
		String store_League = element1.getText();
		System.out.println(store_League);

	}

	public void VenueValidation() {
		Enter_Venue.clear();
		SaveMatch.click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element2 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(".alert.alert-dismissible.alert-danger.white-text")));
		String store_Venue = element2.getText();
		System.out.println(store_Venue);

	}

	@FindBy(css = ".alert.alert-dismissible.alert-danger.white-text")
	@CacheLookup
	WebElement ServerError;

}
