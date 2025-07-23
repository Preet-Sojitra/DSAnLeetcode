#include <bits/stdc++.h>
using namespace std;

vector<int> countFrquency(int n, int x, vector<int> &nums)
{
    // precompute hash
    vector<int> hash(n);

    for (int i = 0; i < n; i++)
    {
        if (nums[i] <= n)
        {
            hash[nums[i] - 1]++;
        }
    }

    return hash;
}

int main()
{
    int n = 7;
    int x = 20;
    vector<int> nums = {10, 7, 9, 8, 14, 20, 6};

    vector<int> v = countFrquency(n, x, nums);

    for (auto it : v)
    {
        cout << it << " ";
    }
    return 0;
}