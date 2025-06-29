package HomePage;

import base.BaseFile;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class test_0008 extends BaseFile {
    @Test(description = "Verify that the 'UltimateQA testing solution' section is Present")
    public void ultimateQA_testing_solution() throws InterruptedException {
        HomePage home = new HomePage(driver);

        //1. Move to the 'UltimateQA testing solution' section
        home.ultimateQATestingSolutionCard();

        // Verify that user is redirect to the 'Leading the World In Automated Testing''
        Assert.assertTrue(home.ultimateQATestingSolutionCardArePresent() == 3,
                "'UltimateQA testing solution' Cards are not present");
    }
}
