package driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
	
	public static WebDriver driver;
	
	public WebDriver initBr (String br) {
		
		if(br.equals("chrome")) {
			
			driver = new ChromeDriver();
		}
		else {
			driver = new EdgeDriver();
		}
		
		return driver;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
