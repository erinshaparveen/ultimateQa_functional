package utils;

import org.openqa.selenium.By;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LocatorReader {

    private static Properties properties = new Properties();

    static {
        try{
            FileInputStream homePageFile = new FileInputStream("src/main/java/locator/HomePage.properties");
            properties.load(homePageFile);

            FileInputStream sessionPageFile = new FileInputStream("src/main/java/locator/FreeSession.properties");
            properties.load(sessionPageFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static By get(String key) {
        String[] locatorParts = properties.getProperty(key).split(",", 2);
        String type = locatorParts[0].trim();
        String value = locatorParts[1].trim();

        return switch (type.toLowerCase()) {
            case "id"       -> By.id(value);
            case "name"     -> By.name(value);
            case "xpath"    -> By.xpath(value);
            case "css"      -> By.cssSelector(value);
            case "linktext" -> By.linkText(value);
            case "partial"  -> By.partialLinkText(value);
            default         -> throw new RuntimeException("Unknown locator type: " + type);
        };
    }
}
