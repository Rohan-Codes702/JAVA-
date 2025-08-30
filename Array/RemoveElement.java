package Array;

public class RemoveElement {
    public static void main(String[] args) {
        int nums[]={3,1,2,3};
        int k=3;
        int result[]=new int[nums.length];
        int indx=0;
        for(int i=0;i< nums.length;i++){
            if (nums[i]!=k){
                result[indx]=nums[i];
                indx++;
            }
        }

        for (int i=0;i<indx;i++){
            System.out.println(result[i]);
        }
    }
}
