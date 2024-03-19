public class Transactions {
    int balance = 1000;
    int deposit(int amount) {
        balance += amount;
        return amount;
    } // depositing amount
    int withdraw(int amount) {
        balance -= amount;
        return amount;
    } // withdrawing amount
    int deposit(int amount, int accountNumber) {
        balance += amount;
        return amount;
    } // depositing amount using account number

    int withdraw(int amount, int accountNumber) {
        balance -= amount;
        return amount; // withdrawing amount using account number
    }
    int deposit(int amount, int accountNumber, int pin) {
        balance += amount;
        return amount; // depositing amount using account number and pin
    }
    int withdraw(int amount, int accountNumber, int pin) {
        balance -= amount;
        return amount; // withdrawing amount using account number and pin
    }
    int deposit(int amount, int accountNumber, int pin, int otp, int chequeNumber) {
        balance += amount;
        return amount; // depositing via cheque
    }
    int withdraw(int amount, int accountNumber, int pin, int otp, int chequeNumber) {
        balance -= amount;
        return amount;
    } // withdrawing via cheque
    public static void main(String[] args) {
        Transactions obj = new Transactions();
        System.out.println("Amount deposited: " + obj.deposit(1000, 123456));
        System.out.println("Amount withdrawn: " + obj.withdraw(500, 123456));
        System.out.println("Amount deposited: " + obj.deposit(1000, 123456, 1234));
        System.out.println("Amount withdrawn: " + obj.withdraw(500, 123456, 1234));
        System.out.println("Amount deposited: " + obj.deposit(1000, 123456, 1234, 5678, 123456));
        System.out.println("Amount withdrawn: " + obj.withdraw(500, 123456, 1234, 5678, 123456));
    }
}
