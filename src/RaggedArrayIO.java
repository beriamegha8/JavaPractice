import java.util.Scanner;

public class RaggedArrayIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        // Define a ragged array with the given number of rows
        int[][] raggedArray = new int[numRows][];

        // Prompt the user to enter the number of columns for each row and fill the array
        for (int i = 0; i < numRows; i++) {
            System.out.print("Enter the number of elements in row " + (i + 1) + ": ");
            int numColumns = scanner.nextInt();
            raggedArray[i] = new int[numColumns];

            System.out.println("Enter the elements of row " + (i + 1) + ":");
            for (int j = 0; j < numColumns; j++) {
                raggedArray[i][j] = scanner.nextInt();
            }
        }

        // Print the ragged array
        System.out.println("Ragged Array:");
        for (int i = 0; i < raggedArray.length; i++) {
            for (int j = 0; j < raggedArray[i].length; j++) {
                System.out.print(raggedArray[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
