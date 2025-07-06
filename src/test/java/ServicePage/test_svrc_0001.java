package ServicePage;

import base.BaseFile;
import pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ServicePage;

public class test_svrc_0001 extends BaseFile {
    @Test(description = "Verify that the 'World's Best Test Automation Solutions' section is present")
    public void educationSection() throws InterruptedException {
        ServicePage service = new ServicePage(driver);
        HomePage home = new HomePage(driver);

        //1. Click on the Service Link
        home.click_on_service_Link();

        // Assert that the section is displayed
        Assert.assertTrue(service.automation_solutions_is_displayed(), "Automation section is not Present");

    }
}
