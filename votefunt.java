import java.util.Scanner;
public class votefunt {
    static String age(int n) {
        if (n > 18) {
            return "Eligible to votting";
        } else {
            return "not Eligible to votting";
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of Person: ");
        int n = sc.nextInt();
        System.out.println(age(n));
    }
}