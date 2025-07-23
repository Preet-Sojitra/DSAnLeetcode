#include <bits/stdc++.h>
using namespace std;

int reverseBits(int n)
{
    int count = 0;
    int temp = n;
    while (temp > 0)
    {
        int remainder = temp % 10;
        // cout << reminder << endl;

        // this remainder != 0 check is important becuase if it will be 0 then it will divide n by 0 thus giving error.
        if (remainder != 0 && n % remainder == 0)
        {
            count++;
        }

        temp = temp / 10;
    }

    return count;
}

int main()
{
    int n = reverseBits(660);

    cout << n;

    return 0;
}

/**
 * Trick for calculating the number of digits.
 * Take log base 10 of the number. Take floor and add 1.
 */