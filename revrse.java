public class revrse {
 public static void main(String[] args){
int []a={10,20,30,40,50,60,70,80,90,100};
int n=a.length;
int t;
int i,j;
for(i=0,j=n-1;i<=j;i++,j--)
     {
            t=a[i];
           a[i]=a[j];
           a[j]=t;
     }
    for(int element:a){
        System.out.println(element);
    }
 }
}
