package Leetcode;

// https://leetcode.com/problems/split-array-largest-sum/

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 5, 10, 8 };

        System.out.println(splitArray(arr, 2));

    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            // minimum sum we have is when the array is divided in into "k" pieces where k =
            // length of array
            start = Math.max(start, nums[i]); // in the end of the loop this will contain the max item from the array
            end += nums[i]; // maximum sum we can have is sum of all the values

            // This we got range [min,max] -> and that's why we will use binary search for
            // this
        }

        // Apply Binary Search
        while (start < end) {
            // try for the middle as potential answer
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with the max sum as "mid"
            int sum = 0;
            int pieces = 1; // atleast you can divide it in one piece

            for (int num : nums) {
                if (sum + num > mid) {
                    // if sum + num exceeds means you cannot add this num in subarray, make new sub
                    // array
                    // say you add this num in new subarray, then sum = num

                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                // if pieces that we are making are actually greater than, this means the sum of
                // each subarray is minimum than what is required, so we will search after mid
                // (because mid is selected as potential answer)
                start = mid + 1;
            } else {
                // if pieces are actually less than m, this means sum of all elements in array
                // is larger, so to minimize the sum we will look in left part of the mid
                end = mid;
            }
        }

        return end; // return start or end, because we will have answer when all start == end == mid
    }
}
