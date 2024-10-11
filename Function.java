import java.util.Scanner;
public class Function {
public static int average(int a,int b,int c){
  int avg=(a+b+c)/3;
  return avg;
}

public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter no 1:-");
 int a=sc.nextInt();
 System.out.println("Enter no 2:-");
 int b=sc.nextInt();
 System.out.println("Enter no 3:-");
 int c=sc.nextInt();

 int av=average(a,b,c);
 System.out.println("Average of three no are :-"+av);

}
}
