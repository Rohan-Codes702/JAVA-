package ArrayList;
import java.util.ArrayList;
public class MaximumElemetn {
    public static void main(String[] args) {
        ArrayList<Integer>max=new ArrayList<>();
       max.add(0,1);
        max.add(1,2);
        max.add(2,3);
        max.add(3,4);
        max.add(4,5);
        max.add(5,6);
        max.add(6,7);

        int maximum=Integer.MIN_VALUE;
        for(int  m:max){
            if(m>maximum){
                maximum=m;
            }

        }
        System.out.println(maximum);
    }
}
