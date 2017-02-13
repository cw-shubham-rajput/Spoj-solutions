#include<iostream>
using namespace std;

int main()
{
    int t;
    cin >> t;
    int n,x,y;
    while(t--)
    {
        cin >> n >> x >> y;
        for(int i=x;i<n;i++)
        {
            if(i%x==0 && i%y!=0)
                cout << i << " ";
        }
        cout << endl;
    }
    return 0;
}
