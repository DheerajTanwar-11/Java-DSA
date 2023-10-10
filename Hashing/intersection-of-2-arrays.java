package Hashing;

import java.util.*;

class solution {
    public static void main(String[] args) {
        int[] array1 = { 7, 3, 9 };
        int[] array2 = { 6, 3, 9, 2, 9, 4 };
        HashSet<Integer> intersection = new HashSet<Integer>();
        HashSet<Integer> set1 = new HashSet<Integer>();
        for (int i = 0; i < array1.length; i++) {
            set1.add(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            if (set1.contains(array2[i])) {
                intersection.add(array2[i]);
            }
        }
        System.out.println(intersection);
    }
}
