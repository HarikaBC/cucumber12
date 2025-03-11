package runner2;


	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;


		

	@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = "stepdefination",
	    tags="@CartTest",
	    plugin = {"pretty", "html:target/cucumber-reports"}
	)

	public class Testrunner extends AbstractTestNGCucumberTests{
		
	}

