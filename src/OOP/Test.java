package OOP;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.name = "Pranto Islam";
        teacher1.gender = "Male";
        teacher1.phone = 1785551585;

        System.out.println("Name: "+teacher1.name);
        System.out.println("Gender: "+teacher1.gender);
        System.out.println("Phone: "+teacher1.phone);

        Teacher teacher2 = new Teacher();
        teacher2.name = "Asif Islam";
        teacher2.gender = "Male";
        teacher2.phone = 1325551500;

        System.out.println("\nName: "+teacher2.name);
        System.out.println("Gender: "+teacher2.gender);
        System.out.println("Phone: "+teacher2.phone);
    }
}
