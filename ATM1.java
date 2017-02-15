blocksimport java.util.Scanner;

class ATM1
{
    public static void main(String args[])
    {
        float j;
        int i;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        j = sc.nextFloat();
        String strDouble = null;

        if(i%5!=0)
        {
            strDouble = String.format("%.2f", j);
            System.out.println(strDouble);
            return;
        }

        if(i<=0||i>2000)
        {
            strDouble = String.format("%.2f", j);
            System.out.println(strDouble);
            return;
        }

        if(j<0||j>2000)
        {
            strDouble = String.format("%.2f", j);
            System.out.println(strDouble);
            return;
        }

        if(j>=0&&j<=0.5)
        {
            strDouble = String.format("%.2f", j);
            System.out.println(strDouble);
            return;
        }


        if(j>0.5)
        {
            if (i>=(j-0.5))
            {
                strDouble = String.format("%.2f", j);
                System.out.println(strDouble);
                return;
            }
            if (i<(j-0.5))
            {
                strDouble = String.format("%.2f", j-i-0.5);
                System.out.println(strDouble);
                return;
            }
}
    }
}
