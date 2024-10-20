package BasicJava.java;
import java.util.Scanner;
public class AmstrongNumber {
    public static void  main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number :");
        int number=sc.nextInt();

        int num=number;
        int sum=0;
        while (number!=0)
        {
            int rem=number%10;
             sum+=rem*rem*rem;
            number/=10;

        }
        if (num==sum)
        {
            System.out.println("Number is Armstrong");
        }
        else
        {
            System.out.println("Number is Not Armstrong");
        }
    }
}
