import java.util.Scanner;
public class linearsrch {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int a[]=new int[50];
        int i,flag=0;
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        System.out.println("Enet the array elemenet");
        for(i=0;i<n;i++)
        {

            a[i]= sc.nextInt();
        }
        System.out.println("enter the number which you want search");
        int no= sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==no)
            {
                System.out.println("Number is present");
                 flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("no is not preasent");
        }
    }
}
