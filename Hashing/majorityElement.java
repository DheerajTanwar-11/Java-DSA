package Hashing;

import java.util.*;

class solution {
    public static void main(String[] args) {
        int[] array = { 1, 1, 1, 1, 2, 2, 2, 2, 8 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        for (int val : map.keySet()) {
            if (map.get(val) > (array.length / 3)) {
                System.out.println(val);
            }
        }
    }
}
