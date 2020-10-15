import java.util.Scanner;
public class JumlahBensin{
    public static void main(String[] arg){
        Scanner n = new Scanner(System.in);
        int waktu, kecepatan;
        double jarak, efisiensi, bensin;
        System.out.println("masukan waktu");
        waktu = n.nextInt();
        System.out.println("masukan kecepatan");
        kecepatan = n.nextInt();
        efisiensi = 14;
        jarak = kecepatan * waktu;
        bensin = jarak/efisiensi;
        System.out.printf("bensin yang digunakan = %.3f L", bensin);

    }
}