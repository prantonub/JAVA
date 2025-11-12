package Lab_work;
class ElectricBill {
    int consumerID;
    String consumerName;
    double unitConsumed;

    ElectricBill(int id, String name, double unit) {
        this.consumerID = id;
        this.consumerName = name;
        this.unitConsumed = unit;
    }

    double calculateBill() {
        double rate = 5.50;
        return unitConsumed * rate;
    }

    double calculateBill(String userType) {//function overloading
        double rate;
        if (userType.equalsIgnoreCase("commercial")) {
            rate = 8.00;
        } else {
            rate = 5.50;
        }
        return unitConsumed * rate;
    }

    void displayBill(double amount, String type) {
        System.out.println("Consumer ID: " + consumerID);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("User Type: " + type);
        System.out.println("Units Consumed: " + unitConsumed);
        System.out.println("Total Bill: " + amount + " Tk");
        System.out.println();
    }
//main function here
    public static void main(String[] args) {

        ElectricBill e1 = new ElectricBill(1217, "Pranto", 310);
        double domesticBill = e1.calculateBill();
        e1.displayBill(domesticBill, "Domestic");

        ElectricBill e2 = new ElectricBill(1020, "Hasib", 150);
        double commercialBill = e2.calculateBill("commercial");
        e2.displayBill(commercialBill, "Commercial");
    }
}