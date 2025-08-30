package Array;

public class AverageOfEvenNumber {
    public static void main(String[] args) {

        int []nums={2,4,5,6,7};
        int n=nums.length;
        int ans=0;
        int count=0;
        for (int i=0;i<n;i++){
            if(nums[i]%2==0){
                ans=ans+nums[i];
                count++;
            }
        }
        int result=ans/count;

        System.out.println("Avearge of Even numbers are :"+result);

    }
}
