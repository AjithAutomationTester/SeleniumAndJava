package Day16_Dec26;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.annotation.concurrent.ThreadSafe;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class mouseAndChromeOptions {
    public static WebDriver driver;

    public static void main(String[] args) throws Throwable {

        // chromeOption();
        // browser();
        // dragOffset();
       //  uploadBySendKeys();
         uploadByRobot();

    }

    public static void chromeOption() {

        DesiredCapabilities options = new DesiredCapabilities();
        options.setAcceptInsecureCerts(true);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--incognito");
        chromeOptions.merge(options);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.navigate().to("https://cacert.com/");

        System.out.println("browser launched in headless mode");
    }


    public static void browser() {


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://letcode.in/dropable");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }


    public static void dragOffset() throws Throwable {

        WebElement source = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement destination = driver.findElement(By.xpath("//*[@id='droppable']"));
        WebElement rightClick = driver.findElement(By.xpath("//*[normalize-space()='Watch tutorial']"));
        WebElement hover = driver.findElement(By.xpath(" //*[normalize-space()='Courses']"));
        Actions mouse = new Actions(driver);
        Thread.sleep(3000);
        //  mouse.contextClick().build().perform();  //rightClick
        //  mouse.contextClick(rightClick).build().perform();
        // mouse.dragAndDrop(source,destination).build().perform();
        // mouse.dragAndDropBy(source, 50, 50).build().perform();
        //  mouse.moveToElement(hover).build().perform();
        //   mouse.doubleClick(hover).build().perform();
        // mouse.contextClick(rightClick).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
    }

    public static void uploadBySendKeys() throws Throwable {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/upload");


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(3000);
        WebElement uploadFile = driver.findElement(By.xpath("//input[@id='file-upload']"));
        uploadFile.click();
        File file = new File("upload.xlsx");
        System.out.println(file.getAbsolutePath());
        uploadFile.sendKeys(file.getAbsolutePath());
    }

    public static void uploadByRobot() throws Throwable {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.grammarly.com/plagiarism-checker");


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        JavascriptExecutor js = (JavascriptExecutor)driver; // Scroll operation using Js Executor
        js.executeScript("window.scrollBy(0,200)"); // Scroll Down(+ve) upto browse option
        Thread.sleep(2000);
        WebElement uploadFile = driver.findElement(By.xpath("//span[normalize-space()='Upload a file']"));
        uploadFile.click();
        Thread.sleep(3000);
        File file = new File("upload.xlsx");
        //  System.out.println(file.getAbsolutePath());
        //   uploadFile.sendKeys(file.getAbsolutePath());

        StringSelection stringSelection = new StringSelection(file.getAbsolutePath());

        // Set the system clipboard content with the file path
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        // Create a Robot instance to simulate keyboard and mouse events
        Robot rb = new Robot();

        // press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_META);
        rb.keyPress(KeyEvent.VK_V);

        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_META );
        rb.keyRelease(KeyEvent.VK_V);

        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);;


    }
}
