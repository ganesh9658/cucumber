package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@smoke or @perform"
,features = {"src\\test\\resources\\featureswithtag"}
,glue={"StepDefination"}
,plugin = {"pretty","html:target/targetreportcc.html"})



public class CucumberTestRunner2withTags extends AbstractTestNGCucumberTests
{

}
