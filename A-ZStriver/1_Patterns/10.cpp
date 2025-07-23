#include <bits/stdc++.h>
using namespace std;

void print(int n)
{
    // n = midpoint; point jidhar se symmetry break ho rhi
    for (int i = 1; i <= 2 * n - 1; i++)
    {
        int stars = i;

        if (i > n)
            stars = 2 * n - i;

        for (int j = 0; j < stars; j++)
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