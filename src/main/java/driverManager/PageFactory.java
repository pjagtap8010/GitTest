package driverManager;

import org.openqa.selenium.WebDriver;

import pageLayer.HomePage;

public class PageFactory {
	
	 public static HomePage home;
	 
	 public static HomePage getHoemPage (WebDriver driver) {
		 
		 if(home==null) {
			 return new HomePage(driver);
		 }
		 
		 else {
			 return home;
		 }		 
		 
	 }
}

