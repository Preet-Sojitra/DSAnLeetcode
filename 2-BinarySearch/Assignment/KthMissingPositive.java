// https://leetcode.com/problems/kth-missing-positive-number/

package Assignment;

public class KthMissingPositive {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 11 };

        System.out.println(findKthPositive(arr, 5));
    }

    static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int missingNumbers = arr[n - 1] - n; // Actual - Expected

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // compute missing till mid
            missingNumbers = arr[mid] - (mid + 1); // mid + 1 because our array will start with 1

            if (missingNumbers >= k) {
                // check in left
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // if end = -1
        if (end == -1)
            return k;

        return arr[end] + k - (arr[end] - (end + 1));
    }

    // Logic for Binary Search
    /**
     * Missing numbers are between range: arr[start] and arr[end]
     * Count (missing numbers) = arr[end] - arr.length . Because without missing
     * number, since array in in increasing order, element at ith index should be i.
     * count > k -> answer lies in list else answer lies outside list
     * If answer lies outside range, it means no elements in array are missing, so
     * in this case we can directly give answer by: arr[end] + k -
     * count(missingNumbers)
     * If answer lies within list, we can apply binary search
     */
}
