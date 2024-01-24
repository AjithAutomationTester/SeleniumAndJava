package Day13_Dec18;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testNG {

    @Test(invocationCount = 4)
    public static void count() {
        System.out.println("no of run");

    }

    //soft assert -verify
    //Hard assert

    @Test
    public static void soft() {
        SoftAssert softassert = new SoftAssert();
        softassert.assertEquals("batman" , "superman");
        System.out.println("went beyond assert");
       // softassert.assertAll();

    }

    @Test
    public static void hard() {
        Assert.assertEquals("batman" , "superman");
        System.out.println("went beyond assert");


    }
}
