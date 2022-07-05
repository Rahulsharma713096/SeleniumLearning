package demo_1;

import org.openqa.selenium.edge.EdgeDriver;

public class TestClass_2 {
	public static void main(String[] args) {
		// Edge
				System.setProperty("webdriver.edge.driver", "D:\\selenium\\webdriver\\msedgedriver.exe");
				EdgeDriver driverE = new EdgeDriver();
				driverE.get("http://www.google.com");
				
				System.out.println("Edge");
  
  
	}
}
