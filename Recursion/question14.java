// Print permutations of string

import java.util.*;

class question14 {
    public static void printPremutation(String str, String permutations) {
        if (str.length() == 0) {
            System.out.println(permutations);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPremutation(newStr, permutations + currChar);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println("Possible permutations are: ");
        printPremutation(str, "");
    }
}