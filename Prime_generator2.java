import static java.lang.Math.sqrt;
import java.util.Scanner;

class Prime_generator2
{
    static int numbers[] = new int[3500],len=0;
        
    public static void main(String args[])
    {
        int t,fno, sno;
        generate();
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0)
        {
            fno = sc.nextInt();
            sno = sc.nextInt();
            if (fno == 1)
            {
                fno++;
            }
            while (fno <= sno)
            {
                if (process(fno))
                {
                    System.out.println(fno);
                }
                fno++;
            }
            System.out.println();
        }
    }

    static boolean prime(int x)
    {
        int i, last = (int) sqrt(x);
        for (i = 2; i <= last; i++)
        {
            if ((x % i) == 0)
            {
                return false;
            }
        }
        return true;
    }

    static void generate()
    {
        for (int i = 2; i < 32000 && len < 3500; i++)
        {
            if (prime(i))
            {
                numbers[len] = i;
                len++;
            }
        }
    }

    static boolean process(int x)
    {
        int i, last = (int)sqrt(x);
        for (i = 0; i < len && numbers[i] <= last; i++)
        {
            if ((x % numbers[i]) == 0)
                return false;
        }
        return true;
    }
}
