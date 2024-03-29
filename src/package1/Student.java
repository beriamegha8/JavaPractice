package package1;

import java.util.Scanner;

public class Student {
    private String name;
    private String address;
    private String prn;

    public Student(String name, String address, String prn) {
        this.name = name;
        this.address = address;
        this.prn = prn;
    }

    public void enterDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter student address: ");
        this.address = scanner.nextLine();
        System.out.print("Enter student PRN: ");
        this.prn = scanner.nextLine();
    }

    public void printDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("PRN: " + prn);
    }
}
