package Abstraction;

public class Test {
    public static void main(String[] args) {
        MobileUser mobile;
        mobile = new Rahim();
        mobile.sendMassage();

        mobile = new Karim();
        mobile.sendMassage();
    }
}
