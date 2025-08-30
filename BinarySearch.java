package Array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {8, 8, 7, 6, 5, 4, 3, 2};
        Arrays.sort(arr);
        int s = 0;
        int e = arr.length - 1;
        int mid = (s + e) / 2;
        int num = 3;
        while (s <= e) {
            if (arr[mid] == num) {
                System.out.println(mid);


            if(arr[mid]<num) {
                s = mid + 1;
            }
            } else if (arr[mid]>num) {
                e=mid-1;


            }
        }
    }
}
