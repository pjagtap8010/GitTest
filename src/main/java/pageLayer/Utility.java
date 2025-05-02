package pageLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	public Utility() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void clearAndSendKeys(WebElement ele, String val ) {
		   
		
		
		elementIsVisible(ele);
		  ele.clear();
		  ele.sendKeys(val);
		  
	}
	
	public WebElement elementIsVisible(WebElement ele) {
		
		ele = wait.until(ExpectedConditions.visibilityOf(ele));
		return ele;
	}
	
	

}
