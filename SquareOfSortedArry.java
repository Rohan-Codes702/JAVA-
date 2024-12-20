package BasicJava.java;

import java.util.Arrays;

public class SquareOfSortedArry {
    public static void main(String[] args) {
        int []arr={-4,-1,0,3,10};
        int i;
        int n=arr.length;
        int [] square=new int[n];

        for (i=0;i<n;i++)
        {
            square[i]=arr[i]*arr[i];
        }

        Arrays.sort(square);
        System.out.println(Arrays.toString(square));
    }
}
