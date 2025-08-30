package Array;

import java.util.Scanner;

public class SumOfArray {
    public static void sum(int arr[][],int n){
        int s=0;
    for(int i=0;i<n;i++){
        for (int j=0;j<n;j++){
            s=s+arr[i][j];
        }
        System.out.println("Sum of array is:"+s);
    }
    }
    public static void dispaly(int arr[][],int n){
        System.out.println("Array is");

        for(int i=0;i<n;i++){
            for (int j = 0; j <n ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
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
                dispaly(arr,n);
                sum(arr,n);
                dispaly(arr,n);



    }
        }
