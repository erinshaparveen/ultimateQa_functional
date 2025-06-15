package test;

import base.BaseFile;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginTest extends BaseFile {

    @Test(description = "Valid user can login")
    public void testLogin() {
        LoginPage login = new LoginPage(driver);
        login.login("admin", "admin123");

        Assert.assertTrue(driver.getTitle().contains("Dashboard"));
    }
}

