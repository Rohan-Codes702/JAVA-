package BasicJava.java;


public class FirstPallindromicWord {
    public static  boolean pallinderome(String s)
    {
       int start=0;
       int end=s.length()-1;

       while (start<=end)
       {
           if(s.charAt(start)!=s.charAt(end))
           {
               return false;
           }
           start++;
           end--;
       }
       return true;
    }
    public static void main(String[] args) {
        String[] s={"acs","asd","aba","rty"};

        for(String w:s)
        {
            if(pallinderome(w))
            {
                System.out.println(w);
            }
        }
        System.out.println(" ");

    }
}
