package algorithims.sorting;
//* Merge Sort is a divide-and-conquer algorithm. It recursively divides the array into halves,
//   sorts each half, and merges them back together in sorted order. */

// Time Complexity:
//   - Best, Average, Worst Case: O(n log n)
// Space Complexity: O(n) (requires additional space for merging)
// Stable: Yes
// Adaptive: No


import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] array = {8,2,5,3,9,1,4,6};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return; // base case (if the length of the array is 1, then dont divide it further)

        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length-middle];

        // copying elements of the original array to left and right arrays 
        for (int i = 0; i < middle; i++) {
        leftArray[i] = array[i];
        }
        for (int i = middle; i < length; i++) {
            rightArray[i - middle] = array[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,array);

        }

    private static void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; //indices 

        // check the conditions for merging 
        while (l < leftSize && r < rightSize){
            if (leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        // Copy remaining elements from leftArray
        while(l <leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }

        // Copy remaining elements from rightArray
        while(r <rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }


}
