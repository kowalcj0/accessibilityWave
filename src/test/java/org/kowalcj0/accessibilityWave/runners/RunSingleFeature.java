package org.kowalcj0.accessibilityWave.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "target/test-classes/features/accessibility/homepage.feature",
        glue = {"org.kowalcj0.accessibilityWave.stepDefinitions"},
        format = {"pretty",
                "html:target/cucumber-report/accessibility",
                "json:target/cucumber-report/accessibility/cucumber.json",
                "junit:target/cucumber-report/accessibility/cucumber.xml"})
public class RunSingleFeature extends AbstractTestNGCucumberTests {
}