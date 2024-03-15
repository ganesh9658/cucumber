package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@regression",features = {"src\\test\\resources\\features"},glue={"StepDefination"},plugin = {"pretty","html:target/targetreportcc.html"})



public class CucumberTestRunner extends AbstractTestNGCucumberTests
{

}
