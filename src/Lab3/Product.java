//Q3. Product Billing System
package Lab3;

class Product {
    int productId;
    String productName;
    int quantity;
    double unitPrice;

    // Default constructor initially all 0
    Product() {
        this.productId = 0;
        this.productName = "Unknown";
        this.quantity = 0;
        this.unitPrice = 0.0;
    }
    //parameterized constructor initializing real values
    Product(int productId, String productName, int quantity, double unitPrice) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    // Method to calculate total price
    double totalPrice() {
        return quantity * unitPrice;
    }
    //display method
    void displayBill() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Price: " + totalPrice());
        System.out.println();
    }
    public static void main(String[] args) {
        Product p1 = new Product();// default constructor
        Product p2 = new Product(101, "Laptop", 2, 45000.0);// parameterized constructor

        System.out.println("Product Bills:");
        p1.displayBill();
        p2.displayBill();
    }
}
