import java.util.Scanner;

public class Pratikum4No2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int i = read.nextInt();
        int j = read.nextInt();
        int k = read.nextInt();
        System.out.println();
        int[][] matriksA = new int[i][j];
        int[][] matriksB = new int[j][k];
        int[][] matriksC = new int[i][k];
        int jumlah = 0;

        for (int a = 0; a < i; a++) {
            for (int b = 0; b < j; b++) {
                matriksA[a][b] = read.nextInt();
            }
        }
        System.out.println();
        for (int a = 0; a < j; a++) {
            for (int b = 0; b < k; b++) {
                matriksB[a][b] = read.nextInt();
            }
        }
        System.out.println();
        for (int a = 0; a < i; a++) {
            for (int b = 0; b < k; b++) {
                for (int c = 0; c < j; c++) {
                    jumlah += matriksA[a][c]*matriksB[c][b];
                    matriksC[a][b] = jumlah;        
                }
                jumlah = 0;
            }
        }
        for (int a = 0; a < i; a++) {
            for (int b = 0; b < k; b++) {
            System.out.print(matriksC[a][b] + " ");
            }
            System.out.println();
        }
    }
}
