import java.lang.*;
import java.util.*;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class InvalidAgeExceptionHandler {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        try {
            CheckAgeHandler(age);
        }
        catch (InvalidAgeException e) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }
    }
    static void CheckAgeHandler(int age) throws InvalidAgeException {
        CheckAge(age);
    }
    static void CheckAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not eligible to vote");
        }
        else {
            System.out.println("Eligible to vote");
        }
    }
}
