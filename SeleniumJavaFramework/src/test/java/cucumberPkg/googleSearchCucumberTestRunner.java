package cucumberPkg;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/cucumberPkg", 
glue={"cucumberPkg.googleSearchTestCucumberStepDef", "cucumberPkg"}, 
monochrome=true, 
plugin= {"pretty", "html:target/cucumber.html"})
public class googleSearchCucumberTestRunner extends AbstractTestNGCucumberTests{
	
}
