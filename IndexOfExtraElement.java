package Array;

import java.util.HashSet;

public class IndexOfExtraElement {
    public static void main(String[] args) {
       int a[] = {2,4,6,8,9,10,12};
       int b[] = {2,4,6,8,10,12};

        HashSet<Integer>set=new HashSet<>();

        for (int i:b){
            set.add(i);
        }

        for (int i=0;i<a.length;i++){
            if (!set.contains(a[i])){
                System.out.println(i);
            }
        }

    }
}
