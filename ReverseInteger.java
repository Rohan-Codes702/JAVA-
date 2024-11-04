package BasicJava.java;
import java.util.Scanner;
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Integer Value:");
        int x=sc.nextInt();
        int sum=0;
        while (x!=0)
        {
           int rem=x%10;
           int result= sum*10 +rem;
           sum=result;
           x=x/10;

        }
        System.out.println("Reverse Number will be:"+sum);

    }
}
