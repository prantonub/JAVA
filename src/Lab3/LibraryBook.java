package Lab3;

class LibraryBook {
    int bookId;
    String title;
    String author;
    double price;

    LibraryBook() {
        bookId = 0;
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    LibraryBook(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    // Overloaded method 1: update price with a new price value
    void updatePrice(double newPrice) {
        price = newPrice;
        System.out.println("Price updated successfully to " + price);
    }
    // Overloaded method 2: update price with percentage increase
    void updatePrice(int percentIncrease) {
        price = price + (price * percentIncrease / 100);
        System.out.println("Price increased by " + percentIncrease + "% to " + price);
    }
    // Display method
    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
    // Main method
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook();
        LibraryBook b2 = new LibraryBook(101, "Java Basics", "Jhankar Mahbub", 450.0);

        System.out.println("Before Price Update:");
        b1.display();
        b2.display();

        b1.updatePrice(250.0); // setting new price
        b2.updatePrice(10);    // increasing by 10%

        System.out.println("\nAfter Price Update:");
        b1.display();
        b2.display();
    }
}
