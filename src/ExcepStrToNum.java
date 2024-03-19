//take a number in string format and try to convert into integer
import java.util.Scanner;
public class ExcepStrToNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        //String numStr = System.console().readLine();
        String numStr = sc.nextLine();
        try {
            int num = Integer.parseInt(numStr);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number"); //eg- abc as an input will generate this error
        }
    }
}
