package com.Srihari.MavenFrameWork.uiActions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Workload {
	WebDriver driver;
	Actions action;

	public Workload(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//aside[@id='site-nav']/nav/ul/li[3]/a")
	WebElement ClickPortal;

	@FindBy(css = "a[class='vertical-btn'][ng-click='openPlayerWorkloadModal(playerDetail, playerDetail.profile.uid)']")
	WebElement Click_Workload_Home;

	@FindBy(xpath = "//a[@id='add-workload']")
	@CacheLookup
	WebElement Click_Workload;

	public void WorkLoad() {
		action = new Actions(driver);
		WebElement wl = driver
				.findElement(By.xpath(".//*[@id='content']/div/div/div[1]/div[2]/div/div[3]/div[5]/div/div/div/a"));
		action.moveToElement(wl).build().perform();
	}

	@FindBy(xpath = "//*[@id='content']/div/div/div[1]/div[2]/div/div[3]/div[5]/div/div/div/div/div/a")
	WebElement ClickWorkloadTooltip;

	// Mouse over different way to achive the program

	public void GoPortal() {
		ClickPortal.click();
		Click_Workload_Home.click();

	}

	public void SelectDate() {
		driver.findElement(By
				.xpath(".//*[@id='playerWorkloadModal']/div[2]/div/div[2]/div/div[3]/div/div/div[1]/div[2]/div/div/form/div[1]/div[1]/div/div/input"))
				.click();

		List<WebElement> dates = driver.findElements(By.xpath(
				".//*[@id='playerWorkloadModal']/div[2]/div/div[2]/div/div[3]/div/div/div[1]/div[2]/div/div/form/div[1]/div[1]/div/div/ul/li[1]/div/table/tbody/tr/td"));
		int total_node = dates.size();
		for (int i = 0; i < total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equals("28")) {
				dates.get(i).click();
				break;
			}
		}
	}

	@FindBy(xpath = "//input[@name='balls']")
	@CacheLookup
	WebElement Enter_Balls;

	@FindBy(xpath = ".//*[@id='radio_0']/div[1]/div[1]")
	@CacheLookup
	WebElement Click_Match_Radiobutton;

	@FindBy(css = "md-radio-button#radio_1")
	@CacheLookup
	WebElement Click_Practice_Radiobutton;

	@FindBy(xpath = ".//*[@id='playerWorkloadModal']/div[2]/div/div[2]/div/div[3]/div/div/div[1]/div[2]/div/div/form/div[2]/div/button")
	@CacheLookup
	WebElement Save;

	@FindBy(xpath = ".//*[@id='playerWorkloadModal']/div[2]/div/div[2]/div/div[1]/div/div/div[3]/button[2]")
	@CacheLookup
	WebElement Weekly;

	@FindBy(xpath = "//*[@id='playerWorkloadModal']/div[2]/div/div[2]/div/div[1]/div/div/div[3]/button[4]")
	@CacheLookup
	WebElement Chronic;

	@FindBy(xpath = ".//*[@id='playerWorkloadModal']/div[2]/div/div[2]/div/div[1]/div/div/div[3]/button[5]")
	@CacheLookup
	WebElement Monthly;

	@FindBy(xpath = ".//*[@id='playerWorkloadModal']/div[2]/div/div[2]/div/div[1]/div/div/div[3]/button[3]")
	@CacheLookup
	WebElement RollingWeek;

	@FindBy(css = "a[href='/#/hub/player'][class='vertical-btn']")
	@CacheLookup
	WebElement PlayerManagement;

	public void Surface() {

		Select surf = new Select(driver.findElement(By.xpath("//select[@name='surface_type']")));
		surf.selectByVisibleText("Grass Surface");
	}

	public void IndoorLeague() {

		Select surf = new Select(driver.findElement(By.xpath("//select[@name='surface_type']")));

		surf.selectByVisibleText("Indoor League");
	}

	public void IndoorGrass() {

		Select surf = new Select(driver.findElement(By.xpath("//select[@name='surface_type']")));
		surf.selectByVisibleText("Indoor League");
	}

	public void SurfaceDropdown() {

		Select surface_Dropdown = new Select(driver.findElement(By.cssSelector("select[name='surface_type']")));
		surface_Dropdown.selectByValue("GS");
	}

	public void SurfaceDropdown1() {

		Select surface_Dropdown1 = new Select(driver.findElement(By.cssSelector("select[name='surface_type']")));
		surface_Dropdown1.selectByValue("IL");
	}

	public void WorkLoadManagementEntiy(String balls) {
		Click_Workload.click();
		SelectDate();
		Enter_Balls.sendKeys(balls);
		Click_Match_Radiobutton.click();
		Surface();
		Save.click();

	}

	public void WorkLoadManagenetIndoor(String balls) {
		Click_Workload.click();
		SelectDate();
		Enter_Balls.sendKeys(balls);
		Click_Match_Radiobutton.click();
		IndoorLeague();
		Save.click();

	}

	public void WorkLoadManagenetGrassSurface(String balls) {
		Click_Workload.click();
		SelectDate();
		Enter_Balls.sendKeys(balls);
		Click_Practice_Radiobutton.click();
		IndoorLeague();
		Save.click();

	}

	public void Changetabs() throws Exception {
		Weekly.click();
		Thread.sleep(2000);
		Chronic.click();
		Thread.sleep(2000);
		Monthly.click();
		Thread.sleep(2000);
		RollingWeek.click();
	}

	public void EditMatchValues(String editballs) {
		driver.findElement(By
				.xpath(".//*[@id='playerWorkloadModal']/div[2]/div/div[2]/div/div[3]/div/div/div[3]/table/tbody/tr/td[5]/a"))
				.click();
		driver.findElement(By.name("balls")).clear();
		driver.findElement(By.name("balls")).sendKeys(editballs);
		driver.findElement(By
				.xpath(".//*[@id='playerWorkloadModal']/div[2]/div/div[2]/div/div[3]/div/div/div[1]/div[2]/div/div/form/div[2]/div/button"))
				.click();
	}

	public void DeleteWorkLoad() {
		driver.findElement(By
				.xpath(".//*[@id='playerWorkloadModal']/div[2]/div/div[2]/div/div[3]/div/div/div[3]/table/tbody/tr[1]/td[6]/a"))
				.click();
	}

	@FindBy(xpath = ".//*[@id='playerWorkloadModal']/div[2]/div/div[2]/div/div[1]/div/div/div[2]/button[3]")
	WebElement Filter_All;

	public void SelectAllFilter() {

		Filter_All.click();
	}

	public void IndoorLeagueWorkload(String balls) {

		SelectDate();
		Enter_Balls.sendKeys(balls);
		Click_Match_Radiobutton.click();
		SurfaceDropdown1();
		Save.click();
	}

	public void Concrete() {

		Select Concrete_dropdown = new Select(driver.findElement(By.cssSelector("select[name='surface_type']")));
		Concrete_dropdown.selectByValue("CO");
	}

	public void IndoorCricketCentre() {

		Select IndoorCricketCentre_dropdown = new Select(
				driver.findElement(By.cssSelector("select[name='surface_type']")));
		IndoorCricketCentre_dropdown.selectByValue("IC");
	}

	public void OutdoorNetGrass() {

		Select OutdoorNet_dropdown = new Select(driver.findElement(By.cssSelector("select[name='surface_type']")));
		OutdoorNet_dropdown.selectByValue("OG");
	}

	public void OutdoorNetMatting() {

		Select OutdoorNetMatting_dropdown = new Select(
				driver.findElement(By.cssSelector("select[name='surface_type']")));
		OutdoorNetMatting_dropdown.selectByValue("OM");
	}

	public void SprungFloorCricketMat() {

		Select SprungFloorCricketMat_dropdown = new Select(
				driver.findElement(By.cssSelector("select[name='surface_type']")));
		SprungFloorCricketMat_dropdown.selectByValue("SF");
	}

	public void WoodenSprungFlooSportsHall() {

		Select WoodenSprungFlooSportsHall_dropdown = new Select(
				driver.findElement(By.cssSelector("select[name='surface_type']")));
		WoodenSprungFlooSportsHall_dropdown.selectByValue("WS");
	}

	public void TestConcreteWorkLoad(String con_balls) {

		SelectDate();
		Enter_Balls.sendKeys(con_balls);
		Click_Practice_Radiobutton.click();
		Concrete();
		Save.click();
	}

	public void TestIndoorCricketCentre(String indoor_balls) {

		SelectDate();
		Enter_Balls.sendKeys(indoor_balls);
		Click_Practice_Radiobutton.click();
		IndoorCricketCentre();
		Save.click();
	}

	public void TestOutdoorNetGrass(String outdoor_balls) {

		SelectDate();
		Enter_Balls.sendKeys(outdoor_balls);
		Click_Practice_Radiobutton.click();
		OutdoorNetGrass();
		Save.click();
	}

	public void TestOutdoorNetMatting(String outdoorNet_balls) {

		SelectDate();
		Enter_Balls.sendKeys(outdoorNet_balls);
		Click_Practice_Radiobutton.click();
		OutdoorNetMatting();
		Save.click();
	}

	public void TestSprungFloorCricketMat(String Sprung_balls) {

		SelectDate();
		Enter_Balls.sendKeys(Sprung_balls);
		Click_Practice_Radiobutton.click();
		SprungFloorCricketMat();
		Save.click();
	}

	public void TestSprungWoodenSprungFlooSportsHall(String Wood_balls) {

		SelectDate();
		Enter_Balls.sendKeys(Wood_balls);
		Click_Practice_Radiobutton.click();
		WoodenSprungFlooSportsHall();
		Save.click();
	}

	public void CoachPlayerManagement() throws Exception {
		ClickPortal.click();
		PlayerManagement.click();
		Thread.sleep(5000);
	}

	@FindBy(css = ".fa.fa-plus.fa-stack-1x.fa-inverse")
	@CacheLookup
	WebElement ClickAddFilter;

	public void Player() {
		Select player_filter = new Select(driver.findElement(By.cssSelector(".form-control.mainPvFilter-2.ng-touched.ng-dirty.ng-valid-parse")));
		player_filter.selectByValue("player_name");

	}

	public void SelectPlayer() {
		Select Select_player_filter = new Select(
				driver.findElement(By.cssSelector(".form-control.dependentPvFilter-2")));
		Select_player_filter.selectByValue("contains");

	}

	@FindBy(css = "input.form-control.dependent-search-helper-input-2")
	@CacheLookup
	WebElement typeUsername;

	@FindBy(css = "button[class='pv-mb0 pv-mt5 btn btn-xs btn-info'][ng-click='portalFilters()']")
	@CacheLookup
	WebElement ApplyFilter;

	public void PlayerManagementFilterPlayer(String filter_name) throws Exception {

		CoachPlayerManagement();
		ClickAddFilter.click();
		Player();
		SelectPlayer();
		typeUsername.sendKeys(filter_name);
		ApplyFilter.click();

	}

	@FindBy(css = "i.pvi-icon.pvi-icon-WLM.pvi-1x")
	@CacheLookup
	WebElement OpenWork_Player;

	public void CheckWork() {
		OpenWork_Player.click();
	}

}
