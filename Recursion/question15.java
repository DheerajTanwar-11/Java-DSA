// Count total paths to move from 0,0 to n,m. You can only righwards or downwards.

import java.util.*;

class question15 {
    public static int countPaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int dowsPaths = countPaths(i + 1, j, n, m);
        int rightPaths = countPaths(i, j + 1, n, m);
        return dowsPaths + rightPaths;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();
        sc.close();
        System.out.println("Total number of paths: " + countPaths(0, 0, n, m));
    }
}