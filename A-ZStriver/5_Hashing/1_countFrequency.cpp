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
    int hash[13] = {0}; // initialize all to 0
    // arr size can only go upto 10^6 if it is declared in main, if declared globally then it will go upto 10^7
    for (int i = 0; i < n; i++)
    {
        hash[arr[i]] += 1;
    }

    int q; // query
    cin >> q;
    while (q--)
    {
        int number; // the number whose freq we want to find
        cin >> number;

        // fetch
        cout << hash[number];
    }

    return 0;
}