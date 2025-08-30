package Array;
import java.util.Arrays;
import java.util.Scanner;
public class SecondLargetEement {
    public static void dispay(int arr[],int n){
        System.out.println("Arrays elements are:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Size Of Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array Element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       dispay(arr,n);
        Arrays.sort(arr);
        dispay(arr,n);
        System.out.println("Second Largest Element in the arrays:"+arr[1]);

    }
}
