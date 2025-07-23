#include <bits/stdc++.h>
using namespace std;

void print1ToN(int start, int n)
{
    if (start > n)
        return;
    cout << start << " ";
    print1ToN(start + 1, n);
}

int main()
{
    print1ToN(1, 5);
    return 0;
}