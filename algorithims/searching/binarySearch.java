package algorithims.searching;
//*✅ Used on Sorted Arrays
// The array must be sorted (ascending or descending).

//* 🔁 Divide and Conquer
// Repeatedly divides the search range in half.

//* ⚡ Time Complexity:
// Best/Average/Worst: O(log n)
// time complexity is log n when there is a recursion stack.

//* 🧠 Works by Comparing Middle
// Compare the target with the middle element:
// If equal → return index
// If target < middle → search left half
// If target > middle → search right half


public class binarySearch {
    

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};

        int target = 3;

        int indexFound = BinarySearch(array,0,array.length-1,target);
        int indexFound2 = BinarySearch2(array,target);
        
        System.out.println(indexFound);
        System.out.println(indexFound2);
    }

    // iterative version
    private static int BinarySearch2(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high){
            int midIndex = (low + high)/2;
            if (array[midIndex] == target){
                return midIndex;
            }
            if (array[midIndex] > target){
                high = midIndex - 1;
            }else {
                low = midIndex + 1;
            }
        }

        return -1; // base case when the number is not found
    }


    // recursive version 
    private static int BinarySearch(int[] array, int first, int last, int target) {
        int middle = (first + last)/2;

        if (first > last){
            return -1; 
        }

        if (target == array[middle]){
            return middle;
        }else if (target > array[middle]){
            return BinarySearch(array, middle+1, last, target);
        }else {
            return BinarySearch(array, first, middle-1, target);
        }
        
    }

    
}
