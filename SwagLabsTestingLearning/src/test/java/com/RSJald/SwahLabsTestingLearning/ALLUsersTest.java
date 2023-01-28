package com.RSJald.SwahLabsTestingLearning;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.RSJald.SwagLabsTestingLearning.Pages.LoginPage;

import driverconnection.ConnectionBrowser;

public class ALLUsersTest {

	@Test(dataProvider = "getData")
	public void testLoginUsers(HashMap<String, String> data) {
		WebDriver driver = null;
		String username = data.get("username");
		String passwd = data.get("password");

		try {
			driver = new ConnectionBrowser().getConnection();
			new LoginPage(driver).loginToSwagLabs(username, passwd);
			ScreenShotAndLogs.ScreenShots.getScreenShot(driver);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

	@DataProvider
	public Object[][] getData() {
		List<HashMap<String, String>> jsonDataMap = DataReader.LoginDetailsReader.getJSONDataMap();
		return new Object[][] { { jsonDataMap.get(0) }, { jsonDataMap.get(1) }, { jsonDataMap.get(2) },
				{ jsonDataMap.get(3) } };

	}
}
