
import java.util.Scanner;

class Enormous_Input {
    
    public static void main(String args[])
    {
        long k, t;
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextLong();
        for(int i=0; i<n; i++)
        {
            t = sc.nextLong();
            count += Is_Divisible(t,k);
        }
        System.out.println(count);
    }
    
    static int Is_Divisible(long t, long k)
    {
        int count = 0;
        if(t%k==0)
            count++;
        return count;
    }
    
}
