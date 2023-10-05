
// Question6
import java.util.*;

class question6 {
    static int steps = 0;

    public static void towerHanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("Disk " + n + " moved from " + source + " to " + destination + " => " + n);
            steps++;
            return;
        }
        towerHanoi(n - 1, source, destination, helper);
        System.out.println("Disk " + n + " moved from " + source + " to " + destination + " => " + n);
        steps++;
        towerHanoi(n - 1, helper, source, destination);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();
        towerHanoi(n, "source", "helper", "destination");
        System.out.println("Total number of steps taken: " + steps);
    }
}