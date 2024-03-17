package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import PageObject.LoginPageCC;

public class TakeScreenshot extends LoginPageCC
{
	public TakeScreenshot(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	WebDriver driver;
	public void getScreenshot() throws IOException
	{
		Date date=new Date();
		String newdate=date.toString().replace(":", "-").replace(" ", "-");
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//Frame1Screenshot/"+newdate+".png"));
		
		
	}}
	
	