package BasicJava.java;
import java.util.Scanner;
public class pallindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number :");
        int n=sc.nextInt();

        int sum=0;
        int temp=n;

        while (n>0)
        {
            int r=n%10;
            n= n/10;
            sum=(sum*10)+r;
        }
        if (temp==sum)
        {
            System.out.println("Number is pallindrome");
        }
        else
        {
            System.out.println("Number is Not pallindrome");
        }

    }
}
