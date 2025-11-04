package ThisKeyword;

public class Person {
    String name;//Instance variable
    int age;
    String address;
    Person(String name, int age){ //local variable
        this.name = name;
        this.age = age;
    }

    Person(String name, int age, String address){
        this(name, age);
        this.address = address;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
    }
}
