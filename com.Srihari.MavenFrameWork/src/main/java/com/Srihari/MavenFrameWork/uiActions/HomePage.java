package com.Srihari.MavenFrameWork.uiActions;

import java.io.File;
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	WebDriver driver;

	Actions act;

	public static final Logger log = Logger.getLogger(HomePage.class.getName());

	// ====User Login====

	@FindBy(xpath = ".//*[@id='site-head']/ul[2]/li/a")
	@CacheLookup
	WebElement ClickLogin;

	@FindBy(xpath = ".//*[@id='login-modal']/div[2]/div/pv-login/div/div/div[2]/div/form/div[1]/div[1]/div/div[2]/input")
	@CacheLookup
	WebElement Username;

	@FindBy(xpath = ".//*[@id='password']")
	@CacheLookup
	WebElement Password;

	@FindBy(xpath = "//button[@class='width-35 pull-right btn btn-sm btn-primary main-reg-log-submit']")
	@CacheLookup
	WebElement Submit;

	// ====User registration page===

	@FindBy(xpath = ".//*[@id='login-modal']/div[2]/div/pv-login/div/div/div[2]/div/form/div[2]/span/a")
	@CacheLookup
	WebElement clickRegister;

	@FindBy(name = "first_name")
	@CacheLookup
	WebElement Enter_Fname;

	@FindBy(name = "last_name")
	@CacheLookup
	WebElement Enter_Lname;

	@FindBy(name = "nickname")
	@CacheLookup
	WebElement Enter_Kname;

	@FindBy(name = "email")
	@CacheLookup
	WebElement Enter_email;

	@FindBy(xpath = "//label[@class='reg-switch']")
	@CacheLookup
	WebElement Active_checkBox;

	@FindBy(xpath = "//input[@name='orgName']")
	@CacheLookup
	WebElement Enter_orgName;

	@FindBy(xpath = ".//*[@id='password']")
	@CacheLookup
	WebElement Enter_pwd;

	@FindBy(xpath = ".//*[@id='repassword']")
	@CacheLookup
	WebElement Enter_Repwd;

	@FindBy(xpath = ".//*[@id='content']/div/div/div/pv-registration/div/div/div[2]/div/form/div[1]/div[5]/div[2]/div/div[2]/input")
	@CacheLookup
	WebElement Click_DOB;

	@FindBy(xpath = ".//*[@id='content']/div/div/div/pv-registration/div/div/div[2]/div/form/div[1]/div[5]/div[2]/div/div[2]/ul/li[2]/span/button[1]")
	@CacheLookup
	WebElement Select_Today;

	@FindBy(xpath = ".//*[@id='content']/div/div/div/pv-registration/div/div/div[2]/div/form/div[1]/div[7]/button")
	@CacheLookup
	WebElement Register;

	public void dropdown() {
		Select gender = new Select(driver.findElement(By.id("gender")));
		gender.selectByVisibleText("Male");

	}

	public void dateSet() {
		int i;
		for (i = 1; i <= 50; i++) {
			driver.findElement(By
					.xpath(".//*[@id='content']/div/div/div/pv-registration/div/div/div[2]/div/form/div[1]/div[5]/div[2]/div/div[2]/ul/li[1]/div/table/thead/tr[1]/th[1]"))
					.click();

		}
	}

	public void Refresh() {
		driver.navigate().refresh();
	}

	@FindBy(xpath = "//div[contains(text(),'Please specify correct date of birth')]")
	@CacheLookup
	WebElement DateVerificationText;

	public void DoB() {
		List<WebElement> dates = driver.findElements(By.xpath(
				".//*[@id='content']/div/div/div/pv-registration/div/div/div[2]/div/form/div[1]/div[5]/div[2]/div/div[2]/ul/li[1]/div/table/tbody/tr/td"));
		int total_node = dates.size();
		for (int i = 0; i < total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equals("15")) {
				dates.get(i).click();
				break;
			}
		}

	}

	@FindBy(xpath = "//span[contains(text(),'Register')]")
	@CacheLookup
	WebElement RegisterPlayer;

	@FindBy(xpath = "//div[contains(text(),’Thanks for registering with us - please check your mail.’)")
	@CacheLookup
	WebElement SuccessRegister;

	// ======Create a post======

	@FindBy(xpath = ".//*[@id='site-head']/ul[2]/li[1]")
	@CacheLookup
	WebElement ClickOnPostButton;

	@FindBy(xpath = ".//*[@id='shareMessagesubject']")
	@CacheLookup
	WebElement Enter_Sub;

	@FindBy(xpath = ".//*[@id='tab-linearrow-photo']/share-message/div/div/div[1]/div[2]/div/textarea")
	@CacheLookup
	WebElement Enter_Conversation;

	@FindBy(xpath = ".//*[@id='tab-linearrow-photo']/share-message/div/div/div[2]/div/div/div[2]")
	@CacheLookup
	WebElement Select_Audience;

	@FindBy(xpath = ".//*[@id='tab-linearrow-photo']/share-message/div/div/div[2]/div/div/div[3]/div[3]/table/tbody/tr/td[1]/div/label/span/span")
	@CacheLookup
	WebElement Select_Onlyme;

	@FindBy(xpath = ".//*[@id='tab-linearrow-photo']/share-message/div/div/div[2]/div/span")
	@CacheLookup
	WebElement Share_Post;

	@FindBy(xpath = "//img[@src='/cdn/images/interactive.png']")
	@CacheLookup
	WebElement moveOver;

	@FindBy(xpath = "//button[@class='fa fa-search fa-inverse']")
	@CacheLookup
	WebElement ClickOut;

	@FindBy(xpath = "//aside[@id='site-nav']")
	@CacheLookup
	WebElement SideNagNames;

	@FindBy(xpath = "//a")
	@CacheLookup
	WebElement Alllinks;

	@FindBy(xpath = "//a[@href='https://play.google.com/store/search?q=pitchvision']")
	@CacheLookup
	WebElement Google_playstore;

	@FindBy(xpath = "//a[@href='https://itunes.apple.com/bf/app/pitchvision/id1047623988?mt=8']")
	@CacheLookup
	WebElement Iapp_playstore;

	// ======Go to the portal and create the match status for the user//

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void LoginApplication(String Uname, String pwd) {
		ClickLogin.click();
		log.info("Click on the login button and the object is" + ClickLogin);
		Username.sendKeys(Uname);
		log.info("Enter the username and the object is" + Username);
		Password.sendKeys(pwd);
		log.info("Enter the password and the object is " + Password);
		Submit.click();
		log.info("Submit the form button and the object is " + Submit);

	}

	public void RegisterApplication(String Fname, String Lname, String Kame, String email, String orgName, String pwd,
			String repwd) {

		ClickLogin.click();
		log.info("Click on the login link" + ClickLogin);
		clickRegister.click();
		log.info("Click on the register link" + clickRegister);
		Enter_Fname.sendKeys(Fname);
		log.info("Enter the first name of the Field " + Enter_Fname);
		Enter_Lname.sendKeys(Lname);
		log.info("Enter the last name of the Field " + Enter_Lname);
		Enter_Kname.sendKeys(Kame);
		log.info("Enter the nick name of the Filed " + Enter_Kname);
		Enter_email.sendKeys(email);
		log.info("Enter the email of the Field " + Enter_email);
		Active_checkBox.click();
		log.info("check box field " + Active_checkBox);
		Enter_orgName.sendKeys(orgName);
		log.info("Enter the orgname of the Field " + Enter_orgName);
		Enter_pwd.sendKeys(pwd);
		log.info("Enter the passwrod of the Filed" + Enter_pwd);
		Enter_Repwd.sendKeys(repwd);
		log.info("Reenter the password of the Field " + Enter_Repwd);
		dropdown();
		Click_DOB.click();
		dateSet();
		DoB();
		RegisterPlayer.click();
		// SuccessRegister.getText();
		// System.out.println(SuccessRegister.getText());

	}

	// Email validation verificaton code//

	public void EmailValidation(String Fname, String Lname, String Kame, String pwd, String repwd) {

		Enter_Fname.sendKeys(Fname);
		log.info("Enter the first name of the Field " + Enter_Fname);
		Enter_Lname.sendKeys(Lname);
		log.info("Enter the last name of the Field " + Enter_Lname);
		Enter_Kname.sendKeys(Kame);
		log.info("Enter the nick name of the Filed " + Enter_Kname);
		// Enter_email.sendKeys(email);
		// log.info("Enter the email of the Field " + Enter_email);
		Enter_pwd.sendKeys(pwd);
		log.info("Enter the passwrod of the Filed" + Enter_pwd);
		Enter_Repwd.sendKeys(repwd);
		log.info("Reenter the password of the Field " + Enter_Repwd);
		dropdown();
		Click_DOB.click();
		dateSet();
		DoB();
		RegisterPlayer.click();
		// SuccessRegister.getText();
		// System.out.println(SuccessRegister.getText());

	}

	public void Verification() throws Exception {
		Thread.sleep(4000);
		String expectedResult = "Email is required field.";
		String emailVerText = driver
				.findElement(
						By.xpath(".//*[@id='content']/div/div/div/pv-registration/div/div/div[2]/div/form/div[3]/div"))
				.getText();

		if (emailVerText.equals(expectedResult)) {
			System.out.println("Email is is must required for registration fourm");
		}

		driver.navigate().refresh();
		Thread.sleep(8000);
	}

	// First name field validation code

	public void FirstnameValidation(String Lname, String Kame, String email, String pwd, String repwd) {

		// Enter_Fname.sendKeys(Fname);
		// log.info("Enter the first name of the Field " + Enter_Fname);
		Enter_Lname.sendKeys(Lname);
		log.info("Enter the last name of the Field " + Enter_Lname);
		Enter_Kname.sendKeys(Kame);
		log.info("Enter the nick name of the Filed " + Enter_Kname);
		Enter_email.sendKeys(email);
		log.info("Enter the email of the Field " + Enter_email);
		Enter_pwd.sendKeys(pwd);
		log.info("Enter the passwrod of the Filed" + Enter_pwd);
		Enter_Repwd.sendKeys(repwd);
		log.info("Reenter the password of the Field " + Enter_Repwd);
		dropdown();
		Click_DOB.click();
		dateSet();
		DoB();
		RegisterPlayer.click();
		// SuccessRegister.getText();
		// System.out.println(SuccessRegister.getText());

	}

	public void FirstNameVerification() throws Exception {
		Thread.sleep(4000);
		String expectedResult = "Firstname is required field.";
		String FnameVerText = driver
				.findElement(
						By.xpath(".//*[@id='content']/div/div/div/pv-registration/div/div/div[2]/div/form/div[3]/div"))
				.getText();

		if (FnameVerText.equals(expectedResult)) {
			System.out.println("Firstname is is must required" + FnameVerText);
		}

		driver.navigate().refresh();
		Thread.sleep(8000);
	}

	// Nick name field verification//

	public void NicknameValidation(String Fname, String Lname, String email, String pwd, String repwd) {

		Enter_Fname.sendKeys(Fname);
		log.info("Enter the first name of the Field " + Enter_Fname);
		Enter_Lname.sendKeys(Lname);
		// log.info("Enter the last name of the Field " + Enter_Lname);
		// Enter_Kname.sendKeys(Kame);
		log.info("Enter the nick name of the Filed " + Enter_Kname);
		Enter_email.sendKeys(email);
		log.info("Enter the email of the Field " + Enter_email);
		Enter_pwd.sendKeys(pwd);
		log.info("Enter the passwrod of the Filed" + Enter_pwd);
		Enter_Repwd.sendKeys(repwd);
		log.info("Reenter the password of the Field " + Enter_Repwd);
		dropdown();
		Click_DOB.click();
		dateSet();
		DoB();
		RegisterPlayer.click();
	}

	public void NickNameVerification() throws Exception {
		Thread.sleep(4000);
		String expectedResult = "Email is required field.";
		String nickNameVerText = driver
				.findElement(
						By.xpath(".//*[@id='content']/div/div/div/pv-registration/div/div/div[2]/div/form/div[3]/div"))
				.getText();

		if (nickNameVerText.equals(expectedResult)) {
			System.out.println("Email is is must required" + nickNameVerText);
		}

		driver.navigate().refresh();
		Thread.sleep(8000);
	}

	public void shortName_Validtion(String Fname, String Lname, String Kame, String email, String pwd, String repwd) {

		Enter_Fname.sendKeys(Fname);
		log.info("Enter the first name of the Field " + Enter_Fname);
		Enter_Lname.sendKeys(Lname);
		log.info("Enter the last name of the Field " + Enter_Lname);
		Enter_Kname.sendKeys(Kame);
		log.info("Enter the nick name of the Filed " + Enter_Kname);
		Enter_email.sendKeys(email);
		log.info("Enter the email of the Field " + Enter_email);
		Enter_pwd.sendKeys(pwd);
		log.info("Enter the passwrod of the Filed" + Enter_pwd);
		Enter_Repwd.sendKeys(repwd);
		log.info("Reenter the password of the Field " + Enter_Repwd);
		dropdown();
		Click_DOB.click();
		dateSet();
		DoB();
		RegisterPlayer.click();
		// SuccessRegister.getText();
		// System.out.println(SuccessRegister.getText());
		Refresh();

	}

	public void Share_post(String Sub, String Conversation) {
		ClickOnPostButton.click();
		Enter_Sub.sendKeys(Sub);
		Enter_Conversation.sendKeys(Conversation);
		Select_Audience.click();
		Select_Onlyme.click();
		Share_Post.click();
	}

	public void SideNag() throws Exception {

		int i = 1;
		int j = 1;
		for (i = 1; i < 5; i++) {
			Actions act = new Actions(driver);
			act.moveToElement(moveOver).perform();
			Thread.sleep(2000);
			for (j = 1; j < 5; j++) {
				act.moveToElement(ClickOut).perform();
			}

		}

	}

	public void CheckAllLinks() {

		String underConsTitle = "Not Found";

		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		String[] linkTexts = new String[linkElements.size()];
		int i = 0;

		// extract the link texts of each link element
		for (WebElement e : linkElements) {
			linkTexts[i] = e.getText();
			i++;
		}

		// test each link
		for (String t : linkTexts) {
			driver.findElement(By.linkText(t)).click();
			if (driver.getTitle().equals(underConsTitle)) {
				System.out.println("\"" + t + "\"" + " is under construction.");
			} else {
				System.out.println("\"" + t + "\"" + " is working.");
			}
			driver.navigate().back();
		}
		driver.quit();
	}

	// To find the register element found on the page..!!

	@FindBy(xpath = ".//*[@id='login-modal']/div[2]/div/pv-login/div/div/div[2]/div/form/div[2]/span/a")
	WebElement Find_Register;

	String expecteResult = "Register now";

	public void RegisterButton() {

		ClickLogin.click();
		String Reg = Find_Register.getText();
		if (Reg.equals(expecteResult)) {

			System.out.println("The excepted result is " + Reg);

		}

		Find_Register.click();

	}

	public void screenshot() {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(src, new File("My.jpg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void GooglePlayStoreLink() throws Exception {

		String expectResult = "pithvision- Google Play";
		Google_playstore.click();
		Thread.sleep(6000);
		String GoogleTitle = driver.getTitle();

		if (expectResult.equals(GoogleTitle)) {
			System.out.println("Passed");
		} else {
			System.out.println("Not passed");
		}
	}

	public void IAppstore() throws InterruptedException {
		Iapp_playstore.click();
		Thread.sleep(6000);
		String expectResultAA = "PithVision on the App Store";
		String AppTitle = driver.getTitle();

		if (expectResultAA.equalsIgnoreCase(AppTitle)) {
			System.out.println("Passed");
		} else {
			System.out.println("Not passed");
		}
	}

}
