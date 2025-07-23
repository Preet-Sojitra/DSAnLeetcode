#include <bits/stdc++.h>
#include <string>
using namespace std;

long long factorial(long long n)
{
    if (n == 0)
        return 1;

    return n * factorial(n - 1);
}

vector<long long> factorialNumbers(long long n)
{
    // This approach is TLE
    // vector<long long> v;
    // for (int i = 1; i <= n; i++)
    // {
    //     int fact = factorial(i);

    //     if (fact <= n)
    //         v.push_back(fact);
    //     else
    //         break;
    // }

    vector<long long> v;
    long long fact = 1;
    int i = 1;
    while (n >= fact)
    {
        v.push_back(fact);
        i++;
        fact = factorial(i);
    }

    return v;
}

int main()
{
    vector<long long> v = factorialNumbers(7);

    for (auto it : v)
    {
        cout << it << " ";
    }

    return 0;
}