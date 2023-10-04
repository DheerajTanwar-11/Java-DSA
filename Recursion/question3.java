
// Print fibonacci series upto number n.
import java.util.*;

class fibonacciSeries {
    public static void fibonacci(int a, int b, int n) {
        if (n < 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        fibonacci(b, c, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        fibonacci(a, b, n - 2);
    }
}