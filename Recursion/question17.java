// Count total number of ways to call n guest in party, Either single or in pairs.

import java.util.*;

class question17 {
    public static int callGuest(int n) {
        if (n <= 1) {
            return 1;
        }
        int ways1 = callGuest(n - 1);
        int ways2 = (n - 1) * callGuest(n - 1);
        return ways1 + ways2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of guests: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Total number of ways to call n guest: " + callGuest(n));
    }
}