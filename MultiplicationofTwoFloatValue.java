package BasicJava.java;
import java.util.Scanner;
public class MultiplicationofTwoFloatValue {
    public static float  multiplication(float a,float b)
    {
        return a*b ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number a:");
        float a=sc.nextFloat();
        System.out.println("Enter number b:");
        float b=sc.nextFloat();
        System.out.println("MultiPlication of Two Number is :"+multiplication(a,b));
    }
}
