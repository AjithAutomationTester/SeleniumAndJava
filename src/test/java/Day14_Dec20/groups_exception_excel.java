package Day14_Dec20;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class groups_exception_excel {


    @Test(timeOut = 5000)
    public static void timeOut() throws InterruptedException {
        System.out.println("Start");
        Thread.sleep(4000);
        System.out.println("End");

    }

    @Test(groups = "Smoke")
    public static void firstMethod() {
        System.out.println("smoke 1");

    }

    @Test(groups = "Smoke")
    public static void secondMethod() {
        System.out.println("smoke 2");

    }

    @Test(groups = "Regression")
    public static void thirdMethod() {
        System.out.println("regression 3");

    }

    @Test(groups = "Regression")
    public static void fourthMethod() {
        System.out.println("regression 4");

    }

    @Test
    public static void exChecked() {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void ex() {
        int[] arr = new int[5];
        System.out.println(arr[10]);
    }

    @Test
    public static void swti() {
        int num = 5;
        switch (num) {
            case 1:
                System.out.println("case1");
                break;
            case 2:
                System.out.println(" 2");
                break;

            case 3:
                System.out.println("case 3");
                break;
            default:
                System.out.println("case default");
        }
    }

    @Test
    public static String readExcel() throws IOException {
        File file = new File("");
        FileInputStream fileread = new FileInputStream(file);
        XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(fileread);
        XSSFSheet sheet = workbook.getSheet("sheetname");
        Row rownumber = sheet.getRow(0);
        Cell value = rownumber.getCell(2);
        String data = value.toString();
        return data;

    }


}
