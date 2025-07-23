#include <bits/stdc++.h>
using namespace std;

vector<int> minMaxFreq(vector<int> &arr)
{
    map<int, int> mpp;

    for (int i = 0; i < arr.size(); i++)
    {
        mpp[arr[i]]++;
    }

    int maxFreq = 0, minFreq = arr.size();
    int maxEle = 0, minEle = 0;

    for (auto it : mpp)
    {
        int count = it.second;
        int ele = it.first;

        if (count > maxFreq)
        {
            maxFreq = count;
            maxEle = ele;
        }
        if (count < minFreq)
        {
            minFreq = count;
            minEle = ele;
        }
    }

    return {maxEle, minEle};
}

int main()
{
    vector<int> v = {1, 2, 3, 1, 1, 4};

    vector<int> max_min = minMaxFreq(v);
    for (auto it : max_min)
    {
        cout << it << " ";
    }
    return 0;
}