package BasicJava.java;
import java.util.Scanner;
public class GCDOfNumber {
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }

        return  gcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a:");
        int a=sc.nextInt();

        System.out.println("Enter b:");
        int b=sc.nextInt();

        System.out.println("gcd of two number : "+gcd(a,b));
    }
}
