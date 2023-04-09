package Assignment;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

// Logic
/*
 * Maintain two pointer, one at starting and one at ending.
 * Check sum of start + end
 * if sum > target, then decrease end pointer // decrease because array is sorted and since end is high number we want to decrease the sum to take it closer to target
 * else increase start pointer
 * when equal target break
 */

public class TwoSum_II {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 4, 5, 7, 11 };

        System.out.println(Arrays.toString(twoSumBinary(numbers, 9)));
        // System.out.println(Arrays.toString(twoSum(numbers, 9)));
    }

    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {

            int sum = numbers[start] + numbers[end];

            if (sum > target) {
                end--;
            } else if (sum < target) {
                start++;
            } else {
                return new int[] { start + 1, end + 1 };
            }

        }

        return new int[] { -1, -1 };
    }

    // Using binary
    static int[] twoSumBinary(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (numbers[start] + numbers[end] == target)
                return new int[] { start + 1, end + 1 };
            else if (numbers[start] + numbers[end] < target) {
                start = (numbers[mid] + numbers[end] < target) ? mid : start + 1;
            } else {
                end = (numbers[mid] + numbers[start] < target) ? end - 1 : mid;
            }
        }
        if (numbers[start] == (target - numbers[end]))
            return new int[] { start + 1, end + 1 };
        return new int[] { -1, -1 };
    }
}