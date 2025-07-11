package pages;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;
import utils.LocatorReader;
import utils.Utils;
import utils.Wait;

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
        Utils.clickOnElement(driver, "serviceLink");
    }

    @Step("Click on the About Link")
    public void click_on_about_Link()
    {
        Utils.clickOnElement(driver, "aboutLink");
    }

    @Step("Click on the Blog Link")
    public void click_on_blog_Link()
    {
        Utils.clickOnElement(driver, "blogLink");
    }

    @Step("Click on the Newsletter Link")
    public void click_on_newsletter_Link()
    {
        Utils.clickOnElement(driver, "newsLetterLink");
    }

    @Step("Move the Cursor Over the Education Text")
    public void move_cursor_over_education()
    {
        Utils.moveToElement(driver, "educationText");
    }

    @Step("Verify that the Education list is displayed or not")
    public boolean education_list_isDisplayed()
    {
        Wait.waitForVisibility(driver, "educationList");
        return Utils.isDisplayed(driver, "educationList");
    }

    @Step("Click On Free Session Link")
    public void click_on_freeSession()
    {
        Utils.clickOnElement(driver, "freeSession");
    }

    @Step("Move To the professional Service Section")
    public void move_to_professional_summery_section()
    {
        Wait.waitForPresence(driver, "scheduleFreeSession");
        Utils.scrollThePage(driver, 500);
    }

    @Step("Verify that professional Service Section cards are displayed")
    public boolean professional_service_cards_are_displayed()
    {
        Wait.waitForVisibility(driver, "educationList");
        return Utils.isDisplayed(driver, "educationList");
    }

    @Step("Verify that there are total six professional Service cards are present")
    public int six_professional_service_cards_arePresent()
    {
        return Utils.elementCount(driver, "professionalServiceCardsCount");
    }

    @Step("Scroll the Page 'UltimateQA testing solution' section")
    public void ultimateQATestingSolutionCard()
    {
        Wait.waitForPresence(driver, "scheduleFreeSession");
        Utils.scrollThePage(driver, 1000);
    }

    @Step("Scroll the Page 'UltimateQA testing solution' cards are present")
    public int ultimateQATestingSolutionCardArePresent()
    {
        return Utils.elementCount(driver, "ultimateQATestingSolution");
    }

    @Step("Click on the Automation Program Full Story Link")
    public void click_automation_program_fullStory_Link()
    {
        Utils.scrollThePage(driver, 1000);
        Utils.clickOnElement(driver, "automationProgramFullStoryLink");
    }

    @Step("Click on the Insurance Company Full Story Link")
    public void click_insurance_company_fullStory_Link()
    {
        Utils.scrollThePage(driver, 1000);
        Utils.clickOnElement(driver, "insuranceCompanyFullStoryLink");
    }

    @Step("Click on the Faster Feedback Full Story Link")
    public void click_faster_feedback_fullStory_Link()
    {
        Utils.scrollThePage(driver, 1000);
        Utils.clickOnElement(driver, "fasterFeedbackFullStoryLink");
    }

    @Step("Click on the Faster ENGINEERS TRAINED Story Link")
    public void click_engineer_trained_fullStory_Link()
    {
        Utils.scrollThePage(driver, 1000);
        Utils.clickOnElement(driver, "engineersTrainedFullStoryLink");
    }

}
