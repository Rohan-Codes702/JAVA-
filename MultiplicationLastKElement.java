package ArrayList;

import java.util.ArrayList;

public class MultiplicationLastKElement {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9};
        int n=nums.length;
        ArrayList<Integer>list=new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(nums[i]);
        }

        int k=2;
        int muti=1;
        for(int i=n-1;i>=n-k;i--){
            muti=muti*list.get(i);
        }
        System.out.println(muti);
    }
}
