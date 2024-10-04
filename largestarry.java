public class largestarry {
public static void main(String[] args){
    int [] a={1,2,3,7,5};
    int n=a.length;
    int large=a[0];
    for(int i=1;i<n;i++){
        if(large<a[i]) {
            large = a[i];
        }
    }
    System.out.println(large);
}
}

