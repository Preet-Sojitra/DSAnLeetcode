#include <bits/stdc++.h>
using namespace std;

void printFib(int n)
{

    vector<int> v = {0, 1};

    for (int i = 2; i <= n; i++)
    {
        int sum = v[i - 1] + v[i - 2];
        v.push_back(sum);
    }

    for (auto it : v)
    {
        cout << it << " ";
    }
}

int fibRecur(int n)
{

    if (n == 0)
        return 0;
    if (n == 1)
        return 1;

    return fibRecur(n - 1) + fibRecur(n - 2);
}

int main()
{
    cout << "Enter nth term: ";
    int n;
    cin >> n;
    // printFib(n);
    cout << fibRecur(n);
    return 0;
}