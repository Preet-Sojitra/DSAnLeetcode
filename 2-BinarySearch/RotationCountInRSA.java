// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

public class RotationCountInRSA {
    public static void main(String[] args) {
        int[] arr = { 66, 67, 7, 10, 14, 19, 27, 33, 36, 40, 44, 54, 60 };

        System.out.println(findKRotation(arr, arr.length));

    }

    static int findKRotation(int[] arr, int n) {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }
}
