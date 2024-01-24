package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;

public class testng {

    static WebDriver driver;

    @Test(timeOut = 5000)
    public static void timeout() throws InterruptedException {
        System.out.println("start");
        Thread.sleep(4000);
        System.out.println("end");
    }

    @Test(priority = 1, groups = "Smoke")
    public static void group1() {
        System.out.println("smoke test 1");
    }

    @Test(groups = "Smoke")
    public static void group2() {
        System.out.println("smoke test 2");
    }

    @Test(groups = "Regression")
    public static void group3() {
        System.out.println("Regression test 1");
    }

    @Test(groups = "Regression")
    public static void group4() {
        System.out.println("Regression test 2");
    }


//    public static void ex() {
//        int[] arr = new int[5];
//        System.out.println(arr[10]);
//    }


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

    @Test
    public static void ex() {

        try {

            System.out.println("try");
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

//    @Test
//    public static void swti() {
//        int num = 5;
//        switch (num) {
//            case 1:
//                System.out.println("case1");
//                break;
//            case 2:
//                System.out.println(" 2");
//                break;
//
//            case 3:
//                System.out.println("case 3");
//                break;
//            default:
//                System.out.println("case default");
//        }
//    }

    @Test
    public static void swtich() {
        int num = 8;
        String name = "ajith";
        switch (name) {
            case "ajith":
                System.out.println("num value is 1");
                break;
            case "kumar":
                System.out.println("num value is 5");
                break;
            case "batman":
                System.out.println("num value is 10");
                break;
            default:
                System.out.println("num value is not matched default");
        }
    }

    //                File file = new File(ExcelData);
//        FileInputStream fileread = new FileInputStream(file);
//      XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(fileread);
//        XSSFSheet sheet = workbook.getSheet(sheetname);
//        Row rownumber = sheet.getRow(row);
//        Cell value = rownumber.getCell(col);
//        String data = value.toString();
//        return data;

    @Test
    public static void excelRead() throws Throwable {
        File file = new File("src/test/properties/test.xlsx");
        FileInputStream fileRead = new FileInputStream(file);
        XSSFWorkbook workBook = (XSSFWorkbook) WorkbookFactory.create(fileRead);
        XSSFSheet sheet = workBook.getSheet("Config");
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(2);
        System.out.println(cell);

    }
}
