/* 
1. Insertion sort is the sorting method in which our complete array is divided into two parts: Sorted array and Unsorted array.
2. Here we will compare the 1st element of unsorted part with all the element of sorted part till the length of sorted part and place the element in its right place in sorted part.
*/

class insertionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 7, 5, 8, 9 };
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}