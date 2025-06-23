package HomePage;

import base.BaseFile;
import utils.TestDataReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


public class test_0001 extends BaseFile {
    @Test(description = "Verify that the user is allowed to navigate to the service section after clicking on the service Link")
    public void navigateToServiceSection() throws InterruptedException {
        HomePage home = new HomePage(driver);

        //1. Click on the Service Link
        home.click_on_service_Link();

        // Verify that user is redirect tp the right URL
        String expectedUrl = TestDataReader.get("expectedUrlAfterClickingOnService");
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Navigation failed");
    }
}
