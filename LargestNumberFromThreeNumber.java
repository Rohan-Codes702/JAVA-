package BasicJava.java;
import java.util.Scanner;
public class LargestNumberFromThreeNumber {
    public static void large(int a,int b,int c)
    {
        if (a>c)
        {
            if (a>b)
            {
                System.out.println("Number a is greater");
            }
            else
            {
                System.out.println("Number b is greater");
            }
        }
        else
        {
            if(c>a)
            {
                if (c>b)
                {
                    System.out.println("Number c is greater");
                }
                else
                {
                    System.out.println("Number b is greater");
                }
            }
        }

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number a:");
        int a=sc.nextInt();

        System.out.println("Enter number b:");
        int b=sc.nextInt();

        System.out.println("Enter number c:");
        int c=sc.nextInt();

       large(a,b,c);
    }
}
