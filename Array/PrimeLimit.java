package Array;

public class PrimeLimit {
    public static void main(String[] args) {
       int num=4;
       boolean isprime=true;
        for(int i=2;i<num;i++){
            if (num%i==0){
                isprime=false;
                break;
            }
            else {
                isprime=true;
            }
        }
        if (isprime){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not prime");
        }
    }
}
