package Lab3;

class BankAccount {
    long accountNumber;
    String holderName;
    double balance;
    // Default constructor
    BankAccount() {
        accountNumber = 1;
        holderName = "anonymous";
        balance = 0.0;
    }
    // Parameterized constructor
    BankAccount(long accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Account " + accountNumber + ": " + amount + " deposited successfully.");
    }
    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Account " + accountNumber + ": " + amount + " withdrawn successfully.");
        } else {
            System.out.println("Account " + accountNumber + ": Insufficient balance!");
        }
    }
    // Display method
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Current Balance: " + balance);
        System.out.println();
    }
    // Main method
    public static void main(String[] args) {
        // Creating two accounts
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount(2, "Pranto", 5000);

        System.out.println("Initial Account Details:");
        acc1.display();
        acc2.display();

        // Perform transactions
        acc1.deposit(1000);
        acc1.withdraw(500);

        acc2.deposit(2000);
        acc2.withdraw(3000);

        System.out.println("\nFinal Account Details:");
        acc1.display();
        acc2.display();
    }
}
