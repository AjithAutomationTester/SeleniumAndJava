package Day3_Dec1;

public abstract class A1_commonActions {


    public void login(){

    }

    public void uploadImage(){
        System.out.println("Parent class");
    }

    public void logout(){


    }

    public abstract void acceptTermsAndConditions();

    public void printInConsole(){
        System.out.println("Testcase executed");
    }

    public void printInConsole(String text){
        System.out.println(text);
    }
    public void printInConsole(String text, int num){
        System.out.println(text + num);
    }

public static void test(){


}

}
