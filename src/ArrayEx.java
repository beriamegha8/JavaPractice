public class ArrayEx {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr2 = new int[5];
        int[] arr3 = {1, 2, 3, 4, 5};
        String[] arr4 = {"a", "b", "c", "d", "e"};
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // Copying elements from arr to arr2 and printing arr2
        System.out.println("Copying elements from arr to arr2:");
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
            System.out.print(arr2[i]);
        }
        System.out.println();

        // Printing arr2 using for-each loop
        System.out.println("Printing arr2 using for-each loop:");
        for (int i : arr2) {
            System.out.print(i);
        }
    }
}
