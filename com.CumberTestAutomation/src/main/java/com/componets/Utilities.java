package com.componets;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Utilities {

	public static WebDriver driver = new ChromeDriver();
	
	public void validateUrl() {
		//Assert.assertTrue(
			//	driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/AutomationPractice/"));
		String CurrnetUrl = driver.getCurrentUrl();
		System.out.println("Currnet Url: "+CurrnetUrl);
		String PageHeader = driver.findElement(By.xpath("//h1[(contains(text(),'Practice Page'))]")).getText();
		System.out.println("Object Appearance: "+ PageHeader);
		if (PageHeader.equalsIgnoreCase("Practice Page")) {
			System.out.println("Application URL is launched");
		}
	}

	public static  Properties readPropertiesFile(String fileName) throws IOException {
		String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\CommonPath\\" + fileName + ".properties";
		FileReader reader = new FileReader(filePath);
		Properties prop = new Properties();
		prop.load(reader);
		
		return prop;
	}

}
