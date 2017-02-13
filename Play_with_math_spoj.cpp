#include<iostream>
using namespace std;

long long gcd(long long a, long long b)
{
    if(a%b == 0)
        return b;
    else gcd(b,a%b);
}
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        long long a,b,c;
        cin >> a >> b;
        c = gcd(a,b);
        cout << b/c << " " << a/c << endl;
    }
    return 0;
}
