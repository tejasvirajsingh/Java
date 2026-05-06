import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){

        int[] arr = {2,4,5,6,7,8,12,13,18,20};
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter to find number index: ");
        int key = sc.nextInt();

        boolean found = false;

        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found in the Index: " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("NUmber is not found in Array");
        }
        sc.close();
    }
}
