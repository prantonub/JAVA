public class LibraryBook {

    String title;
    String author;
    double price;

    LibraryBook() {
        title = "Default Book";
        author = "Unknown Author";
        price = 100.0;
    }


    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }


    void updatePrice(double newPrice) {
        price = newPrice;
    }


    void updatePrice(double percent, boolean isPercentage) {
        price = price + (price * percent / 100);
    }

    public static void main(String[] args) {

        System.out.println("----- Default Book -----");
        LibraryBook book1 = new LibraryBook();
        book1.displayDetails();

        System.out.println("\nAfter updating price:");
        book1.updatePrice(150);
        book1.displayDetails();

        System.out.println("\n----- Custom Book -----");
        LibraryBook book2 = new LibraryBook("Java Programming", "James Gosling", 500);
        book2.displayDetails();

        System.out.println("\nAfter 10% price increase:");
        book2.updatePrice(10, true);
        book2.displayDetails();
    }
}
