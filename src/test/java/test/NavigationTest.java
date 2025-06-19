package test;

import base.BaseFile;
import utils.TestDataReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class NavigationTest extends BaseFile {

    @Test(description = "Verify valid login")
    public void testNavigationToSimpleElements() {
        HomePage home = new HomePage(driver);
        home.clickSimpleElementsLink();

        String expectedUrl = TestDataReader.get("expectedUrl");
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Navigation failed");
    }
}