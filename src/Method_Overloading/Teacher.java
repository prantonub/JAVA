package Method_Overloading;

public class Teacher extends Person {
    String address;

  @Override  
        void displayinformation(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
    }
}
