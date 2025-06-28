package pages;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;
import utils.TestDataReader;
import utils.Utils;
import utils.Wait;

public class FreeSession {
    WebDriver driver;

    public FreeSession(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Verify that user is redirect to the session page")
    public boolean free_session_page_isDisplayed()
    {
        String data = TestDataReader.get("freeSessionPageText");
        Wait.waitForTextToBePresent(driver, "freeSessionPage", data);
        return Utils.isDisplayed(driver, "freeSessionPage");
    }
}
