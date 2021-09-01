package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Faceook {
	WebDriver driver;
	@Given("^launch to facebook account$")
	public void launch_to_facebook_account() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/mdsiddique/Downloads/chromedriver");
		driver= new ChromeDriver();
		driver.get("http://www.facebook.com");
	 
	}

	@When("^i put user name and password$")
	public void i_put_user_name_and_password() throws Throwable {
		WebElement e= driver.findElement(By.xpath("//input[@name='email']"));
		e.sendKeys();
		WebElement e2= driver.findElement(By.xpath("//input[@type='password']"));
		e2.sendKeys();
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^click login button$")
	public void click_login_button() throws Throwable {
		WebElement e3= driver.findElement(By.xpath("//input[@name='login']]"));
		e3.sendKeys();
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^I able to login facebook account$")
	public void i_able_to_login_facebook_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
