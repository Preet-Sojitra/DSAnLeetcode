package Leetcode;
// LeetCode : https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class SmallestGreaterTarget {
    public static void main(String[] args) {
        char[] letters = { 'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n', };
        char target = 'e';

        System.out.println(nextGreatestLetter(letters, target));

    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        if (target >= letters[end]) {
            return letters[0];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start];
    }
}
