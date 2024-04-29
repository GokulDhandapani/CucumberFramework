package runnerfile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Featurefile",
glue= "stepdefinition",monochrome = true)
public class runnertest extends AbstractTestNGCucumberTests {

}
