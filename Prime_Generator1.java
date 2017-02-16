import java.util.Scanner;

public class Prime_Generator1 
{
    static int Array_limit = (int) Math.sqrt(1000000000);
    static int number[] = new int[Array_limit],Array_size;
    
    public static void main(String args[])
    {
        int a,b,n;
        Scanner sc = new Scanner(System.in);
        Array_create();
        n = sc.nextInt();
        while(n>0)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            if(a==1)
                a++;
            for( ; a<=b ; a++)                
            {
                if(IsPrime(a))
                    System.out.println(a);
            }
            System.out.println();
            n--;
        }
    }
    
    static void Array_create()
    {
        int len = 2;
        for(int i=0; len<=Array_limit; len++)
        {
            if(Prime(len))
            {
                number[i] = len;
                i++;
                Array_size = i;
            }            
        }
    }
    
    static boolean Prime(int x)
    {
        int k = 2;
        while(k<=Math.sqrt(x))
        {
            if(x%k==0)
                return false;
            k++;
        }
        return true;
    }
    
    static boolean IsPrime(int x)
    {
        int last = (int) Math.sqrt(x);
        for(int i=0;i<Array_size && number[i]<=last;i++)
        {
            if(x%number[i]==0)
                return false;
        }
        return true;
    }
}
