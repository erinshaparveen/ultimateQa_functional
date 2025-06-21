package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;
import utils.LocatorReader;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Click on the Element")
    public void clickOnElement() {
        driver.findElement(LocatorReader.get("simpleElementsLink")).click();
    }


}
