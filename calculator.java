import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner (System.in);
        System .out.println("Simple calculator" );

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the operator (+,-,*,/): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch(operator){
            case '+':
            result = num1 + num2 ;
            break;

            case '-':
            result = num1 - num2 ;
            break;

            case '*':
            result = num1 * num2;
            break;

            case '/':
            if(num2 != 0)
            {
                result = num1 / num2 ;

            }
            else {
                System.out.println("Error ! Division by zero.");
                return;
            }
            break;


            default: 
            System.out.println("invalid operator! ");
            return ;

        

        }

        System .out.println("The result is : "+ result);



    }
}
