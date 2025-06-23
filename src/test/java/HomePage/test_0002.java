package HomePage;

import base.BaseFile;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.TestDataReader;

public class test_0002 extends BaseFile {
    @Test(description = "Verify that the user is allowed to navigate to the About section after clicking on the service Link")
    public void navigateToAboutSection() throws InterruptedException {
        HomePage home = new HomePage(driver);

        //1. Click on the About Link
        home.click_on_about_Link();

        // Verify that user is redirect tp the right URL
        String expectedUrl = TestDataReader.get("expectedUrlAfterClickingOnAbout");
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Navigation failed");
    }
}
