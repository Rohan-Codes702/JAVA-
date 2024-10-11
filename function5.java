import java.util.Scanner;
public class function5 {
public static double circumference(int r){
   double pi=3.142;
    return (2*pi*r);
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Radius of circle :=");
int r=sc.nextInt();
double cir=circumference(r);
System.out.println("circumference Of Circle are:="+cir);

}
}
