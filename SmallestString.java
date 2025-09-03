package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;

public class SmallestString {
    public static Object[] result(String[] list1, String[] list2){
        int n=list1.length;
        int m=list2.length;

        HashMap<String,Integer>map=new HashMap<>();

        for (int i=0;i<n;i++){
            map.put(list1[i], i);
        }

        ArrayList<String>list=new ArrayList<>();
        int min=Integer.MAX_VALUE;

        for (int i=0;i<m;i++){
            if (map.containsKey(list2[i])){
                int count=i+map.get(list2);

                if (count<min){
                    min=count;
                    list.clear();
                    list.add(list2[i]);
                }
                else if (count==min) {
                    list.add(list2[i]);

                }
            }

        }
        return list.toArray();
    }
    public static void main(String[] args) {
        String list1[]={"Rohan","Ram","Shubham","Shreyash"};
        String list2[]={"Rohan","Ram","Shubham","Shreyash"};

        System.out.println(result(list1,list2));


    }
}
