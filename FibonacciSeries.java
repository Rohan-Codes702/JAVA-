package BasicJava.java;

import java.util.Scanner;

public class FibonacciSeries {
    public static void fibo(int num)
    {
        int n1=0,n2=1;
        for (int i=0;i<=num;i++)
        {
            System.out.println(n1+" ");
            int n3=n1+n2;
            n1=n2;
            n2=n3;

        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
      fibo(num);

    }
}
