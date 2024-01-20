import java.util.Scanner;

class Client {
    private final String name;
    private final String address;

    public Client(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

class Account {
    private final Client client;
    private double balance;

    public Account(Client client) {
        this.client = client;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Client: " + client.getName());
        System.out.println("Address: " + client.getAddress());
        System.out.println("Balance: $" + balance);
        System.out.println();
    }
}

public class BankingManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter client name: ");
        String clientName = scanner.nextLine();

        System.out.print("Enter client address: ");
        String clientAddress = scanner.nextLine();

        Client client = new Client(clientName, clientAddress);
        Account account = new Account(client);

        System.out.println("Account created successfully!\n");

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful!");
                }
                case 2 -> {
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                }
                case 3 -> account.displayAccountDetails();
                case 4 -> {
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
