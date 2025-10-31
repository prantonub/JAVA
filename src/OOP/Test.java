package OOP;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();// create first object teacher1
        teacher1.setInformation("Pranto Islam", "Male", 17890880);
        teacher1.displayInformation();// display info of teacher1


        Teacher teacher2 = new Teacher(); // create second object teacher2
        teacher2.setInformation("Shakil Rana", "Male", 19890990);
        teacher2.displayInformation();// display info of teacher2

    }
}
