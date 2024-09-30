import java.util.Scanner;
public class userarry {
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter no of rows:");
 int rows= sc.nextInt();
 System.out.println("Enter the no of columns:");
 int column=sc.nextInt();
 int [][]a=new int[rows][column];
 int i,j;
 for(i=0;i<=rows;i++)
 {
  for (j=0;j<=column;j++)
  {
      a[i][j]=sc.nextInt();
  }
 }
  System.out.println("Entered array element:");
 for(i=0;i<rows;i++)
 {
   for(j=0;j<column;j++)
     {
      System.out.print(a[i][j] +" ");


     }
   System.out.println();
 }
}

}
