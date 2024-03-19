import java.util.*;
public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        int length = arr.length;
        // Check if the array is empty or null
        if (length == 0 || arr == null) {
            return -1;
        }
        // Iterate through the array to find the target element
        for (int i = 0; i < length; i++) {
            // If the target element is found, return its index
            if (arr[i] == target) {
                return i;
            }
        }
        // If the target element is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        int result = linearSearch(arr, target);
        System.out.println("The index of the target element is: " + result);
        sc.close();
    }
}
