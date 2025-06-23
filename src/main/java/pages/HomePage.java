package pages;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;
import utils.LocatorReader;
import utils.Utils;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Click on the Element")
    public void clickOnElement() {
        driver.findElement(LocatorReader.get("simpleElementsLink")).click();
    }

    @Step("Click on the Service Link")
    public void click_on_service_Link()
    {
        Utils.clickOnElement(driver, "servicelink");
    }

    @Step("Click on the About Link")
    public void click_on_about_Link()
    {
        Utils.clickOnElement(driver, "aboutlink");
    }

    @Step("Click on the Blog Link")
    public void click_on_blog_Link()
    {
        Utils.clickOnElement(driver, "bloglink");
    }

    @Step("Click on the Newsletter Link")
    public void click_on_newsletter_Link()
    {
        Utils.clickOnElement(driver, "newsletterlink");
    }


}
