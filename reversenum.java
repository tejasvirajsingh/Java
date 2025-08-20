import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        int no, rev = 0 , r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        no = scanner.nextInt();
        
        while(no>0)
        {
            r = no%10;
            rev = rev*10+r;
            no = no/10;

        }
        System.out.println("Reversed : " +rev);
    } 

}
