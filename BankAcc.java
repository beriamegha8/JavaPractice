class bank { //pojo class- plain old java object
    private static int totalAccounts = 0;
    private final int accountNumber;
    private double balance;
    private String customerName;

    public bank(int accountNumber, double balance, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit of " + amount + " made. New balance is " + balance);
    }
    public void withdraw(double amount){
        if(balance - amount < 0){
            System.out.println("Only " + balance + " available. Withdrawal not processed");
        }else{
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " processed. Remaining balance = " + balance);
        }
    }
}
public class BankAcc { //executable class
    public static void main(String[] args) {
        bank acc1 = new bank(12345, 0.00, "Bob Brown");
        System.out.println("The total number of bank accounts is " + bank.getTotalAccounts());
        System.out.println("Balance is " + acc1.getBalance());
        acc1.deposit(100.0);
        acc1.withdraw(50.0);

        bank acc2 = new bank(123456, 0.00, "Bob hay");
        System.out.println("The total number of bank accounts is " + bank.getTotalAccounts());
        System.out.println("Balance is " + acc2.getBalance());
        acc2.deposit(100.0);
        acc2.withdraw(50.0);

        System.out.println("Account Number: " + acc1.getAccountNumber() + ", Name: " + acc1.getCustomerName() + ", Balance: $" + acc1.getBalance());
        System.out.println("Account Number: " + acc2.getAccountNumber() + ", Name: " + acc2.getCustomerName() + ", Balance: $" + acc2.getBalance());

        acc1.setBalance(600);
        acc2.setCustomerName("Bobby");

        acc1.deposit(200);
        acc2.withdraw(300);

        System.out.println("Total accounts: " + bank.getTotalAccounts());
        System.out.println(acc1.getAccountNumber());
        System.out.println(acc1.getCustomerName());
        System.out.println(acc1.getBalance());
        System.out.println(acc2.getAccountNumber());
        System.out.println(acc2.getCustomerName());
        System.out.println(acc2.getBalance());
    }
}

