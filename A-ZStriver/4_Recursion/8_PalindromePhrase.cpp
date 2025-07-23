#include <bits/stdc++.h>
using namespace std;

// Recursion can be used,  we have to pass the address. If we don't pass the address, then the string will be copied at each level of recursion, which will lead to MLE error.

bool isValidPalindrome(int start, int end, string &s)
{
    if (start >= end)
        return true;

    if (!isalnum(s[start]))
    {
        return isValidPalindrome(start + 1, end, s);
    }

    if (!isalnum(s[end]))
    {
        return isValidPalindrome(start, end - 1, s);
    }

    if (tolower(s[start]) == tolower(s[end]))
    {
        return isValidPalindrome(start + 1, end - 1, s);
    }

    return false;
}

bool isPalindrome(string s)
{
    if (s == " ")
        return true;

    return isValidPalindrome(0, s.length() - 1, s);
}

// Two pointer approach:
// bool isPalindrome(string s)
// {
//     if (s == " ")
//         return true;

//     int start = 0;
//     int end = s.length() - 1;

//     while (start < end)
//     {
//         if (!isalnum(s[start]))
//         {
//             start++;
//             continue;
//         }
//         if (!isalnum(s[end]))
//         {
//             end--;
//             continue;
//         }
//         if (tolower(s[start]) != tolower(s[end]))
//         {
//             return false;
//         }
//         start++;
//         end--;
//     }

//     return true;
// }

int main()
{
    string var;
    cout << "Enter the string: ";
    getline(cin, var);

    cout << isPalindrome(var);
    return 0;
}