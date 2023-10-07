
// Count total number of ways to place tile of size 1xm in nxm floor.
import java.util.*;

class question16 {
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        int vertPlacement = placeTiles(n - m, m);
        int horPlacement = placeTiles(n - 1, m);
        return vertPlacement + horPlacement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();
        sc.close();
        System.out.println("Total number of ways to place tiles: " + placeTiles(n, m));
    }
}