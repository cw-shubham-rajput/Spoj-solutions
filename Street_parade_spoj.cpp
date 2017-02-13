#include<iostream>
using namespace std;

void arr_fill(int car);
void arr_chk();
int arr[1000],j=1,temp=0,n;

int main()
{
    int i,car;
    cin >> n;
    do
    {
        for(i=0;i<n;i++)
        {
            cin >> car;
            arr_fill(car);
        }
        if(j-1 == n)
            cout << "yes" << endl;
        else
            while(temp != -1)
            {
                arr_chk();
            }
        if(j == n+1)
            cout << "yes" << endl;
        else cout << "no" << endl;
        cin >> n;
    }while(n!=0);
    return 0;
}

void arr_fill(int car)
{
    int i;
    if(car == j)
        {
            j++;
        }
    else
        for(i=0;i<1000;i++)
            {
                arr[i] = car;
                temp++;
            }
}

void arr_chk()
{
    if(arr[temp]==j)
    {
        if(temp != 0)
        {
            temp--;
        }
        j++;
    }
}
