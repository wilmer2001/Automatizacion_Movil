package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "hus",
        tags = "@SmokeTest",
        plugin = {
                //"pretty",
                //"html:target/cucumber-reports/cucumber-pretty.html",
                //"json:target/cucumber-reports/CucumberTestReport.json",
                //"rerun:target/cucumber-reports/rerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        })
public class RunCucumber {
}
