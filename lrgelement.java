public class lrgelement {
    public static void main(String[] args)
    {
        int []a={1,2,4,75,54};
        int n=a.length;
        int large=a[0];
        for(int i=1;i<n;i++)
        {
            if(large<a[i])
            {
                large=a[i];
            }
        }
        System.out.println("largest element in arary"+large);
    }
}
