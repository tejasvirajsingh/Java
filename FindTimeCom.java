public class FindTimeCom {

    public static void constantTime(int n) {
        System.out.println("Result = " + (n * 2));
    }

    public static void linearTime(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("i = " + i);
        }
    }

    public static void quadraticTime(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + ", " + j);
            }
        }
    }

    public static void logarithmicTime(int n) {
        while (n > 1) {
            n = n / 2;
            System.out.println("n = " + n);
        }
    }

    public static void linearithmicTime(int n) {
        for (int i = 0; i < n; i++) {
            int x = n;
            while (x > 1) {
                x = x / 2;
                System.out.println("x = " + x);
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("O(1) - Constant Time:");
        constantTime(n);

        System.out.println("\nO(n) - Linear Time:");
        linearTime(n);

        System.out.println("\nO(n^2) - Quadratic Time:");
        quadraticTime(n);

        System.out.println("\nO(log n) - Logarithmic Time:");
        logarithmicTime(n);

        System.out.println("\nO(n log n) - Linearithmic Time:");
        linearithmicTime(n);
    }
}
