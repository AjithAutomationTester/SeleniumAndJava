package Day17_Dec27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Properties;

public class readLocatorsFromFile {
    public static String prop;
    public static WebDriver driver;
    public static  WebElement element;

    @Test
    public static void readTheValueOf(String value) throws Throwable {

        Properties locator = new Properties();
        FileInputStream fileInputStream = new FileInputStream("/Users/ajith/Desktop/SeleniumAutomaion/src/test/properties/locators.Properties");
        locator.load(fileInputStream);
        prop = locator.getProperty(value);

    }

    public static WebElement readLocators(String value) throws Throwable {

        readTheValueOf(value);
        String[] locator1 = prop.split("=");
        String locatorType = locator1[0].trim();
        String locatorValue = locator1[1].trim();


        switch (locatorType.toLowerCase()) {
            case "xpath":
              element =  driver.findElement(By.xpath(locatorValue));
                break;

            case "id":
                 element =   driver.findElement(By.id(locatorValue));
                break;

            case "linktext":
                 element =  driver.findElement(By.linkText(locatorValue));
                break;
        }
        return element;
    }

    public static void loginElement() throws Throwable {

     WebElement ele = readLocators("Email");
     ele.click();


        WebElement ele2 =  readLocators("GoToLoginPage");


        WebElement ele3 =   readLocators("Name");

    }
}
