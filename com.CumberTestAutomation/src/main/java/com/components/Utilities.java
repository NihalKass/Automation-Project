package com.components;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utilities{

	public static WebDriver driver;
	
	//@Before
    public void Launchsetup() {
    	 try {
    	        //trying another way to invoke browser using passing all url and parameter from properties file
    		 Properties prop = new Properties();
    		 FileInputStream file = new FileInputStream(System.getProperty("user.dir")
    				 +"\\src\\main\\resources\\GlobalData\\GlobalData.properties");
    		 
    		// String browserName = System.getProperty("browser")!=null? System.getProperty("browser"):prop.g
    		 
    		 
    		 
    		 
    		 	// Add logging to check the execution flow
    	        System.out.println("Initializing setup...");
    	        // Initialize WebDriver (example for ChromeDriver)
    	        driver = new ChromeDriver();
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

	public Properties readPropertiesFile(String fileName) throws IOException {
		String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\CommonPath\\" + fileName + ".properties";
		FileReader reader = new FileReader(filePath);
		Properties prop = new Properties();
		prop.load(reader);
		
		return prop;
	}
}


