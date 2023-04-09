package Leetcode;

// https://leetcode.com/problems/missing-number/

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 0 };
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] nums) {
        // Sorting according to cylic sort
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];

            if (nums[i] == nums.length) {
                i++;
                continue;
            } else if (nums[correctIndex] != nums[i]) {
                swap(nums, i, correctIndex);

            } else {
                i++;
            }
        }

        // After sorting run linear search to check for missing number, if index ==
        // value continue

        return linearSearch(nums);
    }

    static int linearSearch(int[] nums) {
        for (int j = 0; j < nums.length; j++) {
            if (j == nums[j]) {
                continue;
            } else {
                return j;
            }
        }
        return nums.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

// Other Solution and this is demn good

class Solution {
    public int missingNumber(int[] nums) {

        // Since array contains 0 to n numbers so expectedSum will be sum of all numbers
        // from 0 to n which is equal to sum of first n+1 numbers
        // Started with 0, we will keep adding each number to sum, and then return
        // expected-current. Thus it will return the number which is missing

        int expected = (1 + nums.length) * nums.length / 2;

        int cur = 0;
        for (int num : nums) {
            cur += num;
        }

        return expected - cur;

    }
}