package HomePage;

import base.BaseFile;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class test_0007 extends BaseFile {
    @Test(description = "Verify that the Professional Services Card Are Present")
    public void freeSessionPage() throws InterruptedException {
        HomePage home = new HomePage(driver);

        //1. Move to the Professional Service section
        home.move_to_professional_summery_section();

        // Verify that user is redirect to the free session page or not
        Assert.assertTrue(home.six_professional_service_cards_arePresent() == 6,
                "All cards are not present");
    }
}
