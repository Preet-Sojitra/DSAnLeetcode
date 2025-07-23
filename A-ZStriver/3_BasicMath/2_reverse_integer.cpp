#include <bits/stdc++.h>
using namespace std;

int reverse(int n)
{
    // if (n == 0)
    // {
    //     return 0;
    // }

    long revNum = 0;
    // int temp = abs(n);
    int temp = n;

    // if n is -ve, then this loop will not run... thus we need to make n absolute
    // while (tmep > n)

    // -ve values are considered as true,... so no need to take abs
    while (temp)
    {
        int remainder = temp % 10;
        revNum = revNum * 10 + remainder;
        temp = temp / 10;
    }

    if (revNum > INT32_MAX || revNum < INT32_MIN)
        return 0;

    return revNum;
    // if (n > 0)
    // {
    //     return revNum;
    // }
    // else
    // {
    //     return -revNum;
    // }
}

int main()
{
    cout << reverse(-123);

    return 0;
}