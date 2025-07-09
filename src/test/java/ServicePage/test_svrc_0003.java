package ServicePage;

import base.BaseFile;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ServicePage;

public class test_svrc_0003 extends BaseFile {

    @Test(description = "Verify that the Professional Services Card Are Present")
    public void freeSessionPage() throws InterruptedException {
        ServicePage service = new ServicePage(driver);
        HomePage home = new HomePage(driver);

        //1. Click on the Service Link
        home.click_on_service_Link();

        // Verify that user is redirect to the free session page or not
        Assert.assertTrue(service.six_professional_service_cards_arePresent() == 6,
                "All cards are not present");
    }
}
