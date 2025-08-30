package Array;

public class MultiDImensionalArray {
    public static void main(String[] args) {
        int arry[][] = new int[3][3];
        int value = 1;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arry[i][j] = value;
                value++;
            }
        }

for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arry[i][j] + " ");
            }
            System.out.println();
        }
    }
}
