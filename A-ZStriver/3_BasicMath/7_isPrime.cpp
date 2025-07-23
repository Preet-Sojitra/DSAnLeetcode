#include <bits/stdc++.h>
using namespace std;

bool isPrime(int n)
{
    int divisors = 0;
    for (int i = 1; i <= sqrt(n); i++)
    {
        if (n % i == 0)
        {
            divisors++;

            if (i != n / i)
            {
                divisors++;
            }
        }
    }

    if (divisors == 2)
    {
        return true;
    }
    else
    {
        return false;
    }
}
int main()
{
    cout << "Enter number";
    int n;
    cin >> n;

    // brute_all_divisors(n);
    cout << isPrime(n);

    return 0;
}