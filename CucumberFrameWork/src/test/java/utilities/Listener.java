package utilities;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.IAnnotationTransformer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ITestAnnotation;

public class Listener extends TakeScreenshot implements ITestListener, IAnnotationTransformer 
{
	public Listener(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@AfterMethod
	public void onTestSuccess(ITestResult results) {
		try {
			getScreenshot();
			System.out.println("Test Case pass check folder for screenshot");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestFailure(ITestResult results) {

		try {
			getScreenshot();

			System.out.println("Test Case fail check folder for screenshot");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}public void transform(ITestAnnotation annotation,Class testClass,Method method,Constructor constructor)
	{
		System.out.println("retrying");
		annotation.setRetryAnalyzer(Retry.class);
	}
}
