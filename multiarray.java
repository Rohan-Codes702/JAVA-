import java.util.Scanner;
public class multiarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] result = new int[3][3];
        int sum = 0, i, j = 0;
        System.out.println("Enter the 1st arary element:=");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("array is:=");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.printf(a[i][j] + "");
            }
            System.out.println("");
        }
        System.out.println("Enter the 2nd arary element:=");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the arary element:=");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.printf(b[i][j] + "");
            }
            System.out.println("");
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    sum += a[i][k] * b[k][j];
                }
                result[i][j] = sum;
            }
        }
        for(i=0;i<3;i++) {
            for (j = 0; j < 3; j++)
            {
                System.out.printf(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    }

