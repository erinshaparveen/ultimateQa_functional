package HomePage;

import base.BaseFile;
import utils.TestDataReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


public class services extends BaseFile {
    @Test(description = "Verify that the user is allowed to navigate to the service section after clicking on the service Link")
    public void navigateToServiceSection() {
        HomePage home = new HomePage(driver);
        home.clickOnElement();

        String expectedUrl = TestDataReader.get("expectedUrl");
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Navigation failed");
    }
}
