package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= ".//FeatureFiles/Login.feature", glue={"stepDefinitions"})
public class TestRun {
	
}
