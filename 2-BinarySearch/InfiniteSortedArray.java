// Question : https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

class InfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 8, 10, 11, 12, 15, 20, 23, 30 };
        int target = 1;

        System.out.println(findIndex(arr, target));

    }

    static int findIndex(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            start = end + 1;
            end = end * 2;
        }

        // apply binary search for the chunck
        int index = binarySearch(arr, target, start, end);

        return index;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }

        }

        return -1;
    }
}