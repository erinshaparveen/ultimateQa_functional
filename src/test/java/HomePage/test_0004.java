package HomePage;

import base.BaseFile;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.TestDataReader;

public class test_0004 extends BaseFile {
    @Test(description = "Verify that the user is allowed to navigate to the Newsletter section after clicking on the service Link")
    public void navigateToNewsletterSection() throws InterruptedException {
        HomePage home = new HomePage(driver);

        //1. Click on the Newsletter Link
        home.click_on_newsletter_Link();

        // Verify that user is redirect tp the right URL
        String expectedUrl = TestDataReader.get("expectedUrlAfterClickingOnNewsletter");
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Navigation failed");
    }
}
