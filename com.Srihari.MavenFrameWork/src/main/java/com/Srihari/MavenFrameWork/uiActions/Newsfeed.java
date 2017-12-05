package com.Srihari.MavenFrameWork.uiActions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newsfeed {
	WebDriver driver;

	@FindBy(xpath = "//div[@id='shareMessageModal']/div[2]/div/share-message-post/div/div[1]")
	WebElement CheckPostText;

	// ======Create a post======

	@FindBy(xpath = ".//*[@id='site-head']/ul[2]/li[1]")
	WebElement ClickOnPostButton;

	@FindBy(xpath = ".//*[@id='shareMessagesubject']")
	WebElement Enter_Sub;

	@FindBy(xpath = ".//*[@id='tab-linearrow-photo']/share-message/div/div/div[1]/div[2]/div/textarea")
	WebElement Enter_Conversation;

	@FindBy(xpath = ".//*[@id='tab-linearrow-photo']/share-message/div/div/div[2]/div/div/div[2]")
	WebElement Select_Audience;

	@FindBy(xpath = ".//*[@id='tab-linearrow-photo']/share-message/div/div/div[2]/div/div/div[3]/div[3]/table/tbody/tr/td[1]/div/label/span/span")
	WebElement Select_Onlyme;

	@FindBy(xpath = ".//*[@id='tab-linearrow-photo']/share-message/div/div/div[2]/div/span")
	WebElement Share_Post;

	public Newsfeed(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void SharePostOptions() {

		driver.findElement(By.xpath(".//*[@id='site-head']/ul[2]/li[1]")).click();

		ArrayList<String> ExpectedArray = new ArrayList<String>();
		ExpectedArray.add("Photo/Video Message Article");
		ExpectedArray.add("Message");
		ExpectedArray.add("Article");
		// ExpectedArray.add("Message");
		// ExpectedArray.add("Article");

		List<WebElement> totaltext = driver
				.findElements(By.xpath("//div[@id='shareMessageModal']/div[2]/div/share-message-post/div/div[1]"));

		ArrayList<String> ActualArray = new ArrayList<String>();

		Iterator<WebElement> itr = totaltext.iterator();

		ArrayList<String> Actualarry = new ArrayList<String>();

		while (itr.hasNext()) {
			Actualarry.add(itr.next().getText());

		}

		System.out.println("User expected result is:- " + ExpectedArray);
		System.out.println("Website result after running the program:- " + Actualarry);

	}

	public void Share_post(String Sub, String Conversation) {
		ClickOnPostButton.click();
		Enter_Sub.sendKeys(Sub);
		Enter_Conversation.sendKeys(Conversation);
		Select_Audience.click();
		Select_Onlyme.click();
		Share_Post.click();
	}

}
