package BasicJava.java;
import java.util.Scanner;
public class NeonNumber {
    public static void neonno(int no)
    {
        int sq=no*no;
        int sum=0;
        while (sq>0)
        {
            int rem=sq%10;
            sum=sum+rem;
            sq=sq/10;
        }
        if (sum==no)
        {
            System.out.println("Number is Neon Number");
        }
        else
        {
            System.out.println("Number is Not Neon Number");

        }
    }

    public static void main(String[] args)
    {
           Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
           int no=sc.nextInt();

           neonno(no);

    }
}
