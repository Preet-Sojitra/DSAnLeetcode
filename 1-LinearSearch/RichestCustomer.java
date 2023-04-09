
// Leetcode : https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomer {

    public static void main(String[] args) {

        int[][] accounts = {
                { 1, 5 },
                { 3, 7 },
                { 3, 5 }
        };

        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int wealth = 0;
        int maximumWealth = 0;

        for (int row = 0; row < accounts.length; row++) {
            for (int col = 0; col < accounts[row].length; col++) {
                wealth += accounts[row][col];
            }
            if (wealth > maximumWealth) {
                maximumWealth = wealth;
            }
            wealth = 0;
        }

        return maximumWealth;
    }
}
