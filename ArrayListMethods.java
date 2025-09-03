package ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        int arr[]={1,1,6,3,2,1,6,8,9,0};
        ArrayList<Integer>list=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        System.out.println(list);
        System.out.println("First Element"+list.getFirst());
        System.out.println("Last Element"+list.getLast());

    }
}
