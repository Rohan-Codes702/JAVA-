package Array;
import java.util.Scanner;
public class userArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];

        System.out.println("Enter Array Elements:");

        for(int i=0;i<n;i++){
            for (int j = 0; j <n ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Array is");

        for(int i=0;i<n;i++){
            for (int j = 0; j <n ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
