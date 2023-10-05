//Print string in reverse

import java.util.*;

class question7 {
    public static void reverseString(String string, int idx) {
        if (idx < 0) {
            return;
        }
        System.out.print(string.charAt(idx));
        reverseString(string, idx - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String string = sc.nextLine();
        sc.close();
        System.out.print("Reverse string is: ");
        reverseString(string, string.length() - 1);
    }
}
