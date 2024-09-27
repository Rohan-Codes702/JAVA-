import java.util.Scanner;
public class While3{
public static void main(String[] args){
    System.out.println("Enter the number:-");
    Scanner sc=new Scanner(System.in);
 int i=0;
  int j= sc.nextInt();
 System.out.println("Even numbers are:");
 while (i<=j){
  if(i%2==0){
   System.out.println(i);

  }
   i++;

 }
}
}
