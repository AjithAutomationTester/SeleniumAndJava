package Day5_Dec4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetsCode {

    WebDriver driver;

    public static void main(String[] args) throws Throwable {
        LetsCode letsCode = new LetsCode();
        letsCode.chromeLaunch();
        letsCode.goToLoginPage();
        letsCode.enterEmailId();
        letsCode.enterPassword();
        letsCode.clickLogin();
     //   letsCode.closeBrowser();

    }

    public void chromeLaunch() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/signin");
        System.out.println("LetCode website launched successfully");
    }

    public void goToLoginPage() {

        WebElement loginPage = driver.findElement(By.linkText("Log in"));
        loginPage.click();
        System.out.println("User is in login page");

    }

    public void enterEmailId() {
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("ajithkumar454win@gmail.com");
        System.out.println("Email id is entered");

    }

    public void enterPassword() throws Throwable {
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("TestAccount");
        System.out.println("Password is entered");
        Thread.sleep(5000);
    }

    public void clickLogin() throws Throwable {
        WebElement loginButton = driver.findElement(By.xpath("(//button[@class='button is-primary'])[1]"));
        loginButton.click();
        System.out.println("Login button is clicked");
        Thread.sleep(5000);
    }

    public void closeBrowser(){
        driver.close();
        System.out.println("Browser is closed");
    }
}




