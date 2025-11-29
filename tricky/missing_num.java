public  class missing_num {
    public static void main(String[] args){
        int [] arr = { 1,2,3,4,5,6,7,9,10};
        int n = arr.length + 1;
        int exp_Sum = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i<arr.length; i++)
        {
            sum = sum + arr[i];

        }
        int missing_num = exp_Sum - sum;
        System.out.println("Missingh Number is : " + missing_num);
    }
}
