/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spoj;

import java.util.Scanner;

/**
 *
 * @author Shubham
 */

public class Last_digit1 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = digit(a,b);
         System.out.println(c);
         t--;
        }
    }
    
    static int digit(int a, int b)
    {
        if(b==0)
            return 1;
        int da = a % 10; 
        if(da==0)
            return 0;
        if(da==5)
            return 5;
        switch(b%4)
        {
            case 0: return da%2!=0?1:6;
            case 1: return da;
            case 2: return da*da%10;
            default: return da*da*da%10;
        }
    }
}
