package algorithims.searching;

//* Linear Search Algorithm (Sequential Search)
//* This algorithm searches for a target value within a list by checking each element in sequence until the target is found or the list ends.

public class linearSearch {

    public static int seqSearch(int[] list, int target) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int result = seqSearch(arr, target);
        System.out.println("Index of target: " + result);
    }
}