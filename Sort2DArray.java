import java.util.Arrays;

public class Sort2DArray {
    public static void main(String[] args) {
        // Example 2D array
        int[][] arr = {
            {5, 2, 9},
            {1, 6, 3},
            {8, 7, 4}
        };

        System.out.println("Original 2D Array:");
        print2DArray(arr);

        // Step 1: Flatten into 1D array
        int rows = arr.length;
        int cols = arr[0].length;
        int[] temp = new int[rows * cols];

        int k = 0;
        for (int[] row : arr) {
            for (int val : row) {
                temp[k++] = val;
            }
        }

        // Step 2: Sort the 1D array
        Arrays.sort(temp);

        // Step 3: Put values back into 2D array
        k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = temp[k++];
            }
        }

        System.out.println("\nSorted 2D Array:");
        print2DArray(arr);
    }

    // Utility function to print 2D array
    public static void print2DArray(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
