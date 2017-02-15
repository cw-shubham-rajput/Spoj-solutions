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

class Julka 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double apples,extra,klaudia = 0,nataliya = 0;
        for(int i=0;i<2;i++)
        {
            apples = sc.nextDouble();
            extra = sc.nextDouble();
            klaudia = (apples + extra) / 2;
            nataliya = (apples - extra) / 2;
            String klau = String.format("%f", klaudia).split("\\.")[0];
            String nata = String.format("%f", nataliya).split("\\.")[0];
            System.out.println(klau);
            System.out.println(nata);
        }
    }
}
