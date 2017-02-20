import java.util.Scanner;

public class What_next 
{
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        int a,b,c;
        while(true)
            {
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                if((a==0)&&(b==0)&&(c==0))
                    break;
                next_no(a,b,c);
            }
    }
    
    static void next_no(int a,int b,int c)
    {
        if((b-a)==(c-b))
        {
            System.out.print("AP ");
            System.out.println((c+(c-b)));
        }
        else if((b/a)==(c/b))
        {
            System.out.print("GP ");
            System.out.println((c*(c/b)));
        }
    }
}
