import java.util.Arrays;

public class BSA {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 15, 16, 18, 45, 65 };

        System.out.println(Arrays.toString(binarySearch(arr, 2)));
    }

    // return index
    // return -1 if element not found
    static int[] binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int comparisons = 0;

        while (start <= end) {
            // find middle element
            // int middle = (start + end) / 2; //might be possible that the (start+end)
            // exceeds the range of java

            // better way to do it
            int mid = start + (end - start) / 2;
            comparisons++;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return new int[] { mid, comparisons };
            }
        }
        return new int[] { -1, comparisons };
    }

}