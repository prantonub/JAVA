package inputdemo;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        String name;
        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.println("Welcome "+name);
    }
}
