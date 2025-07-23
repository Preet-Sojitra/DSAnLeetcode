#include <bits/stdc++.h>
#include <algorithm>
using namespace std;

void printArr(int size, int arr[])
{
    // print reverse array
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
}

// Using extra array
void reverseArr(int size, int arr[])
{

    int ans[size];

    for (int i = size - 1; i >= 0; i--)
    {
        ans[size - i - 1] = arr[i];
    }

    printArr(size, ans);
}

void swap(int p1, int p2, int arr[])
{
    int temp = arr[p1];
    arr[p1] = arr[p2];
    arr[p2] = temp;
}

// 2 pointer method : Without using extra array
void reverseArrTwoPointer(int size, int arr[])
{
    int ans[size];
    int p1 = 0;
    int p2 = size - 1;

    while (p1 < p2)
    {
        swap(p1, p2, arr);
        p1++;
        p2--;
    }

    printArr(size, arr);
}

// recursive method: similar to two pointer method
void reverseArrRecursive(int arr[], int start, int end)
{
    if (start < end)
    {
        swap(start, end, arr);
        reverseArrRecursive(arr, start + 1, end - 1);
    }
}

// inbuilt function: defined in "algorithm lib"
void reverseInbuilt(int size, int arr[])
{
    reverse(arr, arr + size);
}

int main()
{
    int arr[] = {5, 4, 3, 2, 1};
    // reverseArr(5, arr);
    // reverseArrTwoPointer(5, arr);
    reverseArrRecursive(arr, 0, 4);
    printArr(5, arr);

    return 0;
}