package Day2_Nov30;

import org.openqa.selenium.WebElement;

public class BaseClass {


    public static void clickElement() {
        WebElement element = null;
      //  element.click();
        System.out.println("Element is clicked");
    }

    public static void sendKeys() {
        WebElement element = null;
      //  element.sendKeys();
        System.out.println("Value is entered in the element");
    }
}
