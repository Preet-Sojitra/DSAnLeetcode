package Assignment;

public class FirstBadVersion {
    public static void main(String[] args) {

    }

    static int firstBadVersion(int n) {
        // int start = 1;
        // int end = n;

        // while (start <= end) {
        // int mid = start + (end - start) / 2;

        // // isBadVersion is defined API in leetcode
        // if (isBadVersion(mid) == false) {
        // start = mid + 1;
        // } else if (start == end && isBadVersion(mid) == true) {
        // return mid;
        // } else {
        // end = mid;
        // }
        // }
        // return -1;

        int start = 1;
        int end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (isBadVersion(mid) == false) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }

    // This method is written here only to solve the not defined error.
    private static boolean isBadVersion(int mid) {
        return false;
    }
}