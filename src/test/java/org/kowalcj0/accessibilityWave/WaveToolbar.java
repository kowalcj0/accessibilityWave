package org.kowalcj0.accessibilityWave;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author: jk
 * @created: 2014-06-02:19
 */
public class WaveToolbar {

    public static void getReport(WaveReport report_type, WebDriver driver){
        WebElement b = driver.findElement((By.tagName("body")));

        switch (report_type) {
            case ERRORS:
                b.sendKeys(Keys.ALT + "T");
                b.sendKeys(Keys.ARROW_DOWN);
                b.sendKeys(Keys.ARROW_DOWN);
                b.sendKeys(Keys.ARROW_DOWN);
                b.sendKeys(Keys.ARROW_RIGHT);
                b.sendKeys(Keys.ENTER);
                break;
            case STRUCTURE:
                b.sendKeys(Keys.ALT + "T");
                b.sendKeys(Keys.ARROW_DOWN);
                b.sendKeys(Keys.ARROW_DOWN);
                b.sendKeys(Keys.ARROW_DOWN);
                b.sendKeys(Keys.ARROW_RIGHT);
                b.sendKeys(Keys.ARROW_DOWN);
                b.sendKeys(Keys.ENTER);
                break;
            case TEXT_ONLY:
                b.sendKeys(Keys.ALT + "T");
                b.sendKeys(Keys.ARROW_DOWN);
                b.sendKeys(Keys.ARROW_DOWN);
                b.sendKeys(Keys.ARROW_DOWN);
                b.sendKeys(Keys.ARROW_RIGHT);
                b.sendKeys(Keys.ARROW_DOWN);
                b.sendKeys(Keys.ARROW_DOWN);
                b.sendKeys(Keys.ENTER);
                break;
            case OUTLINE:
                b.sendKeys(Keys.ALT + "T");
                b.sendKeys(Keys.ARROW_DOWN);
                b.sendKeys(Keys.ARROW_DOWN);
                b.sendKeys(Keys.ARROW_DOWN);
                b.sendKeys(Keys.ARROW_RIGHT);
                b.sendKeys(Keys.ARROW_DOWN);
                b.sendKeys(Keys.ARROW_DOWN);
                b.sendKeys(Keys.ARROW_DOWN);
                b.sendKeys(Keys.ENTER);
                break;
            default:
                break;
        }

    }


    public static enum WaveReport {
        ERRORS,
        STRUCTURE,
        TEXT_ONLY,
        OUTLINE;
    }
}
