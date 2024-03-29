package package2;

import java.util.Scanner;

public class Employee {
    private String name;
    private String address;
    private String employeeId;

    public Employee(String name, String address, String employeeId) {
        this.name = name;
        this.address = address;
        this.employeeId = employeeId;
    }

    public void enterDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter employee address: ");
        this.address = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        this.employeeId = scanner.nextLine();
    }

    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Employee ID: " + employeeId);
    }
}
