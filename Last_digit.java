/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spoj;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Shubham
 */ 

public class Last_digit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            BigInteger a = sc.nextBigInteger();
            int b = sc.nextInt();
            BigInteger ans = a.pow(b);
            String str = ans.toString();
            System.out.println(str.charAt(str.length()-1));
            t--;
        }
    }
}
