#include <bits/stdc++.h>
using namespace std;

// TODO
void print(int n)
{
    for (int i = 0; i < n; i++)
    {
        // space
        for (int j = 0; j < n - (i + 1); j++)
        {
            cout << " ";
        }
        // letters
        char ch = 'A';
        int breakpoint = (2 * i + 1) / 2; // No. of characters by 2. Symmetry is breaking at half.
        for (int j = 1; j <= 2 * i + 1; j++)
        {
            cout << ch;
            if (j <= breakpoint)
                ch++;
            else
                ch--;
        }

        // space
        for (int j = 0; j < n - (i + 1); j++)
        {
            cout << " ";
        }

        cout << endl;
    }
}

int main()
{
    print(4);

    return 0;
}