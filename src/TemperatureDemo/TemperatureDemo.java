//convert celsius to fahrenheit
package TemperatureDemo;

import java.util.Scanner;

public class TemperatureDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Enter celsius: ");
        celsius = input.nextDouble();

        fahrenheit = 1.8 * celsius + 32;
        System.out.println("Fahrenheit: "+fahrenheit);
    }
}
