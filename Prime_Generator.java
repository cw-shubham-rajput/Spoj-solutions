//import java.lang.Math.*;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Prime_Generator {

    public static void main(String args[])
    {
        int a,b,n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            if((a>=1)&&(b>=a)&&(b<=1000000000)&&((b-a)<=100000))
                Prime(a,b);
            n--;
        }
    }
    
    static void Prime(int a, int b)
    {
        for(int i=a; i<=b; i++)
        {
            int k=2;
            boolean flag = true;
            if(i==1)
                i++;
            while(k<=sqrt(i))
            {
                if(i%k==0)
                    flag=false;
                k++;
            }
            if(flag)
                System.out.println(i);
        }
        System.out.println();
    }
}
