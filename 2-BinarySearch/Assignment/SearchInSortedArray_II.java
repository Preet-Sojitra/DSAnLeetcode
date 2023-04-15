package Assignment;

// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

public class SearchInSortedArray_II {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 6, 0, 0, 1, 2 };

        System.out.println(search(nums, 5));
    }

    static boolean search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target)
                return true;

            // if left half is sorted
            if (nums[mid] > nums[start]) {
                // do binary search in left
                if (target < nums[mid] && target >= nums[start]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            }
            // if right half is sorted
            else if (nums[mid] < nums[start]) {
                // do binary search
                if (target > nums[mid] && target < nums[start]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
            // when not sure on which half the value is present
            // num[start] == nums[end] == nums[mid]
            else {
                start++;
            }
        }
        return false;

    }

}