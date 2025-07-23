#include <bits/stdc++.h>
using namespace std;

/**
 * It always takes an element and places it in correct position
 */

void insertion_sort(int arr[], int size)
{
    for (int i = 0; i <= size - 1; i++)
    {
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j])
        {
            int tmp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = tmp;
            j--;
        }
    }
}

// Time Complexity:
// O(n^2) => worst case or avg case
// O(n) => best case (if already sorted)

int main()
{
    int arr[6] = {13, 46, 24, 52, 20, 9};

    insertion_sort(arr, 6);

    for (int i = 0; i < 6; i++)
    {
        cout << arr[i] << " ";
    }

    return 0;
}