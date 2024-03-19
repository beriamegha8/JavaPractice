public class Swap {
    // Method for swapping two numbers using call by value
    public static void swapByValue(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    // Method for swapping two numbers using call by reference
    public static void swapByReference(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {
        // Demonstrate swapping using call by value
        int num1 = 5;
        int num2 = 10;

        System.out.println("Before swapping by value:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        swapByValue(num1, num2);

        System.out.println("After swapping by value:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Demonstrate swapping using call by reference
        int[] nums = {5, 10};

        System.out.println("\nBefore swapping by reference:");
        System.out.println("num1 = " + nums[0]);
        System.out.println("num2 = " + nums[1]);

        swapByReference(nums);

        System.out.println("After swapping by reference:");
        System.out.println("num1 = " + nums[0]);
        System.out.println("num2 = " + nums[1]);
    }
}
