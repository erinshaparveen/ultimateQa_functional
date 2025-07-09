package ServicePage;

import base.BaseFile;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ServicePage;

public class test_svrc_0002 extends BaseFile {
    @Test(description = "Verify that the 'Our Professional Services' section is present")
    public void WorldBestService() throws InterruptedException {
        ServicePage service = new ServicePage(driver);
        HomePage home = new HomePage(driver);

        //1. Click on the Service Link
        home.click_on_service_Link();

        // Assert that the section is displayed
        Assert.assertTrue(service.world_best_service_is_present(), "Our Professional Services section is not Present");
    }
}
