package Day8_Dec8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverCommands_xyLocation_Dimension {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://letcode.in/test");
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL " + currentURL);
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/footer/a")).click();
        String clickURL = driver.getCurrentUrl();
        System.out.println("clickURL " + clickURL);
        Thread.sleep(3000);

        driver.navigate().back();
        String backURL = driver.getCurrentUrl();
        System.out.println("backURL " + backURL);
        Thread.sleep(3000);

        driver.navigate().forward();
        String forwardURL = driver.getCurrentUrl();
        System.out.println("forwardURL " + forwardURL);
        Thread.sleep(3000);

        driver.navigate().refresh();
        Thread.sleep(3000);

        WebElement xyLocation = driver.findElement(By.xpath("//*[@id='position']"));
        Point point = xyLocation.getLocation();
        int x = point.getX();
        int y = point.getY();
        System.out.println("x " + x + " y " + y);


        WebElement getColour = driver.findElement(By.xpath("//*[@id='color']"));
        String color = getColour.getCssValue("background-color");
        System.out.println(color);

        WebElement getDimension = driver.findElement(By.xpath("//*[@id='property']"));
        Rectangle dimension = getDimension.getRect();
        dimension.getDimension();
        int width = dimension.getWidth();
        int height = dimension.getHeight();

        System.out.println("width " + width + " height " + height);


    }
}
