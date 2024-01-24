package Day3_Dec1;



public class A4_execute {

    public static void main(String[] args) {

        A2_adminPower adminCan = new A2_adminPower();
        A3_staffPower staffCan = new A3_staffPower();

        adminCan.login();
        adminCan.printInConsole("Logged in successfully");
        adminCan.acceptTermsAndConditions();
        adminCan.printInConsole("Terms and condition accepted");
        adminCan.uploadImage();
        adminCan.addPerson();
        adminCan.removePerson();
        adminCan.logout();
        adminCan.printInConsole();
        adminCan.printInConsole("Testcases total count " + 2);

        staffCan.login();
        staffCan.acceptTermsAndConditions();
        staffCan.uploadImage();
        staffCan.viewPerson();
        staffCan.logout();
        uploadImage();
    }

    public static void uploadImage(){

    }

}
