import java.util.*;
public class Soal4{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("masukkan harga barang : ");
        int hargaBarang = n.nextInt();
        System.out.print("masukkan besaran uang : ");
        int bayar = n.nextInt();
        int kembalian = bayar - hargaBarang;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        if (bayar >= hargaBarang){
            while (true){
                if (kembalian - 100000 >= 0){
                    kembalian -= 100000;
                    a++;
                }else if (kembalian - 50000 >= 0){
                    kembalian -= 50000;
                    b++;
                }else if (kembalian - 20000 >= 0){
                    kembalian -= 20000;
                    c++;
                }else if (kembalian - 10000 >= 0){
                    kembalian -= 10000;
                    d++;
                }else if (kembalian - 5000 >= 0){
                    kembalian -= 5000;
                    e++;
                }else if (kembalian - 2000 >= 0){
                    kembalian -= 2000;
                    f++;
                }else if (kembalian - 1000 >= 0){
                    kembalian -= 1000;
                    g++;
                }else if (kembalian == 0){
                    break;
                }
            }
            System.out.printf("Kembalian Uang Anda  :\n");
            System.out.printf("%d uang Rp. 100.000 \n",a);
            System.out.printf("%d uang Rp. 50.000\n",b);
            System.out.printf("%d uang Rp. 20.000\n",c);
            System.out.printf("%d uang Rp. 10.000\n",d);
            System.out.printf("%d uang Rp. 5.000\n",e);
            System.out.printf("%d uang Rp. 2.000\n",f);
            System.out.printf("%d uang Rp. 1.000\n",g);
        //}else{
            //System.out.println("error");
        }
    }
}