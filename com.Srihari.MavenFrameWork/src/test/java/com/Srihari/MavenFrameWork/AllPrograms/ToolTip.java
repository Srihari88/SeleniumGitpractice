package com.Srihari.MavenFrameWork.AllPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ToolTip {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");

		Actions action = new Actions(driver);

		WebElement ele = driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/a"));

		action.moveToElement(ele).build().perform();

		String toolTip = ele.getAttribute("title");

		System.out.println(toolTip);

		ArrayList<String> ExpArray = new ArrayList<String>();

		ExpArray.add("Electronics");
		ExpArray.add("Appliances");
		ExpArray.add("Men");
		ExpArray.add("Women");
		ExpArray.add("Baby & Kids");
		ExpArray.add("Home & Furniture");
		ExpArray.add("Books & More");

		List<WebElement> totaltext = driver.findElements(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul"));

		ArrayList<String> ActualArray = new ArrayList<String>();

		Iterator<WebElement> itr = totaltext.iterator();

		ArrayList<String> Actualarry = new ArrayList<String>();

		while (itr.hasNext()) {
			Actualarry.add(itr.next().getText());

		}
	//	Assert.assertEquals(ExpArray, Actualarry);

		System.out.println("User expected result is:- " + ExpArray);
		System.out.println("Website result after running the program:- " + Actualarry);

	}

}
