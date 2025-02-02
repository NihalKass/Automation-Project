package com.componets;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class hooks extends AbstractTestNGCucumberTests{
	

    private WebDriver driver;

    @BeforeClass
    public void setUpClass() {
        // Initialize WebDriver (example for ChromeDriver)
    	driver = new ChromeDriver();
    	String url = "https://rahulshettyacademy.com/AutomationPractice/";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nihal\\eclipse-workspace\\Driver\\chromedriver.exe");
        driver.manage().deleteAllCookies();
        driver.get(url);
        // Any additional setup steps like maximizing the window, etc.
    }

    @AfterClass
    public void tearDownClass() {
        if (driver != null) {
            driver.quit();
        }
    }

}
