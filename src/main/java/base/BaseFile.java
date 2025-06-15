package base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.ConfigReader;

public class BaseFile {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.initDriver();
        driver.get(ConfigReader.get("base.url"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}