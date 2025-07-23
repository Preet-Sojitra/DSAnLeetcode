#include <bits/stdc++.h>

using namespace std;

int gcd__bruteforce(int n1, int n2)
{

    // This is brute force approach
    int gcd = 1;
    int min = n1;

    if (n2 < n1)
    {
        min = n2;
    }

    for (int i = 1; i <= min; i++)
    {
        if (n1 % i == 0 && n2 % i == 0)
        {
            gcd = i;
        }
    }

    return gcd;
}

int main()
{
    int n1, n2;
    cout << "Enter two numbers: ";
    cin >> n1;
    cin >> n2;
    cout << gcd__bruteforce(n1, n2);

    return 0;
}