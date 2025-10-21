package arithmaticdemo;

import java.util.Scanner;

public class ArithmeticUserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2, result;

        System.out.print("Enter First Number: ");
        num1 = input.nextInt();

        System.out.print("Enter second Number: ");
        num2 = input.nextInt();

        result = num1 + num2 ;
        System.out.println("Sum = "+result);

        result = num1 - num2 ;
        System.out.println("Subtraction = "+result);

        result = num1 * num2 ;
        System.out.println("Multiplication = "+result);

        result = num1 / num2 ;
        System.out.println("Division = "+result);

        result = num1 % num2 ;
        System.out.println("Remainder = "+result);
    }
}
