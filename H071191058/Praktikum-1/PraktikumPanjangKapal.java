import java.util.Scanner;
public class PraktikumPanjangKapal{
    public static void main(String[] args) {
        double d = 0;
        double e = 0;
        Scanner n = new Scanner(System.in);
        System.out.print("tinggi menara : ");
        double tinggi = n.nextDouble();
        System.out.print("sudut elevasi ujung depan : ");
        double ujungDepan = n.nextDouble();
        System.out.print("sudut elevasi ujung belakang : ");
        double ujungBelakang = n.nextDouble();
        
            d = Math.tan(Math.toRadians(ujungDepan))*tinggi;
            e = Math.tan(Math.toRadians(ujungBelakang))*tinggi;
            double panjang = d - e;
            System.out.printf("Panjang Kapal adalah %.1f m" , panjang);
    }
}