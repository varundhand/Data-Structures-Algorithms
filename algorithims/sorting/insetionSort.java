// gapped insertion sortpackage algorithims.sorting;
//* Insertion Sort builds the sorted array one element at a time by repeatedly picking the next element
//   and inserting it into its correct position among the already sorted elements. 
//   It works well for small datasets or nearly sorted data, as fewer shifts are needed. */

// Time Complexity: 
//   - Best Case (Already Sorted): O(n)
//   - Average and Worst Case: O(n^2)
// Space Complexity: O(1) (in-place sorting)
// Stable: Yes
// Adaptive: Yes (performs better on nearly sorted data)
import java.util.Random;

public class insetionSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i =0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before: ");
        printArray(numbers);
        
        insertionSort(numbers);
        System.out.println("After: ");
        printArray(numbers);

    }

    
    private static void printArray(int[] numbers) {
        for (int i =0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        } 
    }

    private static void insertionSort(int[] inputArray) {
        for (int i =1; i < inputArray.length; i++){
            int currentValue = inputArray[i]; // take the current element

            int j = i - 1; // prev element and tracks the behind elements 

            while(j>=0 && inputArray[j] > currentValue) { // j>=0 means the loop should stop as soon as it reaches the front of the array
                inputArray[j+1] = inputArray[j]; // moving the element one step ahead (to the right)
                j--;
            }
            inputArray[j+1] = currentValue;
    
    }
    }
}
