#include<iostream>
using namespace std;

int main()
{
    int t;
    cin >> t;
    int i,j,ng,nm,m1,m2;
    for(i=0;i<t;i++)
    {
        cin >> ng;
        cin >> nm;
        int g[ng];
        int m[nm];
        for(j=0;j<ng;j++)
        {
            cin >> g[j];
        }
        for(j=0;j<nm;j++)
        {
            cin >> m[j];
        }
        m1=g[0];
        m2=m[0];
        for(j=1;j<ng;j++)
        {
            if(m1<g[j])
            m1=g[j];
        }
        for(j=1;j<nm;j++)
        {
            if(m2<m[j])
            m2=m[j];
        }
        if(m1>=m2)
        cout << "Godzilla" << endl;
        else if(m1<m2)
                cout << "MechaGodzilla" << endl;
            else
                cout << "uncertain" << endl;
    }
    return 0;
}
