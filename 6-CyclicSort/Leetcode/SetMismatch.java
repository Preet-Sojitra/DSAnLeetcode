// https://leetcode.com/problems/set-mismatch/

package Leetcode;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4 };
        // int[] nums = { 8, 7, 3, 5, 3, 6, 1, 4 };
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    static int[] findErrorNums(int[] nums) {
        int[] errorNums = new int[2];
        int i = 0;

        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            if (nums[i] != nums[correctIndex]) {
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                errorNums[0] = nums[j];
                errorNums[1] = j + 1;
                break;
            }
        }

        return errorNums;
    }
}
