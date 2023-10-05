// Print factorial of a number n.

import java.util.*;

class question2 {
    public static void factorial(int factorial, int i) {
        if (i == 0 || i == 1) {
            System.out.println(factorial);
            return;
        }
        factorial *= i;
        factorial(factorial, i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of i: ");
        int i = sc.nextInt();
        sc.close();
        factorial(1, i);
    }
}
