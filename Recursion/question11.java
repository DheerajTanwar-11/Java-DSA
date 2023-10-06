// Remove duplicates from string.

import java.util.*;

class question11 {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr);
        } else {
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        sc.close();
        removeDuplicates(str, 0, "");
    }
}