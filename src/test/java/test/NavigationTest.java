package test;

import base.BaseFile;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class NavigationTest extends BaseFile {

    @Test
    public void testNavigationToSimpleElements() {
        HomePage home = new HomePage(driver);
        home.clickSimpleElementsLink();

        String expectedUrl = "https://ultimateqa.com/simple-html-elements-for-automation/";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl, "Navigation failed");
    }
}