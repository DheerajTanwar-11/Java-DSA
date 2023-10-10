package Hashing;

import java.util.*;

// --------------Approach 1----------------
// class solution {
//     public static void main(String[] args) {
//         int[] array = { 7, 3, 9 };
//         int[] array2 = { 6, 3, 9, 2, 9, 4 };
//         HashMap<Integer, Integer> map = new HashMap<>();
//         HashSet<Integer> union = new HashSet<>();
//         for (int i = 0; i < array.length; i++) {
//             if (map.containsKey(array[i])) {
//                 map.put(array[i], map.get(array[i]) + 1);
//             } else {
//                 map.put(array[i], 1);
//             }
//         }
//         for (int i = 0; i < array2.length; i++) {
//             if (map.containsKey(array2[i])) {
//                 map.put(array2[i], map.get(array2[i]) + 1);
//             } else {
//                 map.put(array2[i], 1);
//             }
//         }
//         for (int i : map.keySet()) {
//             union.add(i);
//         }
//         System.out.println(union);
//     }
// }

// --------------------Approach 2------------------------
class solution {
    public static void main(String[] args) {
        int[] array = { 7, 3, 9 };
        int[] array2 = { 6, 3, 9, 2, 9, 4 };
        HashSet<Integer> union = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            union.add(array[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            union.add(array2[i]);
        }
        System.out.println(union);
    }
}
