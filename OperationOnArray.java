package Array;

public class OperationOnArray {
    public static void main(String[] args) {
        int []nums={1,2,2,1,1,0};
        int n=nums.length;
        int result[]=new int[n];

        for (int i=0;i<n-1;i++){
            if (nums[i]==nums[i+1]){
                nums[i]=2 * nums[i];
                nums[i+1]=0;
            }
        }
        int idx=0;
        for (int i=0;i<n;i++){
            if (nums[i]!=0)
            result[idx++]=nums[i];

        }
       for (int i:result){
           System.out.print(i);
       }
    }
}
