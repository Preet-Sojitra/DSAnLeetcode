package Leetcode.MyWrongSubmissions;
// https://leetcode.com/problems/search-in-rotated-sorted-array/

/*
    Logic (My): (This didn't worked well)
    - First find peak index in array (Logic for this was wrong)
    - Then check if target < peak index or target > peak index
    - If target < peak index then do binary search on right side of target else on left side of target
 */

public class SearchInRotatedSortedArray {

    static int findPeakIndex(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        int mid = 0;

        while (true) {
            mid = start + (end - start) / 2;

            if (nums[mid] < nums[mid + 1]) {
                start = (mid + 1) % nums.length;
            } else {
                end = mid;
            }

            if (nums[start - 1] < nums[start] && nums[start] > nums[(start + 1) % nums.length]) {
                return start;
            }
        }

    }

    static int binarySearch(int[] nums, int target, int start, int end) {

        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    static int search(int[] nums, int target) {

        int peakIndex = findPeakIndex(nums);
        int index = -1;
        if (target <= nums[peakIndex]) {
            index = binarySearch(nums, target, (peakIndex + 1) % nums.length, nums.length - 1);
        } else if (index == -1 || target > nums[peakIndex]) {
            return binarySearch(nums, target, 0, peakIndex);
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 1, 3 };

        // int indexOfTarget = search(nums, 0);
        // int indexOfTarget = search(nums, 5);

        System.out.println(findPeakIndex(nums));
    }
}
