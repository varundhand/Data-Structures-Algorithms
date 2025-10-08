package algorithims.sorting;

//* Shell Sort: swapping distant elements first, then gradually reducing the distance (called the gap) until it becomes 1 — at which point it behaves like normal insertion sort, but with most elements already nearly sorted. */
// Insertion sort is slow because it only swaps adjacent elements — one by one.
// If an element is far from where it should be, it takes many small swaps to get there.

public class shellSort {
    public static void main(String[] args) {
        int unsortedArray[] = {9,8,5,6,3,2,1};

        shellSort(unsortedArray);

        for (int i = 0 ; i< unsortedArray.length; i++){
            System.out.println(unsortedArray[i]);
        }
    }

    private static void shellSort(int[] unsortedArray) {
        int n = unsortedArray.length;

        for (int gap=n/2; gap>0; gap /=2){
            for (int i = gap; i<n ; i++){ // gapped insertion sort
                int temp = unsortedArray[i];
                int j = i;

                while(j>=gap && unsortedArray[j-gap] > temp){
                    unsortedArray[j] = unsortedArray[j-gap];
                    j-= gap;
                }

                unsortedArray[j] = temp;
            }
        }

    }
}
