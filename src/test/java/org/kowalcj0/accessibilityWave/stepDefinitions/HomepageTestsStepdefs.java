package org.kowalcj0.accessibilityWave.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.kowalcj0.accessibilityWave.DriverManager;
import org.apache.log4j.Logger;
import org.kowalcj0.accessibilityWave.WaveToolbar;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Contains step definitions for two feature files: first.feature & second.feature
 * @author jk
 */
public class HomepageTestsStepdefs {

    static Logger log = Logger.getLogger(HomepageTestsStepdefs.class);
    WebDriver driver = DriverManager.getDriver();
    WebElement webElement;
    WebDriverWait wait = new WebDriverWait(driver, 10);

    @Given("^I am on \"(.+)\"$")
    public void givenIAmOn(String URL) {
        log.info("Given I'm on "+URL+"<br/>");
        driver.get(URL);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("weather_title_link")));
    }

    @When("^I ask for \"(.+)\" report$")
    public void whenIAskForAccessibilityReport(String report_type) {
        log.info("When I ask for " + report_type + " report");
        if (report_type.toLowerCase().contains("error")) {
            WaveToolbar.getReport(WaveToolbar.WaveReport.ERRORS, driver);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("wave4tip")));
        }
        if (report_type.toLowerCase().contains("structure")) {
            WaveToolbar.getReport(WaveToolbar.WaveReport.STRUCTURE, driver);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("wave4highlight")));
        }
        if (report_type.toLowerCase().contains("text")) {
            WaveToolbar.getReport(WaveToolbar.WaveReport.TEXT_ONLY, driver);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("wave4styled")));
        }
        if (report_type.toLowerCase().contains("outline")) {
            WaveToolbar.getReport(WaveToolbar.WaveReport.OUTLINE, driver);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("wave4tip")));
        }
    }

    @Then("^I should see the accessibility report$")
    public void thenIShouldSeeTheAccessibilityReport() {
        log.info("Then I should see the accessibility report");
        //assertThat("Element is not visible!!!", webElement.isDisplayed(), is(true));
        List<WebElement> waveTips = driver.findElements(By.className("wave4tip"));
        if (waveTips.size() == 0) assertTrue("Could not locate any WAVE validations - please ensure that WAVE is installed correctly", false);
        for (WebElement waveTip : waveTips) {
            if (!waveTip.getAttribute("alt").startsWith("ERROR:")) continue;
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            String fileName = String.format("{0}{1}{2}", "WAVE", dateFormat.format(cal.getTime()), ".png");

            byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);

            assertTrue("WAVE errors were found on the page. Please see screenshot for details", false);
        }
    }


    @Then("^I should take the screenshot$")
    public void takeAScreenshot() {
        log.debug("Then I should take a screenshot");

    }

}