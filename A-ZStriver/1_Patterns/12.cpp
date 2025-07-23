#include <bits/stdc++.h>
using namespace std;

void print(int n)
{
    for (int i = 1; i <= n; i++)
    {
        // number
        for (int j = 1; j <= i; j++)
        {
            cout << j << " ";
        }

        // space
        for (int j = 1; j <= 2 * n - 2 * i; j++)
        {
            cout << " ";
        }

        // number
        for (int j = i; j > 0; j--)
        {
            cout << j << " ";
        }

        cout << endl;
    }
}

int main()
{
    print(4);

    return 0;
}