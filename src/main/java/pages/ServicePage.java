package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import utils.Utils;
import utils.Wait;

public class ServicePage {

    WebDriver driver;

    public ServicePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Verify that \"World's Best Test Automation Solutions\" section is displayed")
    public boolean automation_solutions_is_displayed()
    {
        Wait.waitForVisibility(driver, "testAutomationSection");
        return Utils.isDisplayed(driver, "testAutomationSection");
    }
}
