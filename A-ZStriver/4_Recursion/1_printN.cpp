#include <bits/stdc++.h>
using namespace std;

int cnt = 0;

void print()
{
    if (cnt == 4)
    {
        return;
    }
    cout << cnt << endl;
    cnt++;
    print();
}

// return an array containing numbers upto n
vector<int> printNos(int x)
{
    vector<int> v;
    if (x == 1)
    {
        v.push_back(x);
        return v;
    }
    v = printNos(x - 1);
    v.push_back(x);
}

int main()
{
    // print();
    vector<int> v = printNos(5);

    for (auto it : v)
    {
        cout << it << " ";
    }

    return 0;
}