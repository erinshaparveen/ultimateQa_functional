package HomePage;

import base.BaseFile;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FreeSession;
import pages.HomePage;

public class test_0006 extends BaseFile {
    @Test(description = "Verify that after clicking on the free session link user is redirect to the free session page")
    public void freeSessionPage() throws InterruptedException {
        HomePage home = new HomePage(driver);
        FreeSession freeSession = new FreeSession(driver);

        //1. Click On Free Session Link
        home.click_on_freeSession();

        // Verify that user is redirect to the free session page or not
        Assert.assertTrue(freeSession.free_session_page_isDisplayed(), "User is not redirect to the free session page");

    }
}
