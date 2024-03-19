public class RaggedArrayDemo {
    public static void main(String[] args) {
        // Define a ragged array
        int[][] raggedArray = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9},
                {10}
        };

        // Display the elements of the ragged array
        System.out.println("Elements of the ragged array:");
        for (int i = 0; i < raggedArray.length; i++) {
            for (int j = 0; j < raggedArray[i].length; j++) {
                System.out.print(raggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
