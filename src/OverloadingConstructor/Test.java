package OverloadingConstructor;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();

        Teacher teacher2 = new Teacher("Pranto", "male");
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher("Hasan", "male", 176799035);
        teacher3.displayInformation();
    }
}
