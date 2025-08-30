package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int []arr={5,4,21,1};
        int n=arr.length;
        Arrays.sort(arr);

        if (n<2){
            System.out.println(-1);
        }

        System.out.println(arr[n-2]);

    }
}
