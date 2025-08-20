

public class smallestNum {
    public static void main(String[] args){
        int [] arr = { 25,11,54,0,6,40};
        int minimum = arr[0];
        for (int i = 1; i< arr.length; i++){
            if (arr[i]< minimum){
                minimum =arr[i];

            }
        }
        System.out.println("Smallest elemnt present in Given array: "+ minimum);
    }
}
