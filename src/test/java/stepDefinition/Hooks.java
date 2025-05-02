package stepDefinition;

import org.openqa.selenium.WebDriver;

import driverManager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


	
	 WebDriver driver;
	 
	 @Before
	 public void setup() {
		 
		 DriverFactory df = new DriverFactory();
		 driver =df.initBr("chrome");
		 driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	 }
	 
	 @After
	 public void tearDown() {
		 driver.quit();
	 }
	 
	 
	 
}
