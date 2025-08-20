

public class odd_evenSepreate {
    public static void main(String[] arhs)
    {
        int [] arr = { 1,2,5,6,8,-4,-3,-2,7};
        int j= 0;
        for (int i = 0; i<arr.length ; i++){
            if (arr[i] % 2 == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int i = 0; i <arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
