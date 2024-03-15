package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPageCC
{
	WebDriver driver;
	public LoginPageCC(WebDriver driver)
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
public void Username(String username)
{
	driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys(username);
	
}
public void Password(String password)
{
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
	
}
public void LoginButton()
{
	driver.findElement(By.xpath("//*[@id='login-button']")).click();
}
public void HomepageValidation()
{
	Assert.assertTrue(driver.findElements(By.xpath("//*[@class='app_logo']")).size()>0,"User is now landed in homePage");
}

}
