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

public class Kamil 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count=0,t=0;
        while(true)
        {
            String input=sc.next();
            for(int i=0;i<input.length();i++)
            {
                if((input.charAt(i)=='T')||(input.charAt(i)=='D'))
                    count++;
                if((input.charAt(i)=='L')||(input.charAt(i)=='F'))
                    count+=2;
            }
            System.out.println(count);
            if(++t==10)
                break;
        }
    }
}