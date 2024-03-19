import java.util.Scanner;

public class RemoveDigitAtPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.print("Enter the position of the digit to remove (1-indexed): ");
        int positionToRemove = scanner.nextInt();

        int result = 0, m = 1, p = 1;
        int no = num;

        while (no != 0) {
            int digit = no % 10;
            if (p++ != positionToRemove) {
                result = result + digit * m;
                m *= 10;
            }
            no /= 10;
        }

        System.out.println("Number after removing digit at position " + positionToRemove + ": " + result);

        scanner.close();
    }
}
