import java.util.Scanner;

public class Fact {

    public static void main(String args[])
    {
        double no,Fact = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        do
        {
            no = sc.nextDouble();
            Fact = Factorial(no);
            System.out.println(Fact);
            n--;
        }while(n>0);
    }
    
    static double Factorial(double no)
    {
        if(no==1)
            return 1;
        return no * Factorial(no-1);
    }
}
