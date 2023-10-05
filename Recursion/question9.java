// Check if an array is sorted(Strictly Increasing).

import java.util.*;

class question9 {
    public static void checkArray(int[] array, int idx) {
        if (idx == array.length - 1) {
            System.out.println("Array is sorted.");
            return;
        }
        if (array[idx] >= array[idx + 1]) {
            System.out.println("Array is not sorted.");
            return;
        }
        checkArray(array, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the element in array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        checkArray(array, 0);

    }
}