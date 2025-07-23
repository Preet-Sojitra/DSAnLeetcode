#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n;

    int arr[n];

    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    // precompute
    // key, value: here key will be the number from that array and value will be its frequency
    map<int, int> mpp; // map stores all the values in sorted order

    // there is also thing called unordered_map
    unordered_map<int, int> unmpp;
    for (int i = 0; i < n; i++)
    {
        mpp[arr[i]]++;
    }

    // iterate in map
    for (auto it : mpp)
    {
        cout << it.first << "->" << it.second << endl;
    }

    int q;
    cin >> q;

    while (q--)
    {
        int number;
        cin >> number;

        // fetch
        cout << mpp[number] << endl;
    }

    return 0;
}