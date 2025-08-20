public class productOfArray {
    public static void main (String[] args){
        int[] arr = {3,4,6,};
        int product = 1;
        for (int i = 0; i<arr.length; i++)
        {
            product = product * arr[i];

        }
        System.out.print("The Product of Array : " + product);
    }
}
