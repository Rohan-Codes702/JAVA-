package BasicJava.java;
import java.util.Scanner;
public class SwapTwoNumber {

    public static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;

        System.out.println("After swapping of two numbers ");
        System.out.println("number  a is: "+a+"\n number b is: "+b);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number a:");
        int a=sc.nextInt();
        System.out.println("Enter number b:");
        int b=sc.nextInt();

        swap(a,b);
    }
}
