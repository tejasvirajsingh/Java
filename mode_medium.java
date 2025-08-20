public class mode_medium
 {   
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 11, 11, 13}; // Given array
        int sum = 0; 
        
        // Calculate sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Calculate mean
        double mean = (double) sum / arr.length;

        // Calculate median
        double median;
        if (arr.length % 2 == 0) {
            median = (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
        } else {
            median = arr[arr.length / 2];
        }

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
    }
}
