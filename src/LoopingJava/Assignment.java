//find factorial of n
package LoopingJava;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        int fact =1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial is: "+fact);
    }
}
