// Leetcode Question: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenNumberDigits {

    public static void main(String[] args) {
        int[] nums = { 555, 901, 482, 1771 };

        System.out.println(findNumbers(nums));

    }

    static int findNumbers(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {

            if (((nums[i] + "").length()) % 2 == 0) {
                ans++;
            }

        }
        return ans;
    }
}
