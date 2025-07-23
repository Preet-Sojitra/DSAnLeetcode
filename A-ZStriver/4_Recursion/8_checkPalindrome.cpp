#include <bits/stdc++.h>
using namespace std;

bool isEqual = true;

void checkIsPalindrome(string str, int start, int end)
{
    if (start > end)
        return;

    if (str[start] == str[end - 1])
    {
        // move forward
        checkIsPalindrome(str, start + 1, end - 1);
    }
    else
    {
        isEqual = false;
    }
}

int main()
{
    string var = "TAKE U FORWARD";
    // cout << var.length();

    checkIsPalindrome(var, 0, var.length());
    cout << isEqual << " ";

    return 0;
}