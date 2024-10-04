import java.util.Scanner;
public class Input{
public static void main(String[] args){
System.out.println("Taking input from user");
Scanner sc=new Scanner(System.in);
 System.out.println("Enter no 1:");
 int a=sc.nextInt();
 System.out.println("Enter no 2:");
 int b=sc.nextInt();
 int Sum=a+b;
 int Substraction=a-b;
 int multiplication=a*b;
 int division=a/b;
 System.out.println("Sum of two number:");
 System.out.println(Sum);
 System.out.println("Substraction of two number:");
 System.out.println(Substraction);
 System.out.println("multiplication of two number:");
 System.out.println(multiplication);
 System.out.println("Division of two number:");
 System.out.println(division);
}
}
