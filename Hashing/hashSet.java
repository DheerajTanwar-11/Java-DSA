package Hashing;
// Hash Set is a datastructure that stores only uizue values. It is very efficient because of its time complexity. Time complexity for Add, Delete and Search operation on Hash Set is constant.

import java.util.HashSet;
import java.util.Iterator;

class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(); // HashSet declaration

        // Adding element
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        System.out.println("Your HashSet is: ");
        System.out.println(set);
        // Searching Element
        System.out.println(set.contains(4));
        System.out.println(set.contains(22));
        // remove element
        set.remove(4);
        System.out.println(set);
        // Size
        System.out.println(set.size());
        // clear
        set.clear();
        System.out.println(set.size());
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        // Using Iterator on hashSet
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
