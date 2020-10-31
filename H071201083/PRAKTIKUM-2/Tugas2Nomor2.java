import java.util.Scanner;
public class Pemrograman02Nomor2 {
    public static void main(String[] args) {
        Scanner  = new Scanner(System.in);
        System.out.println("** MENU **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println("");
        System.out.println("Input Angka Sesuai Dengan Menu Yang Diinginkan :");
        int b = tika.nextInt();
        System.out.println("");
            if (b == 1) {
                System.out.println("** Pilih Bangun Datar **");
                System.out.printf("1.Persegi\n2.Lingkaran\n3.Segitiga\n");
                System.out.println("");
                System.out.println("Input Angka Sesuai Dengan Bangun Datar Yang Diinginkan :");
                int bd = tika.nextInt();
                System.out.println("");
                if (bd == 1){
                    System.out.println("Input Panjang");
                    double pp = tika.nextDouble();
                    System.out.println("Input Lebar");
                    double lp = tika.nextDouble();
                    double luasp = (pp*lp);
                    System.out.printf("Luas persegi panjang = %.1f" ,luasp);
                }else if (bd ==2){
                    System.out.println("Input jari-jari lingkaran");
                    double r = tika.nextDouble();
                    double luasl = ((Math.PI)*r*r);
                    System.out.printf("Luas Lingkaran = %.1f" ,luasl);
                }else if (bd == 3){
                    System.out.println("Input Alas");
                    double a = tika.nextDouble();
                    System.out.println("Input Tinggi");
                    double t = tika.nextDouble();
                    double luass = ((a*t)/2);
                    System.out.printf("Luas Segitiga = %.1f" ,luass);
                }else {
                    System.out.println("Inputan Salah");
                }
            }else if (b == 2){
                System.out.println("** Pilih Bangun Ruang **");
                System.out.printf("1.Kubus\n2.Kerucut\n3.Bola\n");
                System.out.println(" ");
                System.out.println("Input Angka Sesuai Dengan Bangun Ruang Yang Diinginkan :");
                int br = tika.nextInt();
                System.out.println("");
                if (br == 1){
                    System.out.println("Masukkan Sisi");
                    double s = tika.nextDouble();
                    double vk = Math.pow(s, 3);
                    System.out.printf("Volume Persegi = %.1f" ,vk);
                }else if (br == 2){
                    System.out.println("Masukkan Tinggi");
                    double tk = tika.nextDouble();
                    System.out.println("Masukkan Jari-Jari Lingkaran Alas");
                    double rk = tika.nextDouble();
                    double vkc = ((Math.PI*rk*rk*tk)/3);
                    System.out.printf("Volume Kerucut = %.1f" ,vkc);
                }else if (br == 3){
                    System.out.println("Masukkan Jari-Jari Bola");
                    double rb = tika.nextDouble();
                    double vb = ((4*(Math.PI)*(Math.pow(rb, 3)))/3);
                    System.out.printf("Volume Bola = %.1f" ,vb);
                }else {
                    System.out.println("Inputan Salah");
                }
            }else {
                System.out.println("Inputan Salah");
            }
        tika.close();
    }
}
