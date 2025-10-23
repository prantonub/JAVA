package if_else;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
   
        System.out.print("Enter any integer: "); 
        num = input.nextInt();

        if(num>0){
            System.out.println("Positive Number");     
        }

        else if(num<0) {
        System.out.println("Negative Number");    
        }
        else {
            System.out.println("Equal to zero");
        }
    }
}
