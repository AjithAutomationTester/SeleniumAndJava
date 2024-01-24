package Day10_Dec12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Frames_Dropdown_WindowHandling {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        browser();
        //framesTest();
        // dropdown();
        wH();
    }


    public static void browser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window();
        driver.navigate().to("https://letcode.in/windows");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }

    public static void framesTest() {
        WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Inner HTML']"));
        ele.click();
        //  driver.switchTo().frame(0);
        // driver.switchTo().frame("firstFr");

        WebElement frame = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
        driver.switchTo().frame(frame);
        WebElement frameName = driver.findElement(By.xpath("//input[@placeholder='Enter name']"));
        frameName.sendKeys("ajith");
        WebElement frameEmail = driver.findElement(By.xpath("//input[@placeholder='Enter email']"));
        frameEmail.sendKeys("kumar");


    }

    public static void dropdown() {

        WebElement sel = driver.findElement(By.xpath("//a[normalize-space()='Drop-Down']"));
        sel.click();
        WebElement ele = driver.findElement(By.xpath("//select[@id='fruits']"));
        Select drop = new Select(ele);
        // drop.selectByVisibleText("Apple");
        drop.selectByValue("1");
        String value = drop.getFirstSelectedOption().getText();
        System.out.println(value);

        WebElement mul = driver.findElement(By.xpath("//select[@id='superheros']"));
        Select drop2 = new Select(mul);
        boolean status = drop2.isMultiple();
        System.out.println(status);
        drop2.selectByValue("ta");
        drop2.selectByVisibleText("Batman");
        //  drop2.deselectByVisibleText("Batman");
        List<WebElement> g = drop2.getAllSelectedOptions();
        for (WebElement elem : g) {

            System.out.println(elem.getText());
        }


    }

    public static void wH() throws InterruptedException {

        String mainHandle = driver.getWindowHandle();
        System.out.println(mainHandle);

        WebElement singleTab = driver.findElement(By.xpath("//button[@id='home']"));
        singleTab.click();

        Set<String> windowHandles = driver.getWindowHandles();


        for (String handle : windowHandles) {
            System.out.println(handle);
        }


        for (String handle : windowHandles) {
            if (!handle.equals(mainHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
            WebElement sel = driver.findElement(By.xpath("//a[normalize-space()='Product']"));
            sel.click();

            driver.switchTo().window(mainHandle);


            List<String> handleList = new ArrayList<>(windowHandles);
           // driver.switchTo().window(handleList.get(3));
            driver.switchTo().window(mainHandle);
            singleTab.click();
            driver.close();
            Thread.sleep(5000);
            driver.quit();

        }
    }

