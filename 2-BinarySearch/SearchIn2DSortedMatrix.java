import java.util.Arrays;

// Matrix is sorted in row wise and column wise

public class SearchIn2DSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };
        int target = 50;
        int[] test = binarySearch(arr, target);
        System.out.println(Arrays.toString(test));
    }

    static int[] binarySearch(int[][] arr, int target) {
        int start = 0; // lower bound
        int end = arr[0].length - 1; // upperbound

        // My Solution -> Partially correct
        // for (int row = start; row < arr.length; row++) {
        // for (int column = end; column > 0; column--) {
        // if (arr[start][end] > target) {
        // end--;
        // } else if (arr[start][end] < target) {
        // start++;
        // } else if (arr[start][end] == target) {
        // return new int[] { start, end };
        // }
        // }
        // }
        // return new int[] { -1, -1 };

        while (start < arr.length && end >= 0) {
            if (arr[start][end] > target) {
                end--;
            } else if (arr[start][end] < target) {
                start++;
            } else if (arr[start][end] == target) {
                return new int[] { start, end };
            }
        }
        return new int[] { -1, -1 };
    }
}