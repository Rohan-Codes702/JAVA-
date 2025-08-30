package Array;

public class ReplaceElement {
    public static void main(String[] args) {
        /*arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]*/

        int arr[]={400};
        int n=arr.length;
        int []result=new int[n];
        for (int i=0;i<n-1;i++){
            int larg=arr[i+1];

            for (int j=i+1;j<n-1;j++){
                larg=Math.max(larg,arr[j]);
            }
            result[i]=larg;

        }
        result[n-1]=-1;

        for (int i:result){
            System.out.print(i);
        }

    }
}
