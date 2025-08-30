package Array;

public class RectangeOverlap {

    public static boolean overlap(int []rect1 ,int []rect2){

        int x1=rect1[0];
        int y1=rect1[1];
        int x2=rect1[2];
        int y2=rect1[3];

        int x3=rect2[0];
        int y3=rect2[1];
        int x4=rect2[2];
        int y4=rect2[3];

        if(x1>=x3 || x4<=x2 || y4<=y2 || y1>=y3){
            return false;
        }
        return true;

    }
    public static void main(String[] args) {
        int []rect1={0,0,2,2};
        int []rect2={1,1,3,3};
        System.out.println(overlap(rect1,rect2));





    }
}
