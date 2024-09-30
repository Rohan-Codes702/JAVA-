import java.util.Scanner;
public class usr{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,beg,end,mid,flag=0,no;
        System.out.println("Enter the size of arry:");
        n= sc.nextInt();
        int []a=new int[50];
        System.out.println("Enter the array element:");
        for(i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("Enter the number which you want search:");
        no= sc.nextInt();
        beg=0;
        end=n-1;
        while(end>=beg)
        {
            mid=(end+beg)/2;
            if(no==a[mid])
            {
                System.out.println("No is present");
                flag=1;
                break;
            }
            else if(no>a[mid])
            {
                beg=mid+1;
            }
            else
            {
                end=mid-1;
            }
            }
        if(flag==0)
        {
            System.out.println("No is not present");
        }

        }
    }
