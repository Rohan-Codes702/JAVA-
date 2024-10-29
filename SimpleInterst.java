package BasicJava.java;
import java.util.Scanner;
public class SimpleInterst {
    public static void interst(int p,int r,int t)
    {
        int result=(p*r*t)/100;
        System.out.println("Simple Interst Is :"+result);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle amount:");
        int p=sc.nextInt();
        System.out.println("Enter the Rate:");
        int r=sc.nextInt();
        System.out.println("Enter the Time:");
        int t=sc.nextInt();

          interst(p,r,t);
    }
}
