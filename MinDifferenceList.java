package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinDifferenceList {
    public static List<Integer> result(int arr[]) {
            int n = arr.length;
            List<Integer> list = new ArrayList<>();
            Arrays.sort(arr);

            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n - 1; i++) {
                int diff = arr[i + 1] - arr[i];

                if (diff < min) {
                    min = diff;
                    list.clear();
                }

                if (diff == min) {
                    list.add(arr[i]);
                    list.add(arr[i + 1]);
                }
            }
            return list;
        }
    public static void main(String[] args) {
        int arr[]={2,4,3,1,5};

        System.out.println(result(arr));
    }
}
