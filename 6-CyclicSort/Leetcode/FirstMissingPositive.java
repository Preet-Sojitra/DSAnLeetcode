package Leetcode;

public class FirstMissingPositive {
    public static void main(String[] args) {

    }

    static int firstMissingPositive(int[] nums) {
        // Sorting according to cylic sort
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            // Ignoring the negatives and numbers greater than N
            if (nums[i] > 0 && nums[i] <= nums.length && nums[correctIndex] != nums[i]) {
                // Swap
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

        // After sorting run linear search to check for missing number, if index ==
        // value continue

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }

        return nums.length + 1;
    }

}