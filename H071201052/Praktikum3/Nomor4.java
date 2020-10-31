import java.util.Scanner;
public class Nomor4 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("masukkan harga barang");
        int harga = input.nextInt();
        System.out.println("masukkan jumlah uang yang di bayarkan ");
        int dibayarkan = input.nextInt();
        int kembalian = dibayarkan-harga;
        int pecahan = 0;
        int sisa = 0;

        for (int i = 1; i <= 7; i++) {
            switch(i){
                case 1 :
                pecahan = kembalian/100000;
                System.out.println(pecahan+ " uang Rp. 100.000");
                break;
                
                case 2 :
                sisa = kembalian - (pecahan * 100000);
                pecahan = sisa / 50000;
                System.out.println(pecahan+ " uang Rp. 50.000");
                break;

                case 3:
                sisa = sisa - (pecahan * 50000);
                pecahan = sisa / 20000;
                System.out.println(pecahan+ " uang Rp. 20.000");
                break;

                case 4:
                sisa = sisa - (pecahan * 20000);
                pecahan = sisa/10000;
                System.out.println(pecahan + " uang Rp. 10.000");
                break;

                case 5 :
                sisa = sisa-(pecahan * 10000);
                pecahan = sisa/5000;
                System.out.println(pecahan + " uang Rp. 5.000");
                break;

                case 6 :
                sisa = sisa-(pecahan * 5000);
                pecahan = sisa/2000;
                System.out.println(pecahan + " uang Rp. 2.000");
                break;

                case 7 :
                sisa = sisa-(pecahan*2000);
                pecahan = sisa/1000;
                System.out.println(pecahan + " uang Rp. 1.000");

            }   
        }
    }
}