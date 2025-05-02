package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.DriverFactory;
import driverManager.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageLayer.HomePage;

public class HomeStep {
	
	HomePage home;
	public HomeStep() {
		
		home = PageFactory.getHoemPage(DriverFactory.getDriver());
	}
	
	
	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
	    WebDriver driver = DriverFactory.getDriver();
	    driver.manage().window().maximize();
	}
	
	@Then("verify the title of home page {string}")
	public void verify_the_title_of_home_page(String string) {
		String act_title = home.getTitleOfPage();
		String exp_title = string;
		Assert.assertEquals(act_title, exp_title, "title mismatch---------------");
	}

}
