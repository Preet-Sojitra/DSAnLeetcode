#include <bits/stdc++.h>
using namespace std;

bool isArmstrong(int n)
{
    int n_digits = floor(log10(n) + 1);

    int sum = 0;
    int tmp = n;
    while (tmp)
    {
        int dig = tmp % 10;
        sum += pow(dig, n_digits);
        tmp /= 10;
    }

    if (sum == n)
    {
        return true;
    }

    return false;
}

int main()
{
    cout << isArmstrong(1634);

    return 0;
}