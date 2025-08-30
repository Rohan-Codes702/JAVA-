package Array;

public class ReverseArray {
    public static int[] answer(int[] arr, int n)
    {        int []result=new int[n];

        for(int i=n-1;i>0;i--){
            result[n-1-i]=arr[i];
        }
        return result;
    }
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        int n=arr.length;

        int reversed[]=answer(arr,n);

        for (int rev:reversed){
            System.out.println(rev);
        }


    }
}
