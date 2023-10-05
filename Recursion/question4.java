// Print X^n (Stack Height = n)

import java.util.*;

class question4 {
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (base == 0) {
            return 0;
        }
        int powN = power(base, exponent - 1);
        int result = base * powN;
        return result;
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