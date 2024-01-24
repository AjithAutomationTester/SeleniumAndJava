package Day7_Dec7;

import org.openqa.selenium.WebElement;

public class A3_LetsCode extends A2_baseClass {


    public static void main(String[] args) throws Throwable {
        A3_LetsCode letsCode = new A3_LetsCode();
        letsCode.chromeLaunch("Chrome", "https://letcode.in/");
        letsCode.goToLoginPage();
        letsCode.enterEmailId();
        letsCode.enterPassword();
        letsCode.clickLogin();
        //   letsCode.closeBrowser();
        letsCode.clickWorkSpace();
        letsCode.clickEdit();
        letsCode.enterFullName();
        letsCode.clearTextFromField();
        letsCode.getTextFromField();
        letsCode.getAttributeFromField();
        letsCode.getTextFromField2();
        letsCode.checkDisabled();

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


    public void clickWorkSpace() throws Throwable {

        WebElement workSpace = getElementByLinkText("Work-Space");
        clickElement(workSpace);
        printInConsole("Work space button is clicked");
        sleep(2000);

    }

    public void clickEdit() throws Throwable {

        WebElement editButton = getElementByXpath("//a[normalize-space()='Edit']");
        clickElement(editButton);
        printInConsole("Edit button is clicked");
        sleep(2000);


    }


    public void enterFullName() {

        WebElement fullName = getElementById("fullName");
        enterDataInTheElement(fullName, "Nisha wonder woman");
        printInConsole("Full name is entered");

    }

    public void clearTextFromField() throws Throwable {

        WebElement clearText = getElementByXpath("//input[@value='I am good']");
        clearText(clearText);
        printInConsole("Text is cleared");
        sleep(2000);

    }


    public void getTextFromField() throws Throwable {

        WebElement textBox = getElementById("getMe");
        String text = getText(textBox);
        printInConsole(text);
        sleep(2000);

    }


    public void getAttributeFromField() throws Throwable {

        WebElement textBox = getElementById("getMe");
        String text = getAttribute(textBox, "type");
        printInConsole(text);
        sleep(2000);

    }

    public void getTextFromField2() throws Throwable {

        WebElement textBox = getElementByXpath("//*[text()='Confirm text is readonly']");
        String text = getText(textBox);
        printInConsole(text);
        sleep(2000);

    }


    public void checkDisabled() throws Throwable {

        WebElement enableOrNot = getElementById("noEdit");
        boolean status = isEnabled(enableOrNot);
        printInConsole("Element is disabled " + status);
        sleep(2000);

    }


}




