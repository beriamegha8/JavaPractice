class Member {
    // Data members
    private String name;
    protected int age; // Changed access modifier to protected
    protected String phoneNumber; // Changed access modifier to protected
    protected String address; // Changed access modifier to protected
    protected double salary; // Changed access modifier to protected

    // Constructor
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Method to print salary
    public void printSalary() {
        System.out.println("Salary: $" + salary);
    }
}

class Employee extends Member {
    // Additional data member
    private String specialization;

    // Constructor
    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    // Method to print employee details
    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + getName()); // Using getName() method instead of accessing name directly
        System.out.println("Age: " + age); // Accessing age directly, as it's now protected
        System.out.println("Phone Number: " + phoneNumber); // Accessing phoneNumber directly, as it's now protected
        System.out.println("Address: " + address); // Accessing address directly, as it's now protected
        System.out.println("Specialization: " + specialization);
        printSalary(); // Calling printSalary() method directly
    }
}

class Manager extends Member {
    // Additional data member
    private String department;

    // Constructor
    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    // Method to print manager details
    public void printDetails() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + getName()); // Using getName() method instead of accessing name directly
        System.out.println("Age: " + age); // Accessing age directly, as it's now protected
        System.out.println("Phone Number: " + phoneNumber); // Accessing phoneNumber directly, as it's now protected
        System.out.println("Address: " + address); // Accessing address directly, as it's now protected
        System.out.println("Department: " + department);
        printSalary(); // Calling printSalary() method directly
    }
}

public class Salary {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee("John Doe", 30, "1234567890", "123 Main St", 50000.0, "Software Engineer");
        // Printing employee details
        employee.printDetails();

        // Creating a Manager object
        Manager manager = new Manager("Jane Smith", 40, "0987654321", "456 Elm St", 80000.0, "Human Resources");
        // Printing manager details
        manager.printDetails();
    }
}
