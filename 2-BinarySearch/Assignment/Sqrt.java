package Assignment;

// https://leetcode.com/problems/sqrtx/
public class Sqrt {
    public static void main(String[] args) {

        System.out.println(mySqrt(4));
    }

    static int mySqrt(long x) {
        long start = 0;
        long end = x;

        while (start + 1 < end) {
            long mid = start + (end - start) / 2;

            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                start = mid;
            } else {
                end = mid;
            }

        }

        if (end * end == x) {
            return (int) end;
        }

        return (int) start;
    }

    // My approach is giving memory error
    // static int mySqrt(long x) {
    // long start = 0;
    // long end = x - 1;

    // int[] arr = new int[(int) x];
    // for (int i = 0; i < x; i++) {
    // arr[i] = i + 1;
    // }

    // while (start <= end) {
    // long mid = start + (end - start) / 2;

    // if (arr[(int) mid] > x / arr[(int) mid]) {
    // end = mid;
    // }
    // if (mid < end && arr[(int) mid] * arr[(int) mid] < x && arr[(int) mid + 1] *
    // arr[(int) mid + 1] > x) {
    // return arr[(int) mid];
    // }
    // if (arr[(int) mid] < x / arr[(int) mid]) {
    // start = mid + 1;
    // }
    // if (arr[(int) mid] == x / arr[(int) mid]) {
    // return arr[(int) mid];
    // }
    // }

    // return 0;
    // }
}
