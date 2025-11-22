public class AverageOfPostive {
    


    public static void main(String[] args)
    {
        int [] arr = { -3, -4 , 5 , 4, 6, -7, 9, -0, 2};
        int sum = 0;
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if (arr[i] > 0)
            {
                sum = sum + arr[i];
                count++;

            }
        }

        if (count > 0){
            double average = (double) sum / count;
            System.out.println("Average of positive number is:  " + average);
        }
        else {
            System.out.println("Not a  Positive number in the Array.");
        }
    }
}


