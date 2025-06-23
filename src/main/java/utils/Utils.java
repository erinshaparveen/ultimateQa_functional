package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utils {

    // Common method to click on any element using locator key
    public static void clickOnElement(WebDriver driver, String locatorKey) {
        By locator = LocatorReader.get(locatorKey);
        driver.findElement(locator).click();
    }


}
