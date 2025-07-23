#include <bits/stdc++.h>
using namespace std;

void printName(int i, int tot)
{
    if (i > tot)
        return;
    cout << "Preet"
         << " ";
    printName(i + 1, tot);
}

vector<string> printNTimes(int n)
{
    if (n > 0)
    {
        cout << "Coding Ninjas"
             << " ";
        printNTimes(n - 1);
    }

    return {};
}

int main()
{
    printName(1, 5);
    return 0;
}