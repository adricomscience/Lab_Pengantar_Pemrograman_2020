import java.util.Scanner;

public class Pratikum2No2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println(" ");
        System.out.println("Input angka sesuai menu yang diinginkan : ");
        int dr = read.nextInt();
        if (dr == 1) {
            System.out.println(" ");
            System.out.println("** Pilih Bangun Datar **");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajargenjang");
            System.out.println("6. Trapesium");
            System.out.println("7. Belah Ketupat");
            System.out.println("8. Layang-Layang");
            System.out.println(" ");
            System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan : ");
            System.out.println(" ");
            int bd = read.nextInt();
            switch (bd) {
                case 1:
                    System.out.println("Input Sisi : ");
                    float s1 = read.nextInt();
                    float L1 = s1*s1;
                    System.out.println("Luas Persegi : " + L1);
                    break;
                case 2:
                    System.out.println("Input Panjang : ");
                    float p = read.nextInt();
                    System.out.println("Input Lebar : ");
                    float l = read.nextInt();
                    float L2 = p*l;
                    System.out.println("Luas Persegi Panjang : " + L2);
                    break;
                case 3:
                    System.out.println("Input Alas : ");
                    float a3 = read.nextInt();
                    System.out.println("Input Tinggi : ");
                    float t3 = read.nextInt();
                    float L3 = a3*t3/2;
                    System.out.println("Luas Segitiga : " + L3);
                    break;
                case 4:
                    System.out.println("Input Jari-Jari : ");
                    float r = read.nextInt();
                    double L4 = Math.PI*r*r;
                    System.out.println("Luas Lingkaran : " + L4);
                    break;
                case 5:
                    System.out.println("Input Alas : ");
                    float a5 = read.nextInt();
                    System.out.println("Input Tinggi : ");
                    float t5 = read.nextInt();
                    float L5 = a5*t5;
                    System.out.println("Luas Jajargenjang : " + L5);
                    break;
                case 6:
                    System.out.println("Input Sisi Panjang : ");
                    float sa = read.nextInt();
                    System.out.println("Input Sisi Pendek : ");
                    float sb = read.nextInt();
                    System.out.println("Input Tinggi : ");
                    float t6 = read.nextInt();
                    float L6 = (sa+sb)*t6/2;
                    System.out.println("Luas Trapesium : " + L6);
                    break;
                case 7:
                    System.out.println("Input Diagonal 1 : ");
                    float d1 = read.nextInt();
                    System.out.println("Input Diagonal 2 : ");
                    float d2 = read.nextInt();
                    float L7 = d1*d2/2;
                    System.out.println("Luas Belah Ketupat : " + L7);
                    break;
                case 8:
                    System.out.println("Input Diagonal 1 : ");
                    float D1 = read.nextInt();
                    System.out.println("Input Diagonal 2 : ");
                    float D2 = read.nextInt();
                    float L8 = D1*D2/2;
                    System.out.println("Luas Layang-Layang : " + L8);
                    break;
                default:
                    break; }
            } else {
                System.out.println(" ");
                System.out.println("** Pilih Bangun Datar **");
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("3. Tabung");
                System.out.println("4. Kerucut");
                System.out.println("5. Bola");
                System.out.println(" ");
                System.out.println("Input angka sesuai dengan nomor bangun ruang yang diinginkan : ");
                System.out.println(" ");
                int br = read.nextInt();
                switch (br) {
                    case 1:
                        System.out.println("Input Sisi : ");
                        float s = read.nextInt();
                        float v1 = s*s*s;
                        System.out.println("Volume Kubus : " + v1);
                        break;
                    case 2:
                        System.out.println("Input Panjang : ");
                        float p = read.nextInt();
                        System.out.println("Input Lebar : ");
                        float l = read.nextInt();
                        System.out.println("Input Tinggi : ");
                        float t2 = read.nextInt();
                        float v2 = p*l*t2;
                        System.out.println("Volume Balok : " + v2);
                        break;
                    case 3:
                        System.out.println("Input Jari-Jari : ");
                        float r3 = read.nextInt();
                        System.out.println("Input Tinggi : ");
                        float t3 = read.nextInt();
                        double v3 = Math.PI*r3*r3*t3;
                        System.out.println("Volume Tabung : " + v3);
                        break;
                    case 4:
                        System.out.println("Input Jari-Jari : ");
                        float r4 = read.nextInt();
                        System.out.println("Input Tinggi : ");
                        float t4 = read.nextInt();
                        double v4 = Math.PI*r4*r4*t4/3;
                        System.out.println("Volume Kerucut : " + v4);
                        break;
                    case 5:
                        System.out.println("Input Jari-Jari : ");
                        float r5 = read.nextInt();
                        double v5 = 4*Math.PI*r5*r5*r5/3;
                        System.out.println("Volume Bola : " + v5);
                        break;
                    default:
                        break;
            }
        }
    }
}

