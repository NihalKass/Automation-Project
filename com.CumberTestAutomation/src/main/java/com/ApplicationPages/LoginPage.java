package com.ApplicationPages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.componets.Utilities;

public class LoginPage extends Utilities {

	Utilities util = new Utilities();

	@FindBy(xpath = "Application.LoginPage.LoginButton")
	private WebElement LoginButton;

	public void Login() throws IOException {
		// Properties prop = util.readPropertiesFile("xPath");
		// String LoginXpath = (String) prop.get("LoginButton");
		// driver.findElement(By.xpath(LoginXpath)).click();
		if (LoginButton.isEnabled()) {
			LoginButton.click();
			System.out.println("Clicked");
		}
	}
}
