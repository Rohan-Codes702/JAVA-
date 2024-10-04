import java.util.Scanner;
public class tableUsingWhile {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the starthing Element:-");
        int i=sc.nextInt();
        System.out.println("Enter the ending element:-");
        int e=sc.nextInt();
        System.out.println("Enter the table number:-");
        int t=sc.nextInt();
        while(i<=e)
        {
            System.out.println(i*t);
            i++;

        }

    }
}

