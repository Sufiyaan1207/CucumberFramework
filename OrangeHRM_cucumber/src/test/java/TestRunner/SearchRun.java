package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\main\\resources\\Features\\search.feature"},
		glue = "StepDefinations",
		plugin = {"pretty","html:target/cucumbmer-reports/Search_Report.html"}
		)


public class SearchRun extends AbstractTestNGCucumberTests{

}
