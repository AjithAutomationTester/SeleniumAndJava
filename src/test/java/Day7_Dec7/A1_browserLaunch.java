package Day7_Dec7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A1_browserLaunch {

    WebDriver driver;

    public void chromeLaunch(String browser, String URL) {

        if (browser.equalsIgnoreCase("Chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(URL);
            System.out.println("Website launched successfully");
        } else if (browser.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(URL);
            System.out.println("Website launched successfully");

        }
    }

    public void closeBrowser() {
        driver.close();
        System.out.println("Browser closed successfully");

    }
}
