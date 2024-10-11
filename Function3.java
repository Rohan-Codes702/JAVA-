import java.util.Scanner;
public class Function3 {
    public static void main(String[] args)
    {
        double pi=3.14;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Radius of circle");
        int r=sc.nextInt();
        double circumference=2*pi*r;
        System.out.println("Circumference of circle is;=" +circumference);
    }
}
