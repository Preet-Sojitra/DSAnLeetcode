#include <bits/stdc++.h>
using namespace std;

void brute_all_divisors(int n)
{
    for (int i = 1; i <= n; i++)
    {
        if (n % i == 0)
        {
            cout << i << " ";
        }
    }
}

void optimal_all_divisors(int n)
{
    // traverse upto sqrt, because sqrt of a number divides divisors into 2 halves, and divisor and its quotient both are divisior
    for (int i = 1; i <= sqrt(n); i++)
    {
        if (n % i == 0)
        {
            cout << i << " ";
            // if n is perf sq, then divisor and qutotient will be same, thus we need to count it only once
            if (i != n / i)
            {
                cout << n / i << " ";
            }
        }
    }
}

int main()
{
    cout << "Enter number";
    int n;
    cin >> n;

    // brute_all_divisors(n);
    optimal_all_divisors(n);

    return 0;
}