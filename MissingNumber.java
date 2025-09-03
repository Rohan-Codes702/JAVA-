package ArrayList;

import java.util.ArrayList;

public class MissingNumber {
    public static void main(String[] args) {

        int arr[]={3,2,0};
        int n=arr.length;

        ArrayList<Integer>list=new ArrayList<>();

        for(int num:arr){
            list.add(num);
        }

        for (int i=0;i<=n;i++){
            if(!list.contains(i)){
                System.out.println(i);
            }
        }
    }
}
