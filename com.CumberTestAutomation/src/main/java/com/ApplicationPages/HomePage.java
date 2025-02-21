package com.ApplicationPages;

import java.io.IOException;
import java.util.Properties;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.components.Utilities;
import com.components.Hooks;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class HomePage{
			
	Utilities utils = new Utilities();
	WebDriver driver = utils.driver;

	//WebDriver driver;
	//xpath details
	@FindBy(xpath = "Application.HomePage.RadioButtonHeader")
	private WebElement RadioButtonHeader;
	
	@FindBy(xpath = "Application.HomePage.RadioButton1")
	private WebElement RadioButton1;
	
	@FindBy(xpath = "Application.HomePage.RadioButton2")
	private WebElement RadioButton2;
	
	@FindBy(xpath = "Application.HomePage.RadioButton3")
	private WebElement RadioButton3;
	
	public void verifyElements() throws InterruptedException {
		String radioBtnHeaderValue = RadioButtonHeader.getText();
		Assert.assertEquals(radioBtnHeaderValue, "Radio Button Example");
		
		//RadioButton1.click();
		Thread.sleep(2000);
		//RadioButton2.click();
		Thread.sleep(2000);
		//RadioButton3.click();
		Thread.sleep(2000);
		
	}
	
	public void Elementsclick(String button) throws IOException {
		Properties loadedData = utils.readPropertiesFile("xPath");
		String xpathData = loadedData.getProperty(button);
		System.out.print(xpathData);
		driver.findElement(By.xpath(xpathData)).click();
	}
	
}
