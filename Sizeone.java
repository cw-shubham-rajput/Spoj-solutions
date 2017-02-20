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

public class Sizeone 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int sum=0;
        while(t>0)
        {
            int no=sc.nextInt();
            if(no>0)
                sum+=no;
            t--;
        }
        System.out.println(sum);
    }
}
