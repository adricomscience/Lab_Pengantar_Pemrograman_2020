import java.util.Scanner;
public class No2{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Ukuran Matriks");

		int i = scan.nextInt();
		int j = scan.nextInt();
		int k = scan.nextInt();
		int[][] matriksA = new int[i][j];
		int[][] matriksB = new int[j][k];

        System.out.printf("\nMasukkan elemen Matriks A(%d,%d)\n", i,j);
		for(int a = 0; a < i; a++){
			for(int b = 0; b < j; b++){
				matriksA[a][b]=scan.nextInt();
			}
        }
        System.out.printf("\nMasukkan elemen Matriks B(%d,%d)\n", j,k);
		for(int b = 0; b < j; b++){
			for(int c = 0; c < k; c++){
				matriksB[b][c]=scan.nextInt();
			}
        }
        System.out.printf("\nHasil Perkalian (Matriks C(%d,%d)\n",i,k);
		
		for(int a = 0; a < i; a++){
			for(int b = 0; b < k; b++){
				int total = 0;
				for(int c = 0; c < j; c++){
					total = total + matriksA[a][c] * matriksB[c][b];
					
                }
				System.out.print(total + " ");
			}
			System.out.println();
		}
	}
}