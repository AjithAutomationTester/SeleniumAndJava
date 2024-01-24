package Day4_Dec2;

public class A6_StaticAndNonstaticVariable {


    int x =1 ;
    static int y = 1;

    public static void main(String[] args) {

        A6_StaticAndNonstaticVariable l1 = new A6_StaticAndNonstaticVariable();
        l1.increase();
        l1.increase();
//        l1.increase();
//
        A6_StaticAndNonstaticVariable l2 = new A6_StaticAndNonstaticVariable();
        l2.increase();

        A6_StaticAndNonstaticVariable l3 = new A6_StaticAndNonstaticVariable();
        l3.increase();
//        l2.increase();
    }

    public void increase() {


        System.out.println("Non-Static " + x++);
        System.out.println("Static " + y++);


    }
}
