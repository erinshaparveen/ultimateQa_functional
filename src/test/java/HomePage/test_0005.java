package HomePage;

import base.BaseFile;
import utils.TestDataReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


public class test_0005 extends BaseFile {
    @Test(description = "Verify that the list is opened when user move the cursor over the Education text")
    public void educationSection() throws InterruptedException {
        HomePage home = new HomePage(driver);

        //1. Move the cursor over the Education
        home.move_cursor_over_education();

        // Assert that the element is displayed
        Assert.assertTrue(home.education_list_isDisplayed(), "Education list is not displayed.");

    }
}
