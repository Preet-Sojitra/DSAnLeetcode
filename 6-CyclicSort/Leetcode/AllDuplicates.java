// https://leetcode.com/problems/find-all-duplicates-in-an-array/

package Leetcode;

import java.util.List;
import java.util.ArrayList;

public class AllDuplicates {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

        System.out.println(findDuplicates(nums));
    }

    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<Integer>();
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
            if (j != nums[j] - 1) {
                duplicates.add(nums[j]);
            }
        }

        return duplicates;
    }
}
