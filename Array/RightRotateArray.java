package Array;

public class RightRotateArray {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int k = 3;

        int res[]=new int[nums.length];

        for(int i=0;i< nums.length;i++){
           res[(i+k)% nums.length]=nums[i];
        }
        for (int i:res){
            System.out.println(i);
        }
    }
}
