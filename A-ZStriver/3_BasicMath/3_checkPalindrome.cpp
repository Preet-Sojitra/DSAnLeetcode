#include <bits/stdc++.h>
using namespace std;

bool checkPalindrome(int n)
{

    int temp = n;
    int rev = 0;

    while (temp)
    {
        int rem = temp % 10;
        rev = rev * 10 + rem;

        temp = temp / 10;
    }

    if ((rev == n && n > 0) || n == 0)
    {
        return true;
    }

    return false;
}

int main()
{
    if (checkPalindrome(0))
    {
        cout << "Palindrome Number";
    }
    else
    {
        cout << "Not a Palindrome";
    }

    return 0;
}