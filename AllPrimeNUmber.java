package BasicJava.java;
import java.util.*;
public class AllPrimeNUmber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int i,j ,flag;

        for (i=2;i<=n;i++)
        {
            flag=0;

            for (j=1;j<=i;j++)
            {
                if (i%j==0)
                {
                   flag++;
                }
            }
            if (flag==2)

                System.out.println(i+" ");

        }
    }
}
