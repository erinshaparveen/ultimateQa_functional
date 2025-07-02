package HomePage;

import base.BaseFile;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.TestDataReader;

public class test_0012 extends BaseFile {
    @Test(description = "Verify that the user is allowed to navigate to the ENGINEERS TRAINED Full Story Page after clicking on the Full Story Link")
    public void navigateToServiceSection() throws InterruptedException {
        HomePage home = new HomePage(driver);

        //1. Click on the ENGINEERS TRAINED Full Story Link
        home.click_engineer_trained_fullStory_Link();

        // Verify that user is redirect tp the right URL
        String expectedUrl = TestDataReader.get("engineersTrainedFullStory");
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Navigation failed");
    }
}
