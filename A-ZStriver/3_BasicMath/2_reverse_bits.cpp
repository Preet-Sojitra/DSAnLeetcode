#include <bits/stdc++.h>
using namespace std;

long reverseBits(long n)
{
    long reverse = 0;

    if (n == 0)
        return 0;

    for (int i = 0; i < 32; i++)
    {
        int remainder = n % 2;
        reverse = reverse * 2 + remainder;
        n = n / 2;
    }

    return reverse;
}

int main()
{
    int n = reverseBits(12);
    cout << n;

    return 0;
}
