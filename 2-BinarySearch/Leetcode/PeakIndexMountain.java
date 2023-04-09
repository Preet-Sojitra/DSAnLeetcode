package Leetcode;

// Leetcode: https://leetcode.com/problems/peak-index-in-a-mountain-array/ (Easy)
// and
// leetcode: https://leetcode.com/problems/find-peak-element/ (Medium)
public class PeakIndexMountain {

    static int peakIndexMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start < end) {
            mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    public static void main(String[] args) {

        int[] mountainArr = { 1 };

        int index = peakIndexMountainArray(mountainArr);

        System.out.println(index);

    }
}
