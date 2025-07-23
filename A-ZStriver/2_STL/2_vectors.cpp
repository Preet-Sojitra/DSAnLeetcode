#include <bits/stdc++.h>
using namespace std;

void explain_vector()
{
    // vector is dynamic in nature
    vector<int> v; // creates empty container

    v.push_back(1);    // inserts 1
    v.emplace_back(2); // inserts 2 at back
    // emplace_back and push_back are similar but emplace_back is faster

    vector<pair<int, int>> vec;
    vec.push_back({1, 2});  // for push_back need to use {}
    vec.emplace_back(1, 2); // here no need to use {}

    vector<int> v(5, 100); // vector containing 5 100s is created

    vector<int> v(5); // size 5

    vector<int> v1(5, 20);
    vector<int> v2(v1); // copies v1 into v2

    // accessing elements in vector
    cout << v[0];

    // other way: iterator
    vector<int>::iterator it = v.begin(); // this points to the memory
    it++;
    cout << *(it) << " "; // dereferencing;

    vector<int>::iterator it = v.end(); // end will not point to end, but to the memory after the last ele, so to access the last ele, we need to to it--

    cout << v.back() << " "; // prints the last ele of vector

    // printing vector
    for (vector<int>::iterator it = v.begin(); it != v.end(); it++)
    {
        cout << *(it) << " ";
    }

    // shortcut for above
    for (auto it = v.begin(); it < v.end(); it++)
    {
        cout << *(it) << " ";
    }

    // for each
    for (auto it : v)
    {
        cout << it << " ";
    }

    // deletion
    v.erase(v.begin() + 1); // we give either address or "start, end"

    v.erase(v.begin() + 2, v.end() + 4); // start, end.. end is the after

    // insert
    vector<int> v(2, 100); // 2 100 values
    v.insert(v.begin(), 300);
    v.insert(v.begin() + 1, 2, 10); // insert 2 10 values

    vector<int> copy(2, 50);
    v.insert(v.begin(), copy.begin(), copy.end());

    cout << v.size();

    v.pop_back(); // pops last element

    v1.swap(v2); // swaps 2 vectors

    v.clear(); // earases everything
}

void explain_list()
{
    list<int> ls;

    ls.push_back(2);
    ls.emplace_back(4);

    ls.push_front(5); // very cheap in computation
    ls.emplace_front();

    // rest functions same as vector
}

void explainDequeue()
{
    // push back, push front, pop back, pop front, back, front

    // rest same as vectors
}