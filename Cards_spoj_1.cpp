#include<iostream>
using namespace std;

int main()
{
    int t;
    long long n;
    cin >> t;
    while (t--)
    {
        cin >> n;
        cout << (n*(3*n+1)/2)%1000007 << endl;
    }
    return 0;
}
