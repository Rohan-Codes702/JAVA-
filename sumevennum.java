import java.util.Scanner;
    public class sumevennum
    {
        public static void main(String[] arga) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number:_");
            int n=sc.nextInt();
            int sum=0;
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    sum=sum+i;
                }
            }
            System.out.println("Sum of all even numbers is :-"+sum);
        }
    }


