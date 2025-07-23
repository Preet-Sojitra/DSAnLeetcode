#include <bits/stdc++.h>
using namespace std;

// as name suggests we select... what? select minimums
/**
 * get minimum from array, and place it at its positon i.e., swap
 * at every step select mini from remaining array
 */

void selection_sort(int arr[], int size)
{
    for (int i = 0; i <= size - 2; i++)
    {
        int mini_idx = i;
        for (int j = i; j <= size - 1; j++)
        {
            if (arr[j] < arr[mini_idx])
            {
                mini_idx = j;
            }
        }

        // now swap
        int temp = arr[mini_idx];
        arr[mini_idx] = arr[i];
        arr[i] = temp;
    }
}

// Time Complexity : O(n^2) => for best, worst and average

int main()
{
    int arr[6] = {13, 46, 24, 52, 20, 9};

    selection_sort(arr, 6);

    for (int i = 0; i < 6; i++)
    {
        cout << arr[i] << " ";
    }

    return 0;
}