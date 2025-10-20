package arithmaticdemo;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int num1, num2, result;
        num1 = 20;
        num2 = 10;

        result = num1 + num2 ;
        System.out.println("Sum = "+result);

        result = num1 - num2 ;
        System.out.println("Subtraction = "+result);

        result = num1 * num2 ;
        System.out.println("Multiplication = "+result);

        result = num1 / num2 ;
        System.out.println("Division = "+result);

        result = num1 % num2 ;
        System.out.println("Reminder = "+result);
    }
}
