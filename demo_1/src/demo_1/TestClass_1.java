package demo_1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass_1 {

	public static void main(String[] args) {
		// Chrome
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\webdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		System.out.println("Chrone");
		// Firefox
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\webdriver\\geckodriver.exe");
		FirefoxDriver driverF = new FirefoxDriver();
		driverF.get("http://www.google.com");
	
		System.out.println("Firefox");
		
	}

}
