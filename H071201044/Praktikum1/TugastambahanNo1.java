import java.util.Scanner;
public class TugastambahanNo1 {
    
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int panjang;
        System.out.println("Masukkan Panjang Rusuk Kubus");
        panjang = input.nextInt();
        int luas = 6 * panjang * panjang;
        System.out.println("Total Luas Permukaan Kubus ="+luas);
    }

}
