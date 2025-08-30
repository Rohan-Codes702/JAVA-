package Array;

import java.util.HashMap;

public class ElementGrater {
    public static void main(String[] args) {

        int arr[]={1,2,2,6,6,6,6,7,10};
        int n=arr.length;

        HashMap<Integer,Integer>map=new HashMap<>();

        for (int i=0;i<n;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);

            }
            else{
                map.put(arr[i],1);
            }
        }
        int large=0;
        int res=0;
        for (int i:map.keySet()) {
           int freq=map.get(i);

           if (freq>large){
               large=freq;
               res=i;
           }
        }
        System.out.println(res);

    }
}
