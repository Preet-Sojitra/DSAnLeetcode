#include <bits/stdc++.h>
using namespace std;

void print(int n)
{
    // straight
    for (int i = 0; i < n; i++)
    {
        // stars
        for (int j = 0; j < n - i; j++)
        {
            cout << "*";
        }

        // space
        for (int j = 0; j < i * 2; j++)
        {
            cout << " ";
        }

        // stars
        for (int j = 0; j < n - i; j++)
        {
            cout << "*";
        }

        cout << endl;
    }

    // reverse
    for (int i = 0; i < n; i++)
    {

        // stars
        for (int j = 0; j <= i; j++)
        {
            cout << "*";
        }

        // spaces
        for (int j = 0; j < 2 * n - 2 - 2 * i; j++)
        {
            cout << " ";
        }

        // stars
        for (int j = 0; j <= i; j++)
        {
            cout << "*";
        }

        cout << endl;
    }
}

int main()
{
    print(5);
    return 0;
}