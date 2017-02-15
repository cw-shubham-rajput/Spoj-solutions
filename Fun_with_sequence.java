/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shubham
 */

import java.util.Scanner;

public class Fun_with_sequence 
{
    public static void main(String[] args)throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int b[] = new int[m];
        for(int i=0;i<m;i++)
        {
            b[i] = sc.nextInt();
        }
        boolean flag;
        for(int i=0;i<n;i++)
        {
            flag = false;
            for(int j=0;j<m;j++)
            {
                if(a[i]==b[j])
                {
                    flag=true;
                    break;
                }
                if(flag==true)
                    break;
            }
            if(flag==false)
                System.out.print(a[i]+" ");
        }
    }
}
