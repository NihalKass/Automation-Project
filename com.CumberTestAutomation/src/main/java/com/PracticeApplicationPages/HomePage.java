package com.PracticeApplicationPages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.components.Utilities;

public class HomePage{
			
	Utilities utils = new Utilities();
	WebDriver driver = utils.driver;
	
	//WebDriver driver;
	//xpath details
	@FindBy(xpath="//legend[contains(text(),'Suggession Class Example')]")
	private WebElement textFieldHeader;
	
	@FindBy(id="autocomplete")
	private WebElement textfield;
	
	@FindBy(xpath = "Application.HomePage.RadioButton2")
	private WebElement RadioButton2;
	
	@FindBy(xpath = "Application.HomePage.RadioButton3")
	private WebElement RadioButton3;
	
	
	public void RadioButtonclick(String button) throws IOException {
		Properties loadedData = utils.readPropertiesFile("PracticeApplicationXpath");
		String xpathData = loadedData.getProperty(button);
		driver.findElement(By.xpath(xpathData)).click();
	}
	
	public void textBoxNameValWithInputData(String textFieldHeaderName, String Value) {
		String header = textFieldHeader.getText();
		Assert.assertEquals(header, textFieldHeaderName);
		textfield.sendKeys(Value);
	}
	
	
}
