package BasicJava.java;
import java.util.Scanner;
public class LeapYear {
    public static void year(int year)
    {
        if ((year%4==0 && year%100!=0)|| year%400==0)
        {
            System.out.println("Year is leap year");
        }
        else
        {
            System.out.println("Not leap year");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year to check year is leap or not");
        int year=sc.nextInt();
        year(year);
    }
}
