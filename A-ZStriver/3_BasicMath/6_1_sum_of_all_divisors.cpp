#include <bits/stdc++.h>
using namespace std;

int sumOfAllDivisors(int n)
{
    int sum = 0;

    for (int i = 1; i <= n; i++)
    {
        // for each i, we need to calculate the divisors of i
        for (int j = 1; j <= sqrt(i); j++)
        {
            if (i % j == 0)
            {
                sum += j;

                // check of considering only quotient, if "i" is perf. sq.
                if (j != i / j)
                {
                    sum += i / j;
                }
            }
        }
    }

    return sum;
}

int main()
{
    int n;
    cout << "Enter number: ";
    cin >> n;

    cout << sumOfAllDivisors(n);

    return 0;
}