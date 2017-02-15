import java.util.Scanner;

public class Adding_Reversed_Numbers {

    public static void main(String args[])
    {
        int a,b,c,d,n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            c = Reversed(a);
            d = Reversed(b);
            Test(c,d);
            n--;
        }
    }
    
    static void Test(int a, int b)
    {
        int d = Reversed(a + b);
        System.out.println(d);
    }
    
    static int Reversed(int c)
    {
        int temp,k=0;
        while(c>0)
        {
            temp = c % 10;
            c /= 10;
            k = k * 10 + temp;
        }
        return k;
    }
}
