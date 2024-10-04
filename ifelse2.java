import java.util.Scanner;
public class ifelse2 {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter AGe of Person:");
int age= sc.nextInt();
if(age>18){
    System.out.println("Capable to VOTING");
}
else{
   System.out.println("Not Capable to voting");

}
}
}
