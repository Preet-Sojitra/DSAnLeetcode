package Assignment;

// https://leetcode.com/problems/guess-number-higher-or-lower/

public class GuessNumberHigherOrLower {
    public static void main(String[] args) {
        System.out.println(guessNumber(50));
    }

    static int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (guess(mid, 1) == -1) {
                end = mid - 1;
            } else if (guess(mid, 1) == 1) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    static int guess(int num, int pick) {
        if (num > pick) {
            return -1;
        } else if (num < pick) {
            return 1;
        } else {
            return 0;
        }
    }

}