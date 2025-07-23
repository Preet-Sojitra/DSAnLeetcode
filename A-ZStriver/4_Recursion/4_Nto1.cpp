#include <bits/stdc++.h>
using namespace std;

void printNto1(int n, int end)
{
    if (n < end)
        return;
    cout << n << " ";
    printNto1(n - 1, end);
}

int main()
{
    printNto1(10, 1);
    return 0;
}