#include <bits/stdc++.h>
using namespace std;

/**
 * Divide and merge
 */

void merge(vector<int> &arr, int low, int mid, int high)
{
    vector<int> tmp;

    // first array will be from low to mid
    // second array will be from  mid+1 to high

    int left = low;      // pointer for left part
    int right = mid + 1; // pointer for right part

    while (left <= mid && right <= high)
    {
        if (arr[left] < arr[right])
        {
            tmp.push_back(arr[left]);
            left++;
        }
        else
        {
            tmp.push_back(arr[right]);
            right++;
        }
    }

    // if there are still elements left in "left" or "right" part push them
    while (left <= mid)
    {
        tmp.push_back(arr[left]);
        left++;
    }

    while (right <= high)
    {
        tmp.push_back(arr[right]);
        right++;
    }

    // now push values from temp to original array
    for (int i = low; i <= high; i++)
    {
        arr[i] = tmp[i - low];
    }
}

void merge_sort(vector<int> &arr, int low, int high)
{
    if (low == high)
        return;

    int mid = (low + high) / 2;

    // divide
    merge_sort(arr, low, mid);      // left part
    merge_sort(arr, mid + 1, high); // right part

    // merge
    merge(arr, low, mid, high);
}

void mergeSort(vector<int> &arr, int size)
{
    merge_sort(arr, 0, size - 1);
}

// Time Complexity:
// O(n.logn) => logn for division and n for merge => best avg and worst

// Space complexity:
// O(n) since we are creating a tmp array

int main()
{
    vector<int> arr = {13, 46, 24, 52, 20, 9};

    mergeSort(arr, arr.size());

    for (int i = 0; i < 6; i++)
    {
        cout << arr[i] << " ";
    }

    return 0;
}