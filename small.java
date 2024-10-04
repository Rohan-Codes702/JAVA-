public class small {
    public static void main(String[]args)
    {
        int []a={5,2,5,7,2,3,74,3};
        int small=a[0];
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            if (a[i]<small)
            {
                small=a[i];
            }
        }
        System.out.println(small);
    }
}
