class BankAccount {
    private String accountNumber;
    private String accountType;
    private double balance;
    private String ownerName;
    private String ownerAddress;

    public BankAccount(String accountNumber, String accountType, double balance, String ownerName, String ownerAddress) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.ownerName = ownerName;
        this.ownerAddress = ownerAddress;
    }

    // Getters and setters for accountNumber, accountType, balance, ownerName, and ownerAddress

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bank Account Details:\n");
        sb.append("Account Number: ").append(accountNumber).append("\n");
        sb.append("Account Type: ").append(accountType).append("\n");
        sb.append("Balance: $").append(balance).append("\n");
        sb.append("Owner Name: ").append(ownerName).append("\n");
        sb.append("Owner Address: ").append(ownerAddress);
        return sb.toString();
    }
}

public class Bankk {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("1234567890", "Savings", 5000.0, "John Doe", "123 Main St");

        // Printing the bank account details using toString() method
        System.out.println(account);
    }
}
