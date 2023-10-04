// Print x ^ n (Stack Height = logn).

import java.util.*;

class question5 {
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (base == 0) {
            return 0;
        }
        if (exponent % 2 == 0) {
            return power(base, exponent / 2) * power(base, exponent / 2);
        } else {
            return (power(base, exponent / 2) * power(base, exponent / 2)) * base;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();
        sc.close();
        System.out.println("Result: " + power(base, exponent));
    }
}