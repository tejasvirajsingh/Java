import java.util.Arrays;

public class sortingArray {
    public static void main(String[] args) {
       
        int[] arr = {34, 12, 56, 78, 23, 9, 67};

        System.out.println("Original Array:");
        printArray(arr);

       
        int[] builtInSorted = arr.clone(); 
        Arrays.sort(builtInSorted);
        System.out.println("\nSorted using Arrays.sort():");
        printArray(builtInSorted);

       
        int[] bubbleSorted = arr.clone();
        bubbleSort(bubbleSorted);
        System.out.println("\nSorted using Bubble Sort:");
        printArray(bubbleSorted);
    }

   
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
