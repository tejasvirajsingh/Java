import java.util.Scanner;

public class AddTwoDigit {
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The First Digit (0-99):  ");
        int firstDigit = scanner.nextInt();

        System .out . print("Enter the second digit (0-99):  ");
        
        int secondDigit = scanner.nextInt();

        if (firstDigit >= 0&&firstDigit <= 99 && secondDigit >= 0 &&secondDigit <= 99){
            int sum = firstDigit + secondDigit;

        System.out.println("The sum of " + firstDigit + " and " + secondDigit + " is : " +sum);

        }
        else {
            System.out.println("Both inputs must be single digits between 0 and 99.");

        }
        scanner.close();
    }
}
