package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"FeatureFiles"},tags={"@DataTable"},
monochrome=true,glue={"stepDefinition"},plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/Logindata.html","pretty", "html:target/cucumber-reports"})
public class Runner2 {

}
