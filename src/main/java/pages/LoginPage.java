package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
        WebDriver driver;
        By usernameField = By.id("user");
        By passwordField = By.id("pass");

        public LoginPage(WebDriver driver) {
            this.driver = driver;
        }

        public void login(String user, String pass) {
            driver.findElement(usernameField).sendKeys(user);
            driver.findElement(passwordField).sendKeys(pass);
        }
    }

