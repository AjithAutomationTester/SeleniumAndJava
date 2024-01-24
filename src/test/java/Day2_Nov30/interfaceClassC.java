package Day2_Nov30;

public class interfaceClassC extends inheritanceClassA implements interfaceClassA , interfaceClassB {

    public static void main(String[] args) {
        interfaceClassC test = new interfaceClassC();
//        test.firstInterfaceMethod();
//        test.secondInterfaceMethod();
        test.thirdInterfaceMethod();
        test.fourthInterfaceMethod();
        firstInheritanceMethod();
        interfaceClassA.firstInterfaceBody();
        interfaceClassB.secondInterfaceBody();
    }

//    @Override
//    public void firstInterfaceMethod() {
//        System.out.println("firstInterfaceMethod");
//    }
//
//    @Override
//    public void secondInterfaceMethod() {
//        System.out.println("secondInterfaceMethod");
//    }

    @Override
    public void thirdInterfaceMethod() {
        System.out.println("thirdInterfaceMethod");
    }

    @Override
    public void fourthInterfaceMethod() {
        System.out.println("fourthInterfaceMethod");
    }


}
