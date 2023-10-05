// Check first and last occurence of an element in string.

import java.util.*;

class question8 {
    static int first = -1;
    static int last = -1;

    public static void occurence(String string, char element, int idx) {
        if (idx == string.length()) {
            if (first == -1) {
                System.out.println("Given element is not present in string.");
            } else {
                System.out.println("First occurence of element is at index: " + first);
                System.out.println("Last occurence of element is at index: " + last);
            }
            return;
        }
        if (string.charAt(idx) == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        occurence(string, element, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = sc.nextLine();
        System.out.print("Enter the element to find: ");
        char element = sc.next().charAt(0);
        sc.close();
        occurence(string, element, 0);

    }
}
