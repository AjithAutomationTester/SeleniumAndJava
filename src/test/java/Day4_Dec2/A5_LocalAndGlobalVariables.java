package Day4_Dec2;

import org.openqa.selenium.WebElement;

public class A5_LocalAndGlobalVariables {

    int num;
    String userName;

    static int x ;
    static String name;
    //Global variable can be static and not static
    String e;

    public static void main(String[] args) {
        A5_LocalAndGlobalVariables d = new A5_LocalAndGlobalVariables();
        d.local();
        d.global();
        d.global1();
        localvar2();

    }

      void local() {
      int num = 0;
      String e;
        System.out.println(num);
          WebElement ele = null;
       this.e =   ele.getText();

    }

    void global() {
        System.out.println(num);
        userName = "Nisha";
        System.out.println(userName);

    }

    void global1() {
        System.out.println(num);
        System.out.println(userName);


    }

    public static void localvar(){

        int x =4;
        System.out.println(x);
        //Local variable can't be static and we should declare a value for it.
    }

    public static void localvar2(){


        System.out.println(x);
        System.out.println(name);
        //Local variable can't be used in another method
    }



}
