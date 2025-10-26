/*
 Write a Java program to check whether a triangle is 
 equilateral, isosceles, or scalene.
 */
package Lab_1;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for sides
        System.out.print("Enter side 1: ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = input.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = input.nextDouble();

        // Checking for valid triangle
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {

            // Checking type of triangle
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is Equilateral.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }

        } else {
            System.out.println("The sides do not form a valid triangle.");
        }
    }
}
