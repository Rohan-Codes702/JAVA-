import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
       /* Scanner sc=new Scanner(System.in);
        int i,n;
        int []a=new int[50];
          System.out.println("Enter the array size :");
          n= sc.nextInt();
          System.out.println("Enter the array element:");
         for(i=0;i<n;i++)
         {
             a[i]= sc.nextInt();
         }
         System.out.println("Entered array element:");
         for (i=0;i<n;i++)
         {
             System.out.println(a[i]);
         }
         System.out.println("Enter position of element :");
         int pos= sc.nextInt();
         System.out.println("Enter the element which you want to inserted");
         int num= sc.nextInt();
         for (i=n;i>pos-1;i--)
         {
             a[i]=a[i-1];
         }
         a[pos-1]=num;
         System.out.println("After insertead the element:");
         for (i=0;i<=n;i++)
         {
             System.out.println(a[i]);
         }
    }
}       */
        /*
        Scanner sc = new Scanner(System.in);
        int[] a = new int[50];
        int i;
        System.out.println("Enter the arry size");
        int n = sc.nextInt();
        System.out.println("Enter the array element");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Entered array elements are");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Enter the position of array:");
        int pos = sc.nextInt();
        for (i = pos - 1; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        System.out.println("After Insreted element:");
        for (i = 0; i < n - 1; i++) {
            System.out.println(a[i]);
        }
    }
}*/
       /* Scanner sc = new Scanner(System.in);
        int a[] = new int[50];
        System.out.println("Enter the arry Size:");
        int n = sc.nextInt();
        int i, flag = 0;
        System.out.println("Enter the arry element:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Entered arrray elements are:");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Enter the element for search:");
        int num = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (a[i] == num) {
                System.out.println("NUmber was present");
                flag = 1;
                break;

            }
        }
        if (flag == 0) {
            System.out.println("number is not present");
        }
    }
}
*/
        /*
        Scanner sc = new Scanner(System.in);
        int a[] = new int[50];
        System.out.println("Enter the arry Size:");
        int n = sc.nextInt();
        int i, flag = 0,mid,end,beg;
        System.out.println("Enter the array element:");
        for (i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Entered arrray elements are:");
        for (i = 0; i < n; i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Enter the num which want to search:");
        int num= sc.nextInt();
        beg=0;
        end=n-1;
        while (end>=beg)
        {
          mid=(beg+end)/2;
          if (num==a[mid])
          {
              System.out.println("number is present");
              flag=1;
              break;
          }
          else if (num>a[mid])
          {
              end=mid+1;
          }
          else
          {
          beg=mid-1;
          }
        }
        if (flag==0)
        {
            System.out.println("Number is not present");
        }
        }
    }
    */
/*
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[50][50];
        int b[][] = new int[50][50];
        int c[][] = new int[50][50];
        int i, j;
        System.out.println("Enter array element of matrix 1:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter array element of matrix 2:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1 is :");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println("\n");
        }

        System.out.println("Matrix 2 is :");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println("\n");
        }
        for (i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]);
            }
            System.out.println("\n");
        }
    }
}
 */
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[50][50];
        int b[][] = new int[50][50];
        int result[][] = new int[50][50];

        int i, j,k,sum=0;
        System.out.println("Enter array element of matrix 1:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter array element of matrix 2:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1 is :");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println("\n");
        }

        System.out.println("Matrix 2 is :");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println("\n");
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                for(k=0;k<3;k++)
                {
                 sum=+a[i][k]*b[k][j];

                }
                result[i][j]=sum;
            }
             }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(" " +result[i][j]);
            }
            System.out.println("\n");
        }


    }

}