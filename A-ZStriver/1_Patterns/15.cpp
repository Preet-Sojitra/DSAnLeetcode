#include <bits/stdc++.h>
using namespace std;

void print(int n)
{
    for (int i = n; i > 0; i--)
    {
        for (char ch = 'A'; ch < 'A' + i; ch++)
        {
            cout << ch << " ";
        }
        cout << endl;
    }
}

int main()
{
    print(5);

    return 0;
}