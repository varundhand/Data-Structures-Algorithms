package algorithims.sorting;
import java.util.Arrays;
// Selection sort is an in-place, comparison-based sorting algorithm that divides a list into sorted and unsorted sections.
// It repeatedly finds the minimum element in the unsorted section and swaps it with the first element of the unsorted section, moving that element to the sorted section. 
// This process continues until the entire list is sorted.

// It compares each element with evvery other element to find the minimum or maximum element to sort the in a sorted section

// Time Complexity: O(n^2) in all cases (best, average, worst) because it always involves nested loops.
// Stable: No

public class selectionSort {

    
    public static void main(String[] args) {
        int unsortedArray[] = {9,8,5,6,3,2,1};

        selectionSort(unsortedArray);

        // for (int i = 0 ; i< unsortedArray.length; i++){
        //     System.out.println(unsortedArray[i]);
        // }

        System.out.println(Arrays.toString(unsortedArray));
    }

    private static void selectionSort(int[] unsortedArray) {
        for (int i = 0 ; i< unsortedArray.length; i++){
            // find the max item in the remaining array and swap with the correct index.
            int last_index = unsortedArray.length - i - 1; // we subtract i because the array is sorted at the end
            int max_num_index = getMaxIndex(unsortedArray,0,last_index); // we check the maximum element from 0 to latest last index only.

            // swap last_index with the max_num_index 
            swap(unsortedArray,max_num_index,last_index);

        }
    }


    private static void swap(int[] unsortedArray, int max_num_index, int last_index) {
        int temp = unsortedArray[max_num_index];
        unsortedArray[max_num_index] = unsortedArray[last_index];
        unsortedArray[last_index] = temp;
    }

    //* returns index of the maximum element in the array */
    private static int getMaxIndex(int[] unsortedArray, int start, int last_index) {
        int max = start; // 0 always
        for (int i = 0 ; i <= last_index; i++){
            if (unsortedArray[i] > unsortedArray[max]){
                max = i;
            }
        }
        return max;
    }
}
