import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // int[] arr = { 5, 4, 3, 2, 1 };
        int[] arr = { 1, 2, 3, 4, 5 };
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[] arr) {
        // maintaing this so that if array is already sorted then we don't need to run
        // outer loop n-1 times, by this variable if no values swapped then we will
        // terminate program
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than prev item
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            // if you did not swap for a particular value of "i" it means the array is
            // sorted then break the program
            if (!swapped) {
                break;
            }
        }
    }
}
