public class ConsUse {
    private String name;
    private int id;
    private double salary;

    // Default constructor
    public ConsUse() {
        this.name = "John Doe";
        this.id = 0;
        this.salary = 0.0;
    }

    // Parameterized constructor
    public ConsUse(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    // Method to give a raise to the salary
    public void giveRaise(double raiseAmount) {
        this.salary += raiseAmount;
        System.out.println("Salary raised by $" + raiseAmount);
    }

    public static void main(String[] args) {
        // Creating an instance of Employee using default constructor
        ConsUse emp1 = new ConsUse();
        System.out.println("Employee 1 Info:");
        emp1.displayInfo();

        // Creating an instance of ConsUse using parameterized constructor
        ConsUse emp2 = new ConsUse("Alice", 101, 50000.0);
        System.out.println("\nConsUse 2 Info:");
        emp2.displayInfo();

        // Giving a raise to emp2
        emp2.giveRaise(5000.0);
        System.out.println("\nConsUse 2 Info after raise:");
        emp2.displayInfo();
    }
}
