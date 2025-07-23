#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    cin >> s;

    int q;
    cin >> q;

    // precompute
    int hash[26] = {0}; // we took size of 26 because we are calculating just for lowercase letters. If all to be considered we can make it to 256 because 256 ascii values are there.

    for (int i = 0; i < s.size(); i++)
    {
        hash[s[i] - 'a']++;
    }

    while (q--)
    {
        char c;
        cin >> c;

        // fetch
        cout << hash[c - 'a'];
    }

    return 0;
}