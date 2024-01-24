package Day12_Dec15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tablesAndTestNG {

    static WebDriver driver;
    public static void main(String[] args) {
        browser();
        webTable();
    }

    public static void browser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window();
        driver.navigate().to("https://letcode.in/table");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }


    public static void webTable(){

        List<WebElement> row =  driver.findElements(By.xpath("//table[@id='shopping']//tbody//tr"));
        int rowSize = row.size();


        for (int i = 1; i<=rowSize; ){
            List<WebElement> column =  driver.findElements(By.xpath("//table[@id='shopping']//tbody//tr["+i+"]//td"));
            int colSize = column.size();

            for(int j = 1; j<=colSize; ) {
                WebElement table = driver.findElement(By.xpath("//table[@id='shopping']//tbody//tr["+i+"]//td[" + j + "]"));
                System.out.println(table.getText());
                j++;

            }
            i++;
        }


    }


    //Precondition
    // BeforeSuite
    // BeforeTest
    //BeforeClass
    //BeforeMethod


    //Test annotation
    // @Test

    //Post condition
    //AfterMethod
    // AfterClass
    //AfterTest
    //AfterSuite

    //Priority
    //DependsOnMethods
    //Groups
    //Parallel
    //Timeout
    //invocationCount
    //Asserts


    @BeforeSuite
    public static void beforeSuite(){
        System.out.println("BeforeSuite");

    }

    @BeforeTest
    public static void beforeTest(){
        System.out.println("BeforeTest");

    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("BeforeClass");

    }
    //
    @BeforeMethod
    public static void beforeMethod(){
        System.out.println("BeforeMethod");

    }

    @Test(priority = 0)
    public static void e(){
        System.out.println("1");

    }

    @Test(priority = 1)
    public static void d(){
        System.out.println("2");

    }

    @Test(priority = 3)
    public static void c(){
        System.out.println("3");

    }
    @Test(priority = 4)
    public static void b(){
        System.out.println("4");

    }
    @Test(priority = 5)
    public static void a(){
        System.out.println("5");

    }
    @Test(enabled = true)
    public static void depend1(){
        System.out.println("depend 1");

    }

    @Test(dependsOnMethods = "depend1")
    public static void depend2(){
        System.out.println("depend 2");

    }
}
