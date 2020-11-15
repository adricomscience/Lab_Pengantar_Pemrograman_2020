import java.util.Scanner;

public class Nomor2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            int i,j,k,jumlah;
            System.out.println("==============================");
            System.out.println(" Masukkan ordo i,j,dan k");
            System.out.println("==============================");
            i = input.nextInt();
            j = input.nextInt();
            k = input.nextInt();
            jumlah = 0;
            int matriksA [][] = new int[i][j];
            int matriksB [][] = new int[j][k];

            System.out.println("==============================");
            System.out.println(" Masukkan matriks A ");
            System.out.println("==============================");
            for( int x=0;x<i;x++) {
                for(int y=0;y<j;y++){
                    matriksA[x][y] = input.nextInt(); 
                }
            }
            System.out.println("==============================");
            System.out.println("Masukkan matriks B ");
            System.out.println("==============================");
            for( int x=0;x<j;x++){
                for(int y=0;y<k;y++){
                    matriksB[x][y] = input.nextInt();
                }
            }
            System.out.println("==============================");
            System.out.println(" Hasil Perkalian Matriks");
            System.out.println("==============================");
            for(int x=0;x<j;x++) {
                for(int y=0;y<i;y++) {
                    for(int z=0;z<k;z++) {
                        jumlah = jumlah + matriksA[x][z]*matriksB[y][z];
                    }
                    System.out.print(jumlah+" ");
                    if(jumlah<=10 && jumlah>10){
                        System.out.print(" ");
                    }
                }System.out.println();
            }    
                
        }        
        catch (Exception er ) {
            System.out.print(" inputan tidak valid ");
        }
        
        
    }
}
