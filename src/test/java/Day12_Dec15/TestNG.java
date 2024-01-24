package Day12_Dec15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestNG {

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

    @Test(groups = "Smoke")
    public static void firstMethod(){
        System.out.println("smoke 1");

    }

    @Test(groups = "Smoke")
    public static void secondMethod(){
        System.out.println("smoke 2");

    }

    @Test(groups = "Regression")
    public static void thirdMethod(){
        System.out.println("regression 1");

    }
    @Test(groups = "Regression")
    public static void fourthMethod(){
        System.out.println("regression 2");

    }

    @Test(enabled = true)
    public static void depend1(){
        System.out.println("depend 1");

    }

    @Test(dependsOnMethods = "depend1")
    public static void depend2(){
        System.out.println("depend 2");

    }


    @Test(timeOut = 5000)
    public static void timeOut() throws InterruptedException {
        System.out.println("Start");
        Thread.sleep(10000);
        System.out.println("End");

    }

    @Test(invocationCount = 2)
    public static void count() throws InterruptedException {
        System.out.println("1");
    }

    @Test()
    public static void softAssert() throws InterruptedException {
        SoftAssert sf = new SoftAssert();
        sf.assertEquals("ajith", "nisha");
        System.out.println("Soft assert doesn't fail the test");
    }

    @Test()
    public static void hardAssert() throws InterruptedException {
        Assert.assertEquals("ajith", "nisha");
        System.out.println("error");
    }

    public static class tablesAndTestNG {

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

        public static void webTable() {

            List<WebElement> row = driver.findElements(By.xpath("//table[@id='shopping']//tbody//tr"));
            int rowSize = row.size();

            for (int i = 1; i <= rowSize; ) {

                List<WebElement> column = driver.findElements(By.xpath("//table[@id='shopping']//tbody//tr[" + i + "]//td"));
                int colSize = column.size();
                for (int j = 1; j <= colSize; ) {
                    WebElement table = driver.findElement(By.xpath("//table[@id='shopping']//tbody//tr[" + i + "]//td[" + j + "]"));

                    System.out.println(table.getText());
                  //  table.getText();
                    j++;
                }
                i++;
            }

        }

        //Pre condition
        // BeforeSuite
        // BeforeTest
        //BeforeClass
        //BeforeMethod

        @Test
        public static void test(){

        }

        @Test
        public static void test2(){

        }

        @Test
        public static void test3(){

        }


        //Post condition
        //AfterMethod
        // AfterClass
        //AfterTest
        //AfterSuite


    //
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

        @Test(priority = 1)
        public static void e1(){
            System.out.println("1");

        }

        @Test(priority = 3)
        public static void e2(){
            System.out.println("2");

        }

        @Test(enabled = false)
        public static void e3(){
            System.out.println("3");

        }


    @Test(dependsOnMethods = "e3")
        public static void e4(){
            System.out.println("4");

        }


    }
}
