package com.components;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilities{
	
	public static WebDriver driver;

	//efore
	public void Launchsetup() {
		 try {
		        //trying another way to invoke browser using passing all url and parameter from properties file
			 Properties prop = new Properties();
			 FileInputStream file = new FileInputStream(System.getProperty("user.dir")
					 +"\\src\\main\\resources\\GlobalData\\GlobalAppData.properties");
			 prop.load(file);
			 String browserName = System.getProperty("browser")!=null? System.getProperty("browser"):prop.getProperty("browser");
			 String uRL = prop.getProperty("url");
			 
			 System.out.println("Initializing setup...");
			 if(browserName.contains("chrome")) {
				 ChromeOptions options = new ChromeOptions();
				 WebDriverManager.chromedriver().setup();
				 if(browserName.contains("headless")) {
					 options.addArguments("headless");
				 }
				 
				 driver = new ChromeDriver();
			 }
			 else if(browserName.equalsIgnoreCase("firefox")) {
				 System.setProperty("webdriver.gecko.driver","path of gecko");
				 driver = new FirefoxDriver();
			 }
			 else if(browserName.equalsIgnoreCase("Edge")) {
				 System.setProperty("webdriver.edge.driver","Path of edge.exe");
				 driver = new EdgeDriver();
			 }
			
			 	// Add logging to check the execution flow
				/*
				 * System.out.println("Initializing setup..."); // Initialize WebDriver (example
				 * for ChromeDriver) driver = new ChromeDriver(); String url =
				 * "https://rahulshettyacademy.com/AutomationPractice/";
				 * System.setProperty("webdriver.chrome.driver",
				 * "C:\\Users\\nihal\\eclipse-workspace\\Driver\\chromedriver.exe");
				 */
		        //managing steps for browser
			 
					driver.manage().deleteAllCookies();
					driver.manage().window().maximize();
					driver.get(uRL);
				
		        		
		  } catch (Exception e) {
		        e.printStackTrace();  // Print exception to identify the issue
		    }
	   
	    // Any additional setup steps like maximizing the window, etc.
	}

//After
	public void closeBrowser() throws InterruptedException {
		System.out.println("Closing the browser");
	    	Thread.sleep(2000);
	        driver.close();
	    
	}

		
	public void validateUrl() {
		String CurrnetUrl = driver.getCurrentUrl();
		System.out.println("Currnet Url: "+CurrnetUrl);
		String PageHeader = driver.findElement(By.xpath("//h1[(contains(text(),'Practice Page'))]")).getText();
		System.out.println("Object Appearance: "+ PageHeader);
		if (PageHeader.equalsIgnoreCase("Practice Page")) {
			System.out.println("Application URL is launched");
		}
	}

	public Properties readPropertiesFile(String fileName) throws IOException{
		String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\CommonPath\\PracticeApplicationXpath\\" + fileName + ".loc";
		FileReader reader = new FileReader(filePath);
		Properties prop = new Properties();
		prop.load(reader);
		
		return prop;
	}
}


