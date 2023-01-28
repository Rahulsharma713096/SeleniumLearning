package com.RSJald.SwagLabsTestingLearning.Pages;

import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public int listAllItems() {
		// Return the size of item present on Home Page
		return driver.findElements(org.openqa.selenium.By.cssSelector("div [class='inventory_item_name']")).size();

	}

	public Boolean searchItemPresent(String item) {
		// Check the item present or not
		long count = driver.findElements(org.openqa.selenium.By.cssSelector("div [class='inventory_item_name']"))
				.stream().filter(a -> a.getText().contains(item)).count();

		if (count > 0)
			return true;
		return false;

	}

	public Boolean addToCart(String item) {
		if (this.searchItemPresent(item)) {

			return true;
		} else {
			return false;
		}

	}

}
