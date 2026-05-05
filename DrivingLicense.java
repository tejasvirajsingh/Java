import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible for driving license");
        } else {
            System.out.println("Not eligible for driving license");
        }

        sc.close();
    }
}