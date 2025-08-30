package Array;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int nums[]={8,2,4,6,4,1,5,6,9,4,32,1};
        Arrays.sort(nums);
        int n=nums.length;
        System.out.println(nums[n-1]);

    }
}
