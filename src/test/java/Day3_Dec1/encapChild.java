package Day3_Dec1;

public class encapChild extends encap {

    public static void main(String[] args) {
        encapChild c = new encapChild();
        c.seta(4);
    }
    public void checkint(){

        System.out.println("k" + geta());
    }

    public void seta(int a){

        this.a = a;
        System.out.println("k" + geta());
    }

}
