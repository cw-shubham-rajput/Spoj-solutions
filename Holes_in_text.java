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
public class Holes_in_text
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count;
        while(n>0)
        {
            count =0;
            String input = sc.next();
            for(int i=0;i<input.length();i++)
            {
                char ch = input.charAt(i);
                if((ch=='A')||(ch=='D')||(ch=='O')||(ch=='P')||(ch=='Q')||(ch=='R'))
                    count++;
                else if(ch=='B')
                    count +=2;
            }
            System.out.println(count);
            n--;
        }
    }
}
