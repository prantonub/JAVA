//convert fahrenheit to celsius
package TemperatureDemo;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit, celsius;

        System.out.print("Enter fahrenheit: ");
        fahrenheit = input.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("celsius: "+celsius);
    }
}
