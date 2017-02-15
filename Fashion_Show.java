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
            
public class Fashion_Show 
{           
    public static void main(String args[])
    {       
        int t,n,temp;
            
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
            
        for(int i=0;i<t;i++)
        {   
            int sum = 0;
            n = sc.nextInt();
            int m[] = new int[n];
            int w[] = new int[n];
            
            for(int j=0;j<n;j++)
            {
                m[j] = sc.nextInt();
            }
            
            for(int j=0;j<n;j++)
            {
                w[j] = sc.nextInt();
            }
            
            for(int j=0;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(m[j]>m[k])
                    {
                        temp = m[j];
                        m[j] = m[k];
                        m[k] = temp;
                    }
                }
            }
            
            for(int j=0;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(w[j]>w[k])
                    {
                        temp = w[j];
                        w[j] = w[k];
                        w[k] = temp;
                    }
                }
            }
            
            for(int j=0;j<n;j++)
            {
                sum += m[j] * w[j];
            }
            
             System.out.println(sum);
        }   
    }       
}           