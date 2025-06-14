package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By simpleElementsLink = By.linkText("Interactions with simple elements");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSimpleElementsLink() {
        driver.findElement(simpleElementsLink).click();
    }
}
