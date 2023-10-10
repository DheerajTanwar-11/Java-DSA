/*
1. HashMap is a datastructure that uses hash function to store the key value pairs.
2. Common methods/functions in HashMap => put, get, containsKey, size, remove, keySet.
3. Internally HashMap is implemented as Array of LinkedList. 
4. Form changing of Data is knows as Hashing.
*/

package Hashing;

import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // Insertion
        map.put("India", 120);
        map.put("USA", 30);
        map.put("Israel", 20);
        System.out.println(map);

        // Search: HashMap has two types of search operation => containeKey(To see if
        // key is present) & get(To see the value of key)
        // containesKey
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("China"));
        // get
        System.out.println(map.get("India"));
        System.out.println(map.get("China"));

        // Iteration
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }

        // remove
        map.remove("USA");
        System.out.println(map.containsKey("USA"));

    }

}
