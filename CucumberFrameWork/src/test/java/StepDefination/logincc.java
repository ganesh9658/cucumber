package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.LoginPageCC;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logincc
{
	LoginPageCC Login;
	WebDriver driver1;
	@Given("user is on a Login Page")
	public void user_is_on_a_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("user_is_on_a_login_page");
	    driver1=new ChromeDriver();
	    driver1.get("https://www.saucedemo.com/");
	    driver1.manage().window().maximize();
	   
	}



	@When("^user enter \"(.*)\" and \"(.*)\"$")
	public void user_enter_username_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("user_enter_username_and_password");
	
		 Login=new LoginPageCC(driver1);
		 Login.Username(username);
		 Login.Password(password);
	    
	}

	

	@And("user click on Login button")
	public void user_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("user_click_on_login_button");
		 Login.LoginButton();
	}

	

	@Then("user is navigate to HomePage")
	public void user_is_navigate_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("user_is_navigate_to_home_page");
		Login.HomepageValidation();
	}

	

	@And("browser is closed")
	public void browser_is_closed() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("browser_is_closed");
		// driver1.close();
		 driver1.quit();
	}



}
