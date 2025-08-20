import java.util.Scanner;

public class oddoreven {
    public static void main(String args[]){
        System.out.println("Enter the integer to check if it is odd or even");
        Scanner in = new Scanner(System.in);
        
        X = in.nextInt();
        if (X % 2 == 0)
        System.out.println("You Enter the number an even number.");
        else
        System.out.println("You Enter the odd number.");

    }
    static int X;
}
