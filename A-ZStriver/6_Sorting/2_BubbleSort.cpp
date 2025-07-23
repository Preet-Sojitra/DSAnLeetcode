#include <bits/stdc++.h>
using namespace std;

/**
 * push the maximum to the last by adjacent swaps.
 * Swaps two adjacent elements
 *
 * after first pass, maximum element will reach at its correct position
 */

void bubble_sort(int arr[], int size)
{
    for (int i = size - 1; i >= 0; i--)
    {
        int didSwap = 0;
        for (int j = 0; j <= i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                // swap
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
                didSwap = 1;
            }
        }

        if (didSwap == 0)
        {
            break;
        }
    }
}

// Time Complexity:
// O(n^2) => worst case or avg case
// O(n) => best case (if already sorted) ... For this we need to add a flag to check whether swap happened or not

int main()
{
    int arr[6] = {13, 46, 24, 52, 20, 9};

    bubble_sort(arr, 6);

    for (int i = 0; i < 6; i++)
    {
        cout << arr[i] << " ";
    }

    return 0;
}