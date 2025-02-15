package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class ReturnDuplicateElements {
    public static ArrayList<Integer> display(int [] nums){
        int n= nums.length;

        HashSet<Integer>set=new HashSet<>();

        for(int num:nums){
            set.add(num);
        }

        ArrayList<Integer>List=new ArrayList<>();
        for(int i=0;i<=n;i++){
            {
                if (!set.contains(i))
                List.add(i);
            }
        }
        return List;
    }
    public static void main(String[] args) {
        int []nums={1,2,3,5,6,7};
        System.out.println(display(nums));
    }
}
