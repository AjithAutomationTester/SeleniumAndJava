package Day9_Dec11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class alert {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        browser();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Dialog']"));
        ele.click();
        simpleAlert();
       // promptAlert();


    }

    public static void browser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window();
        driver.navigate().to("https://letcode.in/test");
    }

    public static void simpleAlert() throws InterruptedException {

        WebElement ele = driver.findElement(By.xpath("//button[@id='accep']"));
        ele.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());

      //  alert.accept();
        alert.dismiss();
    }

    public static void promptAlert() throws InterruptedException {

        WebElement ele = driver.findElement(By.xpath("//button[@id='prompt']"));
        ele.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Nisha");
        alert.accept();
        WebElement ele1 = driver.findElement(By.xpath("//p[@id='myName']"));
        ele1.getText();
        System.out.println( ele1.getText());

        //alert.dismiss();
    }


}
