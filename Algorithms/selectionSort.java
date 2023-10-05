/*
1. Selection sort is the sorting method in which we find smallest element and placed it in starting.
2. Here we do 1 swapping per iteration. 
3. Time complexity => o(n^2).
*/

class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 5, 4, 8, 7, 5, 1, 21, 3, 44, 55 };
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}