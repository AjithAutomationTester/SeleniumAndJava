package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverCommands {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        browserSetup();
        // navigate();
        // xyCor();
        //   dimension();
        getColour();
    }

    public static void browserSetup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://letcode.in/test");
        String url = driver.getCurrentUrl();
        System.out.println("Launch url " + url);
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/footer/a")).click();


    }


    public static void navigate() throws InterruptedException {

        driver.navigate().to("https://letcode.in/test");
        String url = driver.getCurrentUrl();
        System.out.println("Launch url " + url);
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/footer/a")).click();
        String currurl = driver.getCurrentUrl();
        System.out.println("After click url " + currurl);
        Thread.sleep(3000);

        driver.navigate().back();
        String backurl = driver.getCurrentUrl();
        System.out.println("Back url " + backurl);
        Thread.sleep(3000);

        driver.navigate().forward();
        String forwardurl = driver.getCurrentUrl();
        System.out.println("Forward url " + forwardurl);
        Thread.sleep(3000);

        driver.navigate().refresh();

    }

    public static void xyCor() {

        WebElement element = driver.findElement(By.xpath("//*[@id='color']"));
        Point coOridnates = element.getLocation();
        int x = coOridnates.getX();
        int y = coOridnates.getY();
        System.out.println("x " + x + "y " + y);

    }

    public static void dimension() {

        WebElement element = driver.findElement(By.xpath("//*[@id='property']"));
        Rectangle dimen = element.getRect();
        int heig = dimen.getHeight();
        int wid = dimen.getWidth();
        System.out.println("heig " + heig + " wid " + wid);


    }

    public static void getColour() {
        WebElement element = driver.findElement(By.xpath("//*[@id='color']"));
        String colour = element.getCssValue("background-color");
        System.out.println(colour);

    }
}
