
import static java.lang.Math.*;
import java.util.Scanner;

class Leading_Zeros {
    
    public static void main(String args[])
    {
        long i = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j=0; j<n; j++)
        {   
            i = sc.nextInt();
            Calculate_Zeroes(i);
        }
    }
    
    static void Calculate_Zeroes(long i)
    {
        int count = 0, j = 5, temp = 2;
        while(true)
        {
            count += i / j;
            j = (int) (pow(5,temp));
            temp++;
            if(j>i)
                break;         
        }
        System.out.println(count);
    }
    
}
