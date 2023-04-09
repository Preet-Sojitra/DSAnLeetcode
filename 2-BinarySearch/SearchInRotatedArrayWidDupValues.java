
// Try to skip as many duplicates as you can
public class SearchInRotatedArrayWidDupValues {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 9, 1, 2, 2 };

        System.out.println(search(arr, 9));

    }

    static int search(int[] arr, int target) {
        int pivot = findPivotWithDuplicates(arr);

        // if you did not find pivot, it means array is not rotated
        if (pivot == -1) {
            // do normal binary search
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted array
        // case-1
        if (arr[pivot] == target) {
            return pivot;
        }
        // case-2: target element > start element
        if (arr[0] <= target) {
            return binarySearch(arr, target, 0, pivot - 1);
        }
        // case-3: target element < start element
        else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;

    }

    // This will not work for duplicate values
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // if elements mid,start,end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates

                // NOTE: what if these elements at start and end were the pivots?, So if check
                // if start or end is pivot, if not then skip

                // check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check if end is pivot or not
                if (arr[end] < arr[mid - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot is in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid]) && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}