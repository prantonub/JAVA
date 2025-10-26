package OOP.Constructor;

public class Person {
    String name, gender;
    long phone;
    
    Person(String n, String g, long ph){//long use for long digit number
        name = n;
        gender =g;
        phone =ph;
    }
    void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
        System.out.println();
    }
}
