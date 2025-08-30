package Array;

import java.util.HashMap;

public class twoSum {
    public static int[]result(int []nums,int target){
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int number=target-nums[i];

            if(map.containsKey(number)){
                return new int[]{map.get(number),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int target = 9;
       int []Result=result(nums,target);

       if (Result.length==2){
           System.out.println(""+Result[0]+""+Result[1]);
       }


    }
}
