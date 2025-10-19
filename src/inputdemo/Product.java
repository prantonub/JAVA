/*
 * Assignment-3 (User Input)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: get user input for each variables
* step 5: print the variables
 */

package inputdemo;
import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int id;
        String title;
        int price;
        String description;
        String category;

        System.out.print("Enter Id: ");
        id = input.nextInt();
        input.nextLine();
        
        System.out.print("Enter title: ");
        title = input.nextLine();

        System.out.print("Enter Price: ");
        price = input.nextInt();
        input.nextLine();

        System.out.print("Enter description: ");
        description = input.nextLine();

        System.out.print("Enter Category: ");
        category = input.nextLine();

        System.out.println("-----------Product Details--------------");
        System.out.println("Product Id: "+id);
        System.out.println("Product title: "+title);
        System.out.println("Product price: "+price);
        System.out.println("Product description: "+description);
        System.out.println("Product category: "+category);

        input.close();



    }  
}
