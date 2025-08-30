package Array;

import java.util.HashSet;

public class Removeduplicate {
    public static void main(String[] args) {
        int nums[]={1,1,2};

        HashSet<Integer>set=new HashSet<>();

        for (int i:nums){
            set.add(i);
        }

        Integer  result[]=set.toArray(new Integer[0]);
        int count=0;
        for (int i:result){
            System.out.println(i);
            count++;

        }
        System.out.println(count);
    }
}
