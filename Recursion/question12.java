
// Subsequence of string.
import java.util.*;

class question12 {
    public static void subsequences(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        subsequences(str, idx + 1, newString + currChar);
        subsequences(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println("Substrings are: ");
        subsequences(str, 0, "");
    }
}
