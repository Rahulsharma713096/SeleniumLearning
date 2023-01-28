package com.RSJald.SwagLabsTestingLearning.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Enter user name
	private void setUserName(String username) {
		driver.findElement(By.id("user-name")).sendKeys(username);

	}

	// Enter password
	private void setPassword(String passwd) {
		driver.findElement(By.id("password")).sendKeys(passwd);

	}

	// Click on login button

	private void clickLogin() {

		driver.findElement(By.cssSelector("#login-button")).click();

	}

	// Get the title of Login Page

	public String getLoginPageTitle() {

		return driver.getTitle();

	}

	public boolean loginToSwagLabs(String strUserName, String strPasword) {

		// Fill user name

		this.setUserName(strUserName);

		// Fill password

		this.setPassword(strPasword);

		// Click Login button

		this.clickLogin();
		// Check Login Sucess
		try {
			String product = driver
					.findElement(By.cssSelector("#header_container > div.header_secondary_container > span")).getText();
			Assert.assertEquals(product, "PRODUCTS");
			return true;
		} catch (NoSuchElementException | AssertionError nse) {
			this.loginFailed();
			return false;
		}
	}

	public void loginFailed() {
		String error = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
		System.out.println(error);
	}

}
