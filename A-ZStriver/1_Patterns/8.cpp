#include <bits/stdc++.h>
using namespace std;

void print(int n)
{
    for (int i = n; i > 0; i--)
    {
        // space
        for (int j = 0; j < n - i; j++)
        {
            cout << " ";
        }

        // star
        for (int j = 0; j < 2 * i - 1; j++)
        {
            cout << "*";
        }

        // space
        for (int j = 0; j < n - i; j++)
        {
            cout << " ";
        }

        cout << endl;
    }
}

int main()
{
    print(5);

    return 0;
}