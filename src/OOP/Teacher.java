package OOP;

public class Teacher {
    String name, gender;
    int phone;
// method to set teacher's information
    void setInformation(String n, String g, int ph){
        name = n;
        gender = g;
        phone = ph;
    }
 // method to display teacher's information
    void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
        System.out.println();//using for prints a blank line

    }
}
