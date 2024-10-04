import java.util.Scanner;
class operations{
    int n1;
    int n2;

    public int sum()
    {
        return n1+n2;
    }
    public int sub()
    {
        return n1-n2;
    }
    public int multi()
    {
        return n1*n2;
    }
    public int div()
    {
        return n1/n2;
    }
}

public class oprclass3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        operations or=new operations();
        System.out.println("Enter number n1:=");
        or.n1= sc.nextInt();
        System.out.println("Enter number n2:=");
         or.n2= sc.nextInt();
        System.out.println("Sum of number is:="+or.sum());
        System.out.println("Substraction of number is:="+or.sub());
        System.out.println("Multiplicaion of number is:="+or.multi());
        System.out.println("Division  of number is:="+or.div());
    }
}
