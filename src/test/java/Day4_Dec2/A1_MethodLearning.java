package Day4_Dec2;

public class A1_MethodLearning {

    //Private: The access level of a private modifier is only within the class
    //Default: The access level of a default modifier is only within the package
    //Protected: The access level of a protected modifier is within the package and outside the package using extends
    //Public: It can be accessed from within the class, outside the class, within the package and outside the package.

    // With in same package and in same class all these methods are accessible
    public static void publicMethod() {
        defaultMethod();
    }

    private static void privateMethod() {
        publicMethod();
    }

    protected static void protectedMethod() {

    }

    static void defaultMethod() {

    }

    public static void main(String[] args) {
        publicMethod();
        privateMethod();
        protectedMethod();
        defaultMethod();
    }


}
