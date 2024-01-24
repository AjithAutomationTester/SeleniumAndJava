package Day6_Dec5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class A2_baseClass extends A1_browserLaunch {



    public WebElement getElementByXpath(String xpath) {

        WebElement element = driver.findElement(By.xpath(xpath));

        return element;
    }


    public WebElement getElementByLinkText(String linkText) {

        WebElement element = driver.findElement(By.linkText(linkText));

        return element;
    }

    public void clickElement(WebElement element) {


        element.click();

    }

    public void enterDataInTheElement(WebElement element, String enterText) {

        element.sendKeys(enterText);

    }

    public void printInConsole(String text) {

        System.out.println(text);
    }

    public void wait(int time) throws Throwable {

      Thread.sleep(time);
    }


}
