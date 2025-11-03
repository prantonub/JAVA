package OOP.Inheritance;

public class Teacher extends Person {
    String address;

    void displayinformation2(){
        displayinformation1();
        System.out.println("Address: "+address);
    }
}
