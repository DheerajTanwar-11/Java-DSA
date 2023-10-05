// Move all the 'x' to the end of the string.

import java.util.*;

class question10 {
    public static String newString = "";
    public static int count = 0;

    public static void moveXToEnd(String string, int idx) {
        if (idx == string.length()) {
            if (count == 0) {
                System.out.print("There is no x present in the string and string remain: ");
                System.out.println(string);
                return;
            } else {
                for (int i = 0; i < count; i++) {
                    newString += 'x';
                }
                System.out.println("New String: ");
                System.out.println(newString);
                return;
            }
        }
        if (string.charAt(idx) == 'x') {
            count += 1;
        } else {
            newString += string.charAt(idx);
        }
        moveXToEnd(string, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = sc.next();
        sc.close();
        moveXToEnd(string, 0);
    }
}