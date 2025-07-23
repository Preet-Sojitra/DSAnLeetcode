#include <bits/stdc++.h>
using namespace std;

void print(int n)
{
    char ch = 'A';
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            cout << ch << " ";
        }
        ch++;
        cout << endl;
    }
}

int main()
{
    print(5);

    return 0;
}