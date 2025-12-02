package Lab_4;

class Payment {
    void processPayment() {
        System.out.println("Processing payment...");
    }
}

class CreditCardPayment extends Payment {
    void processPayment() {
        System.out.println("Processing Credit Card Payment");
    }
}

class UPIPayment extends Payment {
    void processPayment() {
        System.out.println("Processing UPI Payment");
    }
}

class CashPayment extends Payment {
    void processPayment() {
        System.out.println("Processing Cash Payment");
    }
}

public class Problem5 {
    public static void main(String[] args) {

        Payment p;

        p = new CreditCardPayment();
        p.processPayment();

        p = new UPIPayment();
        p.processPayment();

        p = new CashPayment();
        p.processPayment();
    }
}
