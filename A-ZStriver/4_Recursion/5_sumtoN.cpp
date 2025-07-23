#include <bits/stdc++.h>
using namespace std;

int sumToN(int n, int sum)
{
    if (n < 1)
    {
        return sum;
    }

    sumToN(n - 1, sum + n);
}

// or

int sum(int n)
{
    if (n == 0)
        return 0;
    return n + sum(n - 1);
}

int main()
{
    int sum = sumToN(3, 0);
    cout << sum;
    return 0;
}