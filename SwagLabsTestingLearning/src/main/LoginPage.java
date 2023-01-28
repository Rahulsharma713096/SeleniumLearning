package com.RSJald.SwahLabsTestingLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Enter user name
	public void setUserName(String username) {
		driver.findElement(By.id("user-name")).sendKeys(username);

	}

	// Enter password
	public void setPassword(String passwd) {
		driver.findElement(By.id("password")).sendKeys(passwd);

	}

	// Click on login button

	public void clickLogin() {

		driver.findElement(By.cssSelector("#login-button")).click();

	}

	// Get the title of Login Page

	public String getLoginPageTitle() {

		return driver.getTitle();

	}

	public void loginToSwagLabs(String strUserName, String strPasword) {

		// Fill user name

		this.setUserName(strUserName);

		// Fill password

		this.setPassword(strPasword);

		// Click Login button

		this.clickLogin();
	}

}
