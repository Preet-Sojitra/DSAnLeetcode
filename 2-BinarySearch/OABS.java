
// Order agnoistic Binary Search - we know it is sorted array but don't know whether it is sorted in ascending order or descending order

public class OABS {
    public static void main(String[] args) {

        int[] arr = { 65, 45, 32, 7, 3, 2, 1 };

        System.out.println(oabs(arr, 2));

    }

    static int oabs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find wheter arr is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

}
