import java.util.Scanner;
public class linear {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int [50];
        int i,n,no,flag=0;
        System.out.println("Enter array size:");
         n= sc.nextInt();
         System.out.println("Enter the arary element");
         for(i=0;i<n;i++)
         {
             a[i]= sc.nextInt();
         }
         System.out.println("Enter no which you want to search:");
         no= sc.nextInt();
         for(i=0;i<n;i++)
         {
             if(a[i]==no)
             {
                 System.out.println("Number is present  ");
                 flag=1;
                 break;
             }
         }
         if(flag==0)
         {
             System.out.println("Number is not present");
         }

    }


}
