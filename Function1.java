import java.util.Scanner;
public class Function1{
    public static int add(int a,int b){
      return a+b;
    }
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no 1:- ");
     int a= sc.nextInt();
     System.out.println("Enter no 2:- ");
     int b=sc.nextInt();
     int sum=add(a,b);
     System.out.println("Addition of two numbers are:-"+sum);
  }
}