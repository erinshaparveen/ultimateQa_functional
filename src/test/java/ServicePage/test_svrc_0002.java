package ServicePage;

import base.BaseFile;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ServicePage;

public class test_svrc_0002 extends BaseFile {
    @Test(description = "Verify that the 'World's Best Test Automation Solutions' section is present")
    public void educationSection() throws InterruptedException {
        ServicePage service = new ServicePage(driver);
        HomePage home = new HomePage(driver);

        //1. Click on the Service Link
        home.click_on_service_Link();
    }
}
