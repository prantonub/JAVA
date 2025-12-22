class EmployeeType {

    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends EmployeeType {

    double baseSalary = 10000;

    @Override
    double calculateSalary() {
        return baseSalary + (baseSalary * 20 / 100);
    }
}
class PartTimeEmployee extends EmployeeType {

    double hourlyRate = 300;
    int workingHours = 40;

    @Override
    double calculateSalary() {
        return hourlyRate * workingHours;
    }
}

class ContractEmployee extends EmployeeType {

    double fixedAmount = 15000;

    @Override
    double calculateSalary() {
        return fixedAmount - (fixedAmount * 5 / 100);
    }
}

public class main{

    public static void main(String[] args) {

        EmployeeType emp;

        emp = new FullTimeEmployee();
        System.out.println("Full Time Employee Salary: " + emp.calculateSalary());

        emp = new PartTimeEmployee();
        System.out.println("Part Time Employee Salary: " + emp.calculateSalary());

        emp = new ContractEmployee();
        System.out.println("Contract Employee Salary: " + emp.calculateSalary());
    }
}
