import java.util.Scanner;
public class function4 {
    public static String  greater(int a, int b) {
        if (a > b) {
            return "NO A is greater";
        } else {

            return "No B is greater";
        }
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the no a:-");
            int a = sc.nextInt();
            System.out.println("Enter the no b:-");
            int b = sc.nextInt();
            System.out.println("Greater no is :-"+greater(a,b));
        }
    }



