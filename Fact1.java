import java.math.*;
import java.io.*;
            
/*               
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */         
            
/**         
 *          
 * @author Shubham
 */         
  
class Fact1
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t=Integer.parseInt(br.readLine());
        BigInteger no;
        while(t>0)
        {
            int n;
            n=Integer.parseInt(br.readLine());
            no=new BigInteger("1");
            for(int i=2;i<=n;i++)
            no=no.multiply(new BigInteger(""+i));
            System.out.println(no);
            t--;
        }
    }
}