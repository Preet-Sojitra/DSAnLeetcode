#include <bits/stdc++.h>
using namespace std;

void explain_pair()
{
    pair<int, int> p = {1, 3};
    cout << p.first << " " << p.second << endl;

    pair<int, pair<int, int>> p1 = {1, {3, 4}};
    cout << p1.second.second << endl;

    pair<int, int> arr[] = {{1, 2}, {3, 4}, {4, 5}};
    cout << arr[1].second;
}

int main()
{
    explain_pair();
    return 0;
}