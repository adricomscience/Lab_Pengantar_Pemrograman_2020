import java.util.Scanner;
public class Tugas2 {

    public static void main(String[] args) {
    int waktu, kecepatan;
    float l;

    Scanner o=new Scanner(System.in);
    System.out.println("Lama Perjalanan ");
    waktu = o.nextInt();
    System.out.println("Kecepatan Rata-rata ");
    kecepatan = o.nextInt();

    l= (float) waktu/14*kecepatan;

    System.out.printf("Jumlah bensin yang digunkan" + " yaitu %.3f L\n", l);




        
    }
}
