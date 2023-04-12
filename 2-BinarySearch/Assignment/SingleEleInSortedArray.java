package Assignment;

// https://leetcode.com/problems/single-element-in-a-sorted-array/

public class SingleEleInSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 8, 8 };

        System.out.println(singleNonDuplicate(arr));
    }

    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            if (nums[start] == nums[start + 1] && nums[end] == nums[end - 1]) {
                start += 2;
                end -= 2;
            } else if (nums[end] != nums[end - 1]) {
                return nums[end];
            } else {
                return nums[start];
            }
        }

        return nums[start];

    }

}