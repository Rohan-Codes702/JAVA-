package Array;

import java.util.Arrays;

public class SubArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6, 7, 8};
        int start = 0;
        int length = 3;

        int[] sub = new int[length];
        System.arraycopy(arr, start, sub, 0, length);

        System.out.println(sub);
    }
}
