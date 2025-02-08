package com.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;


public class hooks{
	
	public WebDriver driver;
	
	public hooks() {
		if (this.driver == null) {
		//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nihal\\eclipse-workspace\\Driver\\chromedriver.exe");
           // this.driver = new ChromeDriver(); // Initialize the WebDriver
        }
	}
	public WebDriver getDriver() {
        return driver;
    }
	
    //@Before
    public void Launchsetup() {
    	 try {
    	        // Add logging to check the execution flow
    	        System.out.println("Initializing setup...");
    	        // Initialize WebDriver (example for ChromeDriver)
    	         this.driver = new ChromeDriver();
    	    	String url = "https://rahulshettyacademy.com/AutomationPractice/";
    	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nihal\\eclipse-workspace\\Driver\\chromedriver.exe");
    	        driver.manage().deleteAllCookies();
    	        driver.manage().window().maximize();
    	        driver.get(url);
    	        
    	  } catch (Exception e) {
    	        e.printStackTrace();  // Print exception to identify the issue
    	    }
       
        // Any additional setup steps like maximizing the window, etc.
    }
    
 
    
    

    //@After
    public void closeBrowser() {
        if (driver != null) {
            driver.close();
        }
    }

}
