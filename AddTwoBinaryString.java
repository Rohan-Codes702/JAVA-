package BasicJava.java;

public class AddTwoBinaryString {
    public  static String add(String x,String y)
    {
        int num1=Integer.parseInt(x,2);

        int num2=Integer.parseInt(x,2);

        int sum=num1+num2;

        String  result =Integer.toBinaryString(sum);
        return result;
    }
    public static void main(String[] args)
    {
        String x = "011011", y = "1010111";

        System.out.println("Addition of two binary string:" +add(x,y));
    }
}