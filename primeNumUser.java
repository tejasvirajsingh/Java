import java.util.Scanner;
class primeNumUser{
    public static void printPrime (int count ) {
        int num = 2, printed = 0;
        while (printed < count ) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                printd++;
            }
            System.out.println();
        }
        public static boolean isPrime(int num) {
            if (num < 2) return false; 
                for (int i = 2; i <=  Math.sqrt(num); i++) {
                if (num % i == 0) return false;
                }
                return true;
            }
            public static void main(String[] args) {
                Scanner scanner= new scanner(system.in);
                System.out.print("Enter the number of PRIME num to Print: ");
                int count = scanner.nextint();
                scanner.close();
           System.out.println("First " + count + " Prime Number : ");
           printPrime(count);
            }
        }
    