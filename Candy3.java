import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shubham
 */

public class Candy3 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
            long t=sc.nextLong();
            for(int i=0;i<t;i++)
            {
                    long k=sc.nextLong();
                    long sum=0;
                    for(int j=0;j<k;j++)
                    {
                        long c=sc.nextLong();
                        sum=(sum+c)%k;
                    }
                    if(sum==0)
                        System.out.println("YES");
                    else System.out.println("NO");
            }
    }
}
