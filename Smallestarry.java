public class Smallestarry {
public static void main(String[] args)
{
    int []a={4,5,76,655,32,1,4,6,7};
    int n=a.length;
    int small=a[0];
    for(int i=1;i<n;i++)
    {
        if(small>a[i])
        {
            small=a[i];
        }
    }
    System.out.println(small);
}

}
