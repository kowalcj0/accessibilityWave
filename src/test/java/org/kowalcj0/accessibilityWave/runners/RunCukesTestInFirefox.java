package org.kowalcj0.accessibilityWave.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Please notice that cucumber.examples.java.testNG.stepDefinitions.BeforeAfterHooks class
 * is in the same package as the steps definitions.
 * It has two methods that are executed before or after scenario.
 * I'm using it to delete cookies and take a screenshot if scenario fails.
 */
@CucumberOptions(
        features = "target/test-classes/features",
        glue = {"org.kowalcj0.accessibilityWave.stepDefinitions"},
        format = {"pretty",
                "html:target/cucumber-report/accessibility",
                "json:target/cucumber-report/accessibility/cucumber.json",
                "junit:target/cucumber-report/accessibility/cucumber.xml"})
public class RunCukesTestInFirefox extends AbstractTestNGCucumberTests {
}