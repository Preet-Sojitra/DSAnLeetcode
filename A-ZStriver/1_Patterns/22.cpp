#include <bits/stdc++.h>
using namespace std;

void print(int n)
{
    for (int i = 0; i < 2 * n - 1; i++)
    {
        for (int j = 0; j < 2 * n - 1; j++)
        {
            int top = i;  // row
            int left = j; // column
            int right = (2 * n - 2) - j;
            int bottom = (2 * n - 2) - i;

            cout << (n - min(min(top, bottom), min(left, right))) << " ";
        }
        cout << endl;
    }
}

int main()
{
    print(4);
    return 0;
}