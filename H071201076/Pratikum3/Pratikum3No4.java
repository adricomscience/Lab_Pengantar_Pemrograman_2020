import java.util.Scanner;
public class Pratikum3No4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0;
        int harga = read.nextInt();
        int bayar = read.nextInt();
        int kembalian = bayar-harga;
        for ( ;kembalian != 0; ) { 
            if (kembalian >= 100000) {
                kembalian = kembalian-100000;
                a++;
            } else if (kembalian>=50000 && kembalian<100000) {
                kembalian = kembalian-50000;
                b++;
            } else if (kembalian>=20000 && kembalian<50000) {
                kembalian = kembalian-20000;
                c++;
            } else if (kembalian>=10000 && kembalian<20000) {
                kembalian = kembalian-10000;
                d++;
            } else if (kembalian>=5000 && kembalian<10000) {
                kembalian = kembalian-5000;
                e++;
            } else if (kembalian>=2000 && kembalian<5000) {
                kembalian = kembalian-2000;
                f++;
            } else if (kembalian>=1000 && kembalian<2000) {
                kembalian = kembalian-1000;
                g++;
            }
        }
        System.out.println(a + " uang Rp. 100.000");
        System.out.println(b + " uang Rp. 50.000");
        System.out.println(c + " uang Rp. 20.000");
        System.out.println(d + " uang Rp. 10.000");
        System.out.println(e + " uang Rp. 5.000");
        System.out.println(f + " uang Rp. 2.000");
        System.out.println(g + " uang Rp. 1.000");
    }
}
