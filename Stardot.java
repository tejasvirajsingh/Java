import java.util.Scanner;
public class Stardot {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numer of row for the pyramid: ");

        int rows = scanner.nextInt();

        for (int i = 1; i<= rows; i++)
        {
            for (int j = rows; j> i; j--){
                System.out.print("");

            }
            for (int k=1; k<=(2*i-1);k++){
                System.out.println();
            }
               scanner.close();
        }
    }
}