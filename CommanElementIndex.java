package Array;

import java.util.HashSet;

public class CommanElementIndex {
    public static void main(String[] args) {

         int num1[]={2,3,2};
         int num2[]= {1,2};

         int n=num1.length;
         int m=num2.length;

        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();

        for (int i:num1){
            set1.add(i);
        }

        for (int j:num2){
            set1.add(j);
        }

        int res[]=new int[100];

        for (int i=0;i<n;i++){

            if (set2.contains(num1[i])){
                res[i]=i;
                break;
            }
        }



        for (int i:res){
            System.out.println(i);
        }

    }
}
