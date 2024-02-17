import java.util.Arrays;
public class ParameterDemo {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before calling changeValue: x = " + x); // Output: 10

        changeValue(x);

        System.out.println("After calling changeValue: x = " + x); // Output: 10 (original value remains unchanged)

        int[] numbers = {1, 2, 3};
        System.out.println("Before calling modifyArray: numbers = " + Arrays.toString(numbers)); // Output: [1, 2, 3]

        modifyArray(numbers);

        System.out.println("After calling modifyArray: numbers = " + Arrays.toString(numbers)); // Output: [100, 2, 3] (array elements modified)
    }

    // Method to demonstrate call by value for primitive types
    static void changeValue(int num) {
        num = 50; // Changes the copy of num within the method
        System.out.println("Inside changeValue: num = " + num); // Output: 50
    }

    // Method to demonstrate call by reference for arrays
    static void modifyArray(int[] arr) {
        arr[0] = 100; // Modifies the original array elements
    }
}
