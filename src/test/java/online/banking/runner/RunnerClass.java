package online.banking.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		plugin="json:target/cucumber.json",
		features="./src/test/resources",
		glue="step.Definations",
		tags="@Smoke"
		
		
		
		)

public class RunnerClass extends AbstractTestNGCucumberTests {

}
