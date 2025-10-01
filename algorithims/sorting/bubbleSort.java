package algorithims.sorting;
//* Bubble Sort pairs of adjacent elements are compared, and the elements are swapped if they are not in order*/

// Time Complexity: Quadratic Time O(n^2)
// Bad and ineffecient algo in general

public class bubbleSort{
    public static void main(String[] args) {
        int unsoortedArray[] = {9,8,5,6,3,2,1};

        bubbleSort(unsoortedArray);

        for (int i = 0 ; i< unsoortedArray.length; i++){
            System.out.println(unsoortedArray[i]);
        }
    }

    private static void bubbleSort(int[] unsoortedArray) {
        for (int i = 0; i< unsoortedArray.length-1; i++){
            for (int j =0 ; j< unsoortedArray.length-1; j++){
                if (unsoortedArray[j] > unsoortedArray[j+1]){
                    int temp;
                    temp = unsoortedArray[j];
                    unsoortedArray[j] = unsoortedArray[j+1];
                    unsoortedArray[j+1] = temp;
                }
            }
        }
    }
}