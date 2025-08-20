import java.util.Scanner;

public class Search_index {
    public static void main(String[] args){
        int [] arr = { 45, 56, 34, 43 , 33, 59, 10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Element to search : ");
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i< arr.length ; i++){
            if (arr[i] == target){
                found = true;
                System.out.println("Element found at index " + i);
                break;
            }
            if (found == false){
                System.out.println("Elment is not present in array");
            }
        } 
    }
}
