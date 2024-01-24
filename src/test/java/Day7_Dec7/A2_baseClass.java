package Day7_Dec7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class A2_baseClass extends A1_browserLaunch {



    public WebElement getElementByXpath(String xpath) {

        WebElement element = driver.findElement(By.xpath(xpath));

        return element;
    }

    public void getElementByName(String name) {

        WebElement element = driver.findElement(By.name(name));

    }

    public WebElement getElementById(String id) {

        WebElement element = driver.findElement(By.id(id));

        return element;
    }

    public WebElement getElementByLinkText(String linkText) {

        WebElement element = driver.findElement(By.linkText(linkText));

        return element;
    }

    public void clickElement(WebElement element) {


        element.click();

    }

    public void clearText(WebElement element){

        element.clear();

    }

    public boolean isEnabled(WebElement element){

        return  element.isEnabled();
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

    public String getText(WebElement element)  {
        return element.getText();
    }

    public String getAttribute(WebElement element, String attribute)  {

        return element.getAttribute(attribute);
    }

    public void sleep(int time) throws Throwable {

        Thread.sleep(time);
    }

}
