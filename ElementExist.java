package ArrayList;
import java.util.ArrayList;
public class ElementExist {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        int []arr={1,2,3,4,5,6,90};

        for(int num:arr){
            list.add(num);
        }

        if(list.contains(5)){
            System.out.println("Element Exist");
        }
        else {
            System.out.println("Element Not exist");
        }
    }
}
