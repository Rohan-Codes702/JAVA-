import java.util.Scanner;
public class inset {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[50];
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        System.out.println("Enter the array element");
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("Enterd element:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Enter the position of array insertion:");
        int pos= sc.nextInt();
        System.out.println("Enter no which you want to inset");
        int num= sc.nextInt();
        for(int i=n;i>pos-1;i--)
        {
            a[i]=a[i-1];
        }
        a[pos-1]=num;
        System.out.println("Inserted array element are:");
        for(int i=0;i<=n;i++)
        {
            System.out.println(a[i]);
        }

    }
}
