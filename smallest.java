
import java.util.Scanner;
public class smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the array element");
        int[]a = new int[10];
        int i;
        for (i = 0; i <= n; i++) {
            a[i] = sc.nextInt();
        }

     int small=a[0];
      for( i=1;i<n;i++)
      {
          if(small>a[i])
          {
              small=a[i];
          }
      }
      System.out.println("Smallest element from the given array is :="+small);
    }

    }
