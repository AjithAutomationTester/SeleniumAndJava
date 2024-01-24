package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class frames {

    static WebDriver driver;
    public static void main(String[] args) {
        browser();
      //  frame();
        select();
    }


    public static void browser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window();
        driver.navigate().to("https://letcode.in/test");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }
    public static void frame(){

        WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Inner HTML']"));
        ele.click();

        WebElement element = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
       // driver.switchTo().frame(0);
        driver.switchTo().frame("firstFr");
        driver.switchTo().frame(element);


        WebElement framEle = driver.findElement(By.xpath("//input[@placeholder='Enter name']"));
        framEle.sendKeys("bat");
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();


    }

    public static void select(){
        WebElement sel = driver.findElement(By.xpath("//a[normalize-space()='Drop-Down']"));
        sel.click();

        WebElement droplist = driver.findElement(By.xpath("//select[@id='fruits']"));

        Select drop = new Select(droplist);
        drop.selectByValue("1");
//        drop.selectByVisibleText("Banana");
//        drop.selectByIndex(0);
      WebElement value =  drop.getFirstSelectedOption();
      value.getText();
      boolean status =  drop.isMultiple();
      System.out.println(status);

        WebElement mul = driver.findElement(By.xpath("//select[@id='superheros']"));
       // mul.click();
        Select mult = new Select(mul);
        boolean status2 = mult.isMultiple();
        System.out.println(status2);
        mult.selectByValue("bt");
        mult.selectByVisibleText("Batwoman");
       mult.selectByIndex(5);

       mult.deselectByVisibleText("Batwoman");
       mult.deselectAll();
       List<WebElement> v =  mult.getAllSelectedOptions();
        for (WebElement elem : v) {

            System.out.println(elem.getText());
        }





    }
}
