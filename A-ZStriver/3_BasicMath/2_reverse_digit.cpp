#include <bits/stdc++.h>
using namespace std;

int reverseBits(int n)
{
    string newNum = "";

    while (n > 0)
    {
        int remainder = n % 10;
        newNum.append(to_string(remainder));
        n = n / 10;

        // or
        // newNum = 0
        //  newNum = newNum*10 + remainder
    }

    return stoi(newNum);
}

int main()
{
    int n = reverseBits(123);

    cout << n;

    return 0;
}
