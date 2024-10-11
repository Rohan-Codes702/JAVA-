import java.util.Scanner;
public class Function6 {
public static void age(int a) {
    if (a > 18) {
        System.out.println("Eligible to Voteing");
    } else {
        System.out.println("not Eligible to voteing");
    }

}
public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Age of person");
    int a= sc.nextInt();
    age(a);

}
}
