package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class alertClass {

   static WebDriver driver;
    public static void main(String[] args) {
        browser();
        WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Dialog']"));
        ele.click();
        simpleAlert();
//        promptAlert();
//        confirm();


    }


    public static void simpleAlert(){

        WebElement ele = driver.findElement(By.xpath("//button[@id='accept']"));
        ele.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
      //  alert.dismiss();

    }

    public static  void promptAlert(){

        WebElement ele = driver.findElement(By.xpath("//button[@id='prompt']"));
        ele.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Nisha");
      //  alert.dismiss();
        alert.accept();
        WebElement ele1 = driver.findElement(By.xpath("//p[@id='myName']"));
      System.out.println(ele1.getText());

    }

    public static void confirm(){
        WebElement ele = driver.findElement(By.xpath("//button[@id='confirm']"));
        ele.click();
      Alert alert =  driver.switchTo().alert();

        alert.accept();
     //   alert.dismiss();
        System.out.println(alert.getText());

    }


    public static void browser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window();
        driver.navigate().to("https://letcode.in/test");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicitWait
    }

}
