public class reverse {
    public static void main(String[] args){
      int []a={1,2,3,4,5,6};
      int n=a.length;
      int temp;
      int i,j;
    for(i=0,j=n-1;i<=j;i++,j--){
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
     for(int element:a){
         System.out.println(element+"");
     }
    }

    }

