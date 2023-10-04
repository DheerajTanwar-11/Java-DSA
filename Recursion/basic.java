/* 
1. Recursion is a process in which a function call its self to perform a task till it reaches the base condition or stopping condition.
2. Recursion is just like iteration it means all the tasks that are performed by iteration can also be performed by recursion.
3. Recursion is used to persome task like merge sort, trees, graphs etc.
4. Recursion is memory consuming process because in each recursive call it new variables and all those variables takes space in the memory.
*/

import java.util.*;

class recursion {
    public static void printNum(int n) {
        if (n < 0) { // Base condition
            return;
        } else {
            System.out.print(n + " ");
            printNum(n - 1); // Recursive Call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        printNum(n);
    }
}