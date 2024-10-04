import java.util.Scanner;
public class traverse2d {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows= sc.nextInt();
        System.out.println("Enter the number colums:");
        int colmns= sc.nextInt();
        int [][]a=new int [rows][colmns];
        int i,j;
        for(i=0;i<rows;i++)
        {
            for(j=0;j<colmns;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("Entered array element");
        for(i =0;i<rows;i++)
        {
         for(j=0;j<colmns;j++)
         {
             System.out.print(a[i][j]+" ");
         }
         System.out.println();
        }
    }

}
