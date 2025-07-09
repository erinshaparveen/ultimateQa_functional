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

    @Step("Verify that \"Our Professional Services\" section is displayed")
    public boolean world_best_service_is_present()
    {
        Wait.waitForVisibility(driver, "professionalService");
        return Utils.isDisplayed(driver, "professionalService");
    }

    @Step("Verify that there are total six professional Service cards are present")
    public int six_professional_service_cards_arePresent()
    {
        return Utils.elementCount(driver, "professionalServiceCardsCount");
    }
}
