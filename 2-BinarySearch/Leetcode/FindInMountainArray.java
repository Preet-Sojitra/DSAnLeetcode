package Leetcode;
// leetcode: https://leetcode.com/problems/find-in-mountain-array/

// For leetcode, simply change the array indexing to arr.get() and int[] to MountainArray

public class FindInMountainArray {

    static int search(int[] arr, int target) {
        int peak = peakIndex(arr);

        int firstTry = oabs(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        int secondTry = oabs(arr, target, peak + 1, arr.length - 1);

        return secondTry;
    }

    static int peakIndex(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start < end) {
            mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    static int oabs(int[] arr, int target, int start, int end) {

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

    public static void main(String[] args) {

    }

}
