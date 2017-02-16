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

public class Last_digit2 
{
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        int t = c.nextInt();
        while(t>0)
        {
            System.out.println(f(c.nextInt(),c.nextInt()));
            t--;
        }
    }

    static int f(int a, int b) 
    {
        if(b==0)return 1;
        int da = a % 10;
        if(da==0)return 0;
        if(da==5)return 5;
        switch(b%4){
        case 0:
            return da%2!=0?1:6;
        case 1:
            return da;
        case 2:
            return da*da%10;
        default:
            return da*da*da%10;
    }
  }
}