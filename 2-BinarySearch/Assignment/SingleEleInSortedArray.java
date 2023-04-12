package Assignment;

// https://leetcode.com/problems/single-element-in-a-sorted-array/

public class SingleEleInSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };

        // System.out.println(singleNonDuplicate(arr));
        System.out.println(singleNonDuplicateBinary(arr));
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

    // using Binary Search
    // 1. boundary check
    // 2. pair index property : starts in pair, starts at 0 and 2nd pair at index 1.
    // After single element it will start with odd index and end at even index
    // 3. unique element property
    static int singleNonDuplicateBinary(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        // 1. Boundary check
        if (nums.length == 1) {
            return nums[start];
        }
        if (nums[start] != nums[start + 1]) {
            return nums[start];
        }
        if (nums[end] != nums[end - 1]) {
            return nums[end];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            // if mid == odd and mid ele == mid-1 ele then it is following pair index
            // property, so will check on right side
            if (mid % 2 != 0 && nums[mid] == nums[mid - 1]) {
                start = mid + 1;
            } else if (mid % 2 != 0 && nums[mid] != nums[mid - 1]) { // this means pair is starting from odd index and
                                                                     // thus answer must be on left hand side
                end = mid - 1;
            } else if (mid % 2 == 0 && nums[mid] == nums[mid + 1]) { // if mid == even and next element == mid then
                                                                     // answer is on right side
                start = mid + 2;
            } else if (mid % 2 == 0 && nums[mid] == nums[mid - 1]) { // if mid == even and prev ele == mid then answer
                                                                     // is on left side
                end = mid - 2;
            } else {
                return nums[mid];
            }

        }

        return nums[start];

    }

}