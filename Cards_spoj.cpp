#include<iostream>
using namespace std;

int main()
{
    int t,i,j,level;
    long sum = 0;
    cin >> t;
    for(i=0;i<t;i++)
    {
        cin >> level;
        for(j=1;j<=level;j++)
        {
            sum+= (2*j) + (j-1);
        }
        cout << sum << endl;
        sum = 0;
    }
    return 0;
}
