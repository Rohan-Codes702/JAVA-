public class lrg {
    public static void main(String[]args)
    {
        int []a={1,2,6,7,4,3};
        int n=a.length;
        int large=a[0];
        for (int i=1;i<n;i++)
        {
            if(a[i]>large)
            {
                large=a[i];
            }
        }
        System.out.println(large);
    }

}
