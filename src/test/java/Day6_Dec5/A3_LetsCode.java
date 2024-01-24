package Day6_Dec5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class A3_LetsCode extends A2_baseClass {


    public static void main(String[] args) throws Throwable {
        A3_LetsCode letsCode = new A3_LetsCode();
        letsCode.chromeLaunch("Chrome", "https://letcode.in/");
        letsCode.goToLoginPage();
        letsCode.enterEmailId();
        letsCode.enterPassword();
        letsCode.clickLogin();
        letsCode.closeBrowser();


    }


    public void goToLoginPage() {

        WebElement loginPage = getElementByLinkText("Log in");
        clickElement(loginPage);
        printInConsole("User is in login page");

    }

    public void enterEmailId() throws Throwable {

        WebElement email = getElementByXpath("//input[@name='email']");
        enterDataInTheElement(email, "ajithkumar454win@gmail.com");
        printInConsole("Email id is entered");
        wait(3000);

    }

    public void enterPassword() throws Throwable {

        WebElement password = getElementByXpath("//input[@name='password']");
        enterDataInTheElement(password, "TestAccount");
        printInConsole("Password is entered");
        wait(3000);

    }

    public void clickLogin() throws Throwable {

        WebElement loginButton = getElementByXpath("(//button[@class='button is-primary'])[1]");
        clickElement(loginButton);
        printInConsole("Login button is clicked");
        wait(3000);

    }


}




