package utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Wait {
    private static final int DEFAULT_TIMEOUT = 20;

    // Wait for visibility of element
    public static WebElement waitForVisibility(WebDriver driver, String locatorKey) {
        By locator = LocatorReader.get(locatorKey);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Wait for element to be clickable
    public static WebElement waitForClickability(WebDriver driver, String locatorKey) {
        By locator = LocatorReader.get(locatorKey);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // Wait for presence of element in DOM
    public static WebElement waitForPresence(WebDriver driver, String locatorKey) {
        By locator = LocatorReader.get(locatorKey);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    // Wait for element to be invisible
    public static boolean waitForInvisibility(WebDriver driver, String locatorKey) {
        By locator = LocatorReader.get(locatorKey);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    // Wait for text to be present in element
    public static boolean waitForTextToBePresent(WebDriver driver, String locatorKey, String text) {
        By locator = LocatorReader.get(locatorKey);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
        return wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }
}
