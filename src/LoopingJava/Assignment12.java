//Sum of even number and even number with user input
package LoopingJava;

import java.util.Scanner;
public class Assignment12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start, end ;
        System.out.print("Enter a starting number: ");
        start = input.nextInt();

        System.out.print("Enter a ending number: ");
        end = input.nextInt();

        int sumOfEven =0;
        int sumOfOdd =0;
        for(int i=start; i<=end; i++){
            if(i%2 ==0){
                sumOfEven = sumOfEven + i;
            }
            else if(i%2==1){
            sumOfOdd = sumOfOdd + i;
            }
        }
        System.out.println("Sum of even number: "+sumOfEven);
        System.out.println("Sum of odd number: "+sumOfOdd);
    }
}
