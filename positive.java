import java.util.Scanner;
public class positive {
 public static String positive(int a){
     if(a>0){
       return "Number is positive";
     }
     else if(a<0){
       return "number is negative";
     }
     else {
      return"Number is not zero";
     }
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in) ;
  System.out.println("Enter the number");
  int a= sc.nextInt();
  //int s=positive(a);
  System.out.println(positive(a));

 }

}
