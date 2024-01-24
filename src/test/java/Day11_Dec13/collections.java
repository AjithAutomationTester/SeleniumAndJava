package Day11_Dec13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;

public class collections {

    static WebDriver driver;
    //List, Set, and Map

    public static void main(String[] args) {
      //  lists();
        sets();
      //  maps();

    }

    public static void lists() {
//List maintain order
//List allows duplicate
//List can be accessed using index
// List returns in array type


        List<String> myList = new ArrayList<>();
        myList.add("Name 1");
        myList.add("Name 3");
        myList.add("Name 2");
        myList.add("Name 3");
        System.out.println(myList);
        System.out.println(myList.get(1));

        for (String namesAdded : myList) {
            System.out.println(namesAdded);

        }
//realTime example
        List<WebElement> menuLinks = driver.findElements(By.xpath("(//a[normalize-space()='Tabs'])"));
        for (WebElement elementList : menuLinks) {
            System.out.println(elementList.getText());
        }
    }


    public static void sets() {
//Set doesn't maintain order
//Set doesn't allow duplicate
//Set can't be accessed using index
//Set returns in array type

        Set<String> mySet = new HashSet<>();
        mySet.add("Red");
        mySet.add("Green");
        mySet.add("Blue");
        mySet.add("Red");
        System.out.println(mySet);
        // System.out.println(mySet.get);


        System.out.println("Elements in the set:");
        for (String color : mySet) {
            System.out.println(color);
        }


        //realTime example
        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
            System.out.println(handle);
        }

// Switch to a specific window
        String mainWindowHandle = driver.getWindowHandle();
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                // Perform actions in the new window
                break;
            }
        }
    }

    public static void maps() {
 //Map is used for key and value pairs
//Map doesn't maintain order
// Map doesn't allow duplicates but if we give then new value will be replaces
//Map is case-sensitive

        Map<String, Integer> myMap = new HashMap<>();

        // Adding key-value pairs to the map
        myMap.put("One", 1);
        myMap.put("Two", 2);
        myMap.put("Three", 3);
        myMap.put("One", 2);
        myMap.put("One", 3);

        System.out.println(myMap);
        System.out.println("Value for key 'one': " + myMap.get("One"));


//        //real time example
//        Map<String,WebElement> element = new HashMap<>();
//        element.put("single", driver.findElement(By.xpath("//button[@id='home']")));
//        element.get("single").click();

    }



}
