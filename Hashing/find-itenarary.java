package Hashing;

import java.util.*;

class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String start = "";
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> reverseMap = new HashMap<>();
        System.out.print("Enter the size of HashMap: ");
        int n = sc.nextInt();
        System.out.println("Enter the key value pairs: ");
        for (int i = 0; i < n; i++) {
            map.put(sc.next(), sc.next());
        }
        sc.close();
        System.out.println(map);

        // Map in Reverse Order
        for (String i : map.keySet()) {
            reverseMap.put(map.get(i), i);
        }

        // Finding starting city
        for (String i : map.keySet()) {
            if (!reverseMap.containsKey(i)) {
                start = i;
            }
        }
        System.out.println("Your starting city: " + start);

        boolean firstIteration = true;
        while (map.containsKey(start)) {
            String end = map.get(start);
            if (firstIteration) {
                System.out.print(start + " => ");
                firstIteration = false;
            } else {
                System.out.print(start + " => ");
            }
            start = end;
        }
        System.out.print(start);
    }
}