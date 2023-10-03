/* 
1. Bubble sort is the sorting algorithm used to sort the elements in ascending order or descending order. 
2. It is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.
3. Total number of comparison steps are (n-1) times where n is number of elements.
4. Time Complexity => o(n^2)
*/

class bubbleSort{
    public static void main(String[] args) {
        int[] arr = {4,5,7,4,2,8,1}; // array declarations
        for(int i = 0; i < arr.length - 1; i++){ // traversing in array
            for(int j = 0; j < arr.length - 1 - i; j++){ // traversing the array only upto ith length.
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}