package utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.util.RetryAnalyzerCount;

public class Retry implements IRetryAnalyzer{

	public int retryCount=0;
	public static final int maxRetryCount=2;

	public boolean retry(ITestResult result) 
	{
		if(retryCount<maxRetryCount)
		{
			retryCount++;
			return true;
		}
		return false;
	}
	
	
	

}
