import java.util.Scanner;

public class Feynman_Square 
{
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            n = sc.nextInt();
            if(n==0)
                break;
            Square_calculate(n);
        }
    }
    
    static void Square_calculate(int n)
    {
        int no=0;
        for(int i=n;i>0;i--)
        {
            no += i * i;
        }
        System.out.println(no);
    }
}
