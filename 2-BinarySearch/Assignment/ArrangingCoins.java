// https://leetcode.com/problems/arranging-coins/ (Easy)

package Assignment;

public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 145;

        System.out.println(arrangeCoins(n));
        System.out.println(simpleMath(n));
        System.out.println(arrangeCoinsBinary(n));
    }

    // Linear Time Complexity -> Thus bad
    static int arrangeCoins(int n) {
        int noOfCoins = n;
        int completeRows = 0;
        for (int i = 1; i <= n; i++) {
            if (i <= noOfCoins) {
                noOfCoins -= i;
                completeRows++;
            } else {
                return completeRows;
            }
        }

        return completeRows;
    }

    // Using Binary search to reduce time complexity
    static int arrangeCoinsBinary(int n) {
        long start = 1;
        long end = n;
        long completeRows = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            long sum = (mid * (mid + 1)) / 2;

            if (sum == n) {
                return (int) mid;
            } else if (sum > n) {
                // Check left
                end = mid - 1;
            } else {
                // Check right
                completeRows = mid;
                start = mid + 1;
            }
        }
        return (int) completeRows;
    }

    // using simple math: Sum of first n numbers
    static int simpleMath(int n) {
        int i = 0;
        for (i = 1; (i * (i + 1)) / 2 <= n; i++)
            ;
        return i - 1;
    }
}