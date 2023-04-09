// https://leetcode.com/problems/search-in-rotated-sorted-array/

package Leetcode;

/*
    Logic (My): (This didn't worked well)
    - First find peak index in array (Logic for this was wrong)
    - Then check if target < peak index or target > peak index
    - If target < peak index then do binary search on right side of target else on left side of target

    Kunal-Kushwaha:

    Approach - 1:
    - Find pivot element. (From where next number are ascending order)
    - Apply binary search in two sorted arrays
        -> Will be pivot when mid > mid+1 // case-1
        -> mid < mid-1 // case-2
        -> if start element >= mid element then all elements after mid will be < than start hence we call ignore all these elements since we are looking for peak then end=mid-1 // case-3
        -> if start element <= mid element then peak will lie somewhere after mid, so start = mid+1 // case-4
 */

//  Approach-1
public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };

        System.out.println(search(arr, 0));

    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        // if you did not find pivot, it means array is not rotated
        if (pivot == -1) {
            // do normal binary search
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted array
        // case-1
        if (arr[pivot] == target) {
            return pivot;
        }
        // case-2: target element > start element
        if (arr[0] <= target) {
            return binarySearch(arr, target, 0, pivot - 1);
        }
        // case-3: target element < start element
        else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;

    }

    // This will not work for duplicate values
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return -1;
    }
}