package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class collections {

    static WebDriver driver;
    //List maintain order
//List allows duplicate
//List can be accessed using index
// List returns in array type

    public static void main(String[] args) {
        //lists();
        //sets();

//        browser();
//        windowHandling();
        maps();
    }

    public static void lists() {

        List<String> myList = new ArrayList<>();
        myList.add("Name 1"); //0
        myList.add("Name 1");
        myList.add("Name 2");
        myList.add("Name 3");
        System.out.println(myList);
        String v = myList.get(2);
        System.out.println(v);

        for (String listValue : myList) {
            System.out.println(listValue);
        }

        // real time
        List<WebElement> element = driver.findElements(By.xpath("locator"));

        for (WebElement element1 : element) {
            element1.click();
            element1.sendKeys("");
        }


    }

    public static void sets() {
    //Set doesn't maintain order
//Set doesn't allow duplicate
//Set can't be accessed using index
//Set returns in array type

        Set<String> mySet = new HashSet<>();
        mySet.add("batman");
        mySet.add("batman");
        mySet.add("batman1");
        mySet.add("batman2");
        System.out.println(mySet);

        for (String element1 : mySet) {
            System.out.println(element1);
        }
    }

    public static void browser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window();
        driver.navigate().to("https://letcode.in/windows");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }

    public static void windowHandling(){

      String mainWindowHandle =   driver.getWindowHandle();
        System.out.println(mainWindowHandle);

        WebElement singleTab = driver.findElement(By.xpath("//button[@id='home']"));
        singleTab.click();

       Set<String> handles = driver.getWindowHandles();

        for (String newWindow : handles) {
          //  System.out.println(newWindow);
            if(!newWindow.equals(mainWindowHandle)) {
                driver.switchTo().window(newWindow);
                WebElement sel = driver.findElement(By.xpath("//a[normalize-space()='Product']"));
                sel.click();
                driver.close();
                break;
            }
         driver.switchTo().window(mainWindowHandle);
            driver.close();


//            List<String> listWindowHandle = new ArrayList<>(handles);
//             driver.switchTo().window(listWindowHandle.get(3));


        }




    }


    public static void maps(){

        //Map is used for key and value pairs
//Map doesn't maintain order
// Map doesn't allow duplicates but if we give then new value will be replaces
//Map is case-sensitive

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("One", 1);
        myMap.put("Two", 2);
        myMap.put("Three", 3);
        myMap.put("Three", 4);
        System.out.println(myMap);

        System.out.println(myMap.get("Two"));

        //        //real time example
//        Map<String,WebElement> element = new HashMap<>();
//        element.put("single", driver.findElement(By.xpath("//button[@id='home']")));
//        element.get("single").click();

        Map<String, WebElement> ele = new HashMap<>();
        ele.put("Login button", driver.findElement(By.xpath("locator")));
        ele.get("Login button").click();
    }
}
