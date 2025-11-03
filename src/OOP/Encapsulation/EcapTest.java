package OOP.Encapsulation;

public class EcapTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Pranto Islam");
        p1.setAge(20);
       
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
}
