#include<iostream>
#include<cstdio>
using namespace std;

int main()
{
    long long N;
    while(scanf("%lld",&N)!=EOF)
    {
        if((N&(N-1))==0)// check whether it is a power of 2
        printf("TAK\n");
        else
        printf("NIE\n");
    }
    return(0);
}
