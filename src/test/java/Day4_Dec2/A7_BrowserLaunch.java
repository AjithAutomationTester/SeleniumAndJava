package Day4_Dec2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A7_BrowserLaunch {

    public static void main(String[] args) {
        chromeLaunch();
        firefoxLaunch();

    }

    public static void chromeLaunch(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        System.out.println("Chrome browser launched successfully");
    }

    public static void firefoxLaunch(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        System.out.println("Firefox browser launched successfully");
    }
}
