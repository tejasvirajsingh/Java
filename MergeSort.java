import java.util.Arrays;

public class MergeSort {

    void merge(int[] arr, int left, int mid, int right) {
        // Find sizes of two sub-arrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

          // Create temporary arrays
         int[] L = new int[n1];
         int[] R = new int[n2];

         // Copy data to temp arrays L[] and R[]
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        // Initial indices of first and second sub-arrays
        int i = 0, j = 0;

        // Initial index of merged sub-array
        int k = left;
        
        // Merge the temporary arrays back into arr[left..right]
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
               
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[left..right] using merge()
    void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Driver method to test the code
    public static void main(String args[]) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array:");
        System.out.println(Arrays.toString(arr));

        MergeSort ob = new MergeSort();
        ob.mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}