package Hashing;
//  Hashing is a technique of mapping key and values into hash table using hash function. 

// Here we are doing hasinh with arrays but there is a problem that in aaray hashing we create an array of bigger size like 12 but in our input array there are only 5 to 6 elements. So thats why we use hash table. Also suppose our input array containes an element which is very big like (10^6) so in that case we need to create an hash array of 10^6 size.

import java.util.Scanner;

// class hashing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] array = { 1, 4, 2, 5, 3, 6, 1, 7 };
//         int[] hash = new int[13];
//         for (int i = 0; i < array.length; i++) {
//             hash[array[i]] += 1;
//         }
//         System.out.println("Enter the value you want to calculate count for: ");
//         int n = sc.nextInt();
//         sc.close();
//         System.out.println("Count of " + n + " = " + hash[n]);
//     }
// }

// class hashing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = "abcdefgtheichdsnvijd";
//         int[] hash = new int[26];
//         for (int i = 0; i < s.length(); i++) {
//             hash[s.charAt(i) - 'a'] += 1;
//         }
//         System.out.print("Enter the character you want to calculate count for: ");
//         char c = sc.next().charAt(0);
//         sc.close();
//         System.out.println("Count of " + c + " = " + hash[c - 'a']);
//     }
// }

class hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "AAAAVVVVCCCCCabcdefgtheichdsnvijd";
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)] += 1;
        }
        System.out.print("Enter the character you want to calculate count for: ");
        char c = sc.next().charAt(0);
        sc.close();
        System.out.println("Count of " + c + " = " + hash[c]);
    }
}