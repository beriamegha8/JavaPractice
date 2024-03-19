import java.util.Scanner;
public class WrapperConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer value
        System.out.print("Enter an integer value: ");
        int intValue = scanner.nextInt();

        // Input a character value
        System.out.print("Enter a character value: ");
        char charValue = scanner.next().charAt(0);

        // Input a double value
        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();

        // Converting primitive data types to wrapper objects
        Integer integerObj = Integer.valueOf(intValue);
        Character charObj = Character.valueOf(charValue);
        Double doubleObj = Double.valueOf(doubleValue);

        // Displaying the wrapper objects
        System.out.println("Integer object: " + integerObj);
        System.out.println("Character object: " + charObj);
        System.out.println("Double object: " + doubleObj);

        scanner.close();
    }
}
