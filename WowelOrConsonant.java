package BasicJava.java;
import java.util.Scanner;
public class WowelOrConsonant {
    public static void wowel(char ch)
    {
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("Character is Wovel");
        }
        else
        {
            System.out.println("Character is Consonant");
        }

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Character:");
        char ch=sc.next().charAt(0);
        wowel(ch);
    }
}
