import java.text.DecimalFormat;
import java.util.Scanner;

class ATM 
{ 
    public static void main(String args[])
    {
        float j, bal=0;
        int i;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        j = sc.nextFloat();
        bal = j;
        String strDouble = null;
        if(((i>0)&&(i<=2000))&&((j>=0)&&(j<=2000))&&((i<(j-0.5))&&(i%5==0)))
            {
                bal = j - i;
                bal = (float) (bal - 0.5);
                strDouble = String.format("%.2f", bal);
                System.out.println(strDouble);
            }        
            else 
            {
                strDouble = String.format("%.2f", j);
                System.out.println(strDouble);
            }
    }
}
