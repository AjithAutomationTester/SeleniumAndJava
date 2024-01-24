package Day2_Nov30;

import org.openqa.selenium.WebElement;

public class executeClass extends BaseClass implements interfaceInFramework {

    public static void main(String[] args) {
        executeClass test = new executeClass();
        test.mandatoryClick();
        test.mandatoryEnterValue();
        interfaceInFramework.notMandatoryElement();
        clickElement();
        sendKeys();
    }

    @Override
    public void mandatoryClick() {
        WebElement element = null;
       // element.click();
        System.out.println("Mandatory element clicked");
    }

    @Override
    public void mandatoryEnterValue() {
        WebElement element = null;
       // element.sendKeys("text entered from interface");
        System.out.println("Mandatory texted entered");
    }
}
