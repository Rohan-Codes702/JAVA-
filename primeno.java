package Logicjava;

import java.util.Scanner;
public class primeno {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int i,flag=1;
        System.out.println("Enter the number:");
        int n=sc.nextInt();

        for (i=1;i<n/2;i++)
        {
            if(n%i==0)
            {
                flag=0;
                break;
            }

        }
        if (flag==1)
        {
            System.out.println("NO is prime");
        }
        else
        {
            System.out.println("NO is not prime");
        }

    }
}
