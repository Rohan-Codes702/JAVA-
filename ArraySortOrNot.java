package Array;

import java.util.Arrays;

public class ArraySortOrNot {
    public static void main(String[] args) {

        int []arr={1,2,6,4,5};
        int []res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=arr[i];
        }
        Arrays.sort(res);

       if (Arrays.equals(arr,res)){
           System.out.println(true);
       }
       else {
           System.out.println(false);
       }
    }
}
