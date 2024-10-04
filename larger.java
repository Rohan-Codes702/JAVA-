/*import java.util.Scanner;
public class larger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arry size");
        int n= sc.nextInt();
        int []a=new int [10];
        int i;
        int large=a[0];
        System.out.println("Enter the aray element:");
        for(i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("enterred array elemnet:");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
       for (i=1;i<n;i++)
       {
           if(large<a[i])
           {
               large=a[i];
           }
       }
        System.out.println("large element are"+large);

    }
}*/

import java.util.Scanner;
public class larger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arry size");
        int n= sc.nextInt();
        int []a=new int [10];
        int i;
        int small=a[0];
        System.out.println("Enter the aray element:");
        for(i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("enterred array elemnet:");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        for (i=1;i<n;i++)
        {
            if(small>a[i])
            {
                small=a[i];
            }
        }
        System.out.println("small element are"+small);

    }
}