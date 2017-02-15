package Spoj;

import java.util.Scanner;

class Hangover 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			float in = sc.nextFloat();
			if(in == 0.00)
				break;
			int no = 0, i = 2;
			float sum = 0;
			while(true)
			{
				sum += (float)1/i;
				i += 1;
				no++;
				if(sum >= in)
				{
					System.out.println(no +" " +"card(s)");
					break;
				}		
			}
		}
		sc.close();
	}
}
