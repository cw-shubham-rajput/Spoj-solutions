
import java.util.Scanner;

public class Number_steps {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        while(n>0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            Number(x,y);
            n--;
        }
    }
    
    static void Number(int a,int b)
    {
        if((a==b)&&(a%2==0))
        {
            System.out.println((a+b));
            return;
        }
        else if(a==b)
        {
            System.out.println((a+b-1));
            return;
        }
        else if((a%2==0)&&(b+2==a))
        {
            System.out.println((a+b));
            return;
        }
        else if((a%2==1)&&(b+2==a))
        {
            System.out.println((a+b-1));
            return;
        }
        else 
        {
            System.out.println("No Number");
            return;
        }
    }
}
