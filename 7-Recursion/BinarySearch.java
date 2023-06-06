
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 55, 66, 78 };
        int target = 66;
        System.out.println(binarySearch(arr, target, 0, arr.length));
    }

    static int binarySearch(int[] arr, int target, int s, int e) {

        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        } else if (arr[m] > target) {
            // Make sure to return the result of a function call of the return type
            return binarySearch(arr, target, s, m - 1);
        } else {
            return binarySearch(arr, target, m + 1, e);
        }

    }
}
