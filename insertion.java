import java.util.Scanner;
public class insertion {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[50];
        int n,i;
        System.out.println("Enter the size of array:");
        n= sc.nextInt();
        System.out.println("Enter the array element:");
        for(i=0;i<n;i++)
        {
           a[i]= sc.nextInt();
        }
        System.out.println("Array element insertion:");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Enter the position of element:");
        int pos= sc.nextInt();
        System.out.println("Enter value which you want to insert");
        int num= sc.nextInt();
        for (i=n;i>pos-1;i--)
        {
            a[i]=a[i-1];
        }
        System.out.println("Enter element after insertion:");
        for (i=0;i<=n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
