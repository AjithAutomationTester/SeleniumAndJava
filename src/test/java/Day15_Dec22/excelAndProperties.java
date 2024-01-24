package Day15_Dec22;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class excelAndProperties {

    @Test
    public static Cell excel(int row, int col) throws Throwable {

        File file = new File("src/test/properties/test.xlsx");
        FileInputStream fileRead = new FileInputStream(file);
        XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(fileRead);
        XSSFSheet sheet = workbook.getSheet("Config");
        Row rowNum = sheet.getRow(row);
        Cell value = rowNum.getCell(col);

        return value;

    }

    @Test
    public static void childClass() throws Throwable {
        System.out.println(excel(1, 1));
        System.out.println(excel(1, 2));
    }

    @Test
    public static String property(String value) throws Throwable {


        Properties prop = new Properties();
        FileInputStream input = new FileInputStream("src/test/properties/locators.Properties");
        prop.load(input);

        String retrievedValue = prop.getProperty(value);
        return retrievedValue;
    }

    @Test
    public static void propChild() throws Throwable {
        String locators = property("Email");
        String LoginButton = property("LoginButton");
        System.out.println(LoginButton);
    }

    @Test
    public static void split() {

        String name = "Ajith=Kumar";
        String[] splitValue = name.split("=");
        String firsName = splitValue[0].trim();
        String lastName = splitValue[1].trim();
        System.out.println(firsName);
        System.out.println(lastName);

    }

    @Test
    public static void ss() throws Throwable {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/signin");
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String ssLocation = System.getProperty("user.dir") + "/test-Output/report/Screenshot/name.png";
        FileUtils.copyFile(source, new File(ssLocation));


    }

    @Test
    public static void elementSS() throws Throwable {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/signin");
        WebElement element = driver.findElement(By.linkText("Log in"));
        File screenShot = element.getScreenshotAs(OutputType.FILE);
        String ssLocation = System.getProperty("user.dir") + "/test-Output/report/Screenshot/name.png";
        FileUtils.copyFile(screenShot, new File(ssLocation));
    }


}
