public class Main {
    public static void main(String args[]) {

        Customer Vova = new Customer("Volodymyr", "Bodnarchuk", "Ternopil", "GB29 NWBK 6016 1331 9268 19");

        Employee Vasia = new Employee("Vasia", "Bodnarchuk", "Ternopil", 61632);
        Vova.display();
        System.out.println("");
        Vasia.display();
    }
}

class Customer extends Person {

    private String bankAccountNumber;

    public Customer(String firstName, String lastName, String address, String bankAccountNumber) {
        super(firstName, lastName, address);
        this.bankAccountNumber = bankAccountNumber;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Bank account number: " + this.bankAccountNumber);
    }
}
class Employee extends Person {

    private double salary;

    public Employee(String firstName, String lastName, String address, double salary) {
        super(firstName, lastName, address);
        this.salary = salary;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + this.salary);
    }
}