package utilities;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer
{
public void transform(ITestAnnotation annotation,Class testClass,Method method,Constructor constructor)
{
	System.out.println("retrying");
	annotation.setRetryAnalyzer(Retry.class);
}
}
