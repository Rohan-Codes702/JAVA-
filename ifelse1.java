import java.util.Scanner;
public class ifelse1{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Age of person :");
   int age=sc.nextInt();
     if(age>18){
         System.out.println("Capable to Voting");
     }
     else
        {
            System.out.println("Not Capable to voting ");
        }

    }

}