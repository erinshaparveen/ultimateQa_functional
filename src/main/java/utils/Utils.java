package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Utils {

    // Common method to click on any element using locator key
    public static void clickOnElement(WebDriver driver, String locatorKey) {
        By locator = LocatorReader.get(locatorKey);
        driver.findElement(locator).click();
    }

    // Check if element is displayed
    public static boolean isDisplayed(WebDriver driver, String locatorKey) {
        By locator = LocatorReader.get(locatorKey);
        return driver.findElement(locator).isDisplayed();
    }

    // Check if element is present in the DOM
    public static boolean isPresent(WebDriver driver, String locatorKey) {
        By locator = LocatorReader.get(locatorKey);
        return !driver.findElements(locator).isEmpty();
    }

    // Check if element is enabled
    public static boolean isEnabled(WebDriver driver, String locatorKey) {
        By locator = LocatorReader.get(locatorKey);
        return driver.findElement(locator).isEnabled();
    }

    // Get text of an element
    public static String getText(WebDriver driver, String locatorKey) {
        By locator = LocatorReader.get(locatorKey);
        return driver.findElement(locator).getText();
    }

    // Send keys to an input field
    public static void typeText(WebDriver driver, String locatorKey, String text) {
        By locator = LocatorReader.get(locatorKey);
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    // Check if element is selected (for checkbox/radio)
    public static boolean isSelected(WebDriver driver, String locatorKey) {
        By locator = LocatorReader.get(locatorKey);
        return driver.findElement(locator).isSelected();
    }

    // Move the Cursor Over the Element
    public static void moveToElement(WebDriver driver, String locatorKey) {
        By locator = LocatorReader.get(locatorKey);
        WebElement element = driver.findElement(locator);
        Actions ac=new Actions(driver);
        ac.moveToElement(element).perform();
    }

    // Move the Cursor Over the Element
    public static void scrollThePage(WebDriver driver , int pixel)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, arguments[0]);", pixel);
    }

    public static int elementCount(WebDriver driver, String locatorKey)
    {
        By locator = LocatorReader.get(locatorKey);
        List<WebElement> elements = driver.findElements(locator);
        int count = elements.size();
        return count;
    }


}
