import java.util.Scanner;

public class Nomor02 {
    public static void main(String[] args ) {
        int s,p,l,a,t,r,d1,d2,pilih1,pilih2,Menu;
        double Luas,Volume;
        double phi = 3.14;
    
        Scanner input = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println(" ** Menu ** ");
        System.out.println("===============================");
        System.out.println(" 1. Mencari Luas Bangun Datar ");
        System.out.println(" 2. Mencari Volume Bangun Ruang ");
        System.out.println("===============================");
        System.out.println();
        System.out.println(" Ketik angka untuk memilih ");
        System.out.println(" Pilih Menu : ");
        Menu  = input.nextInt();

    switch (Menu) {
        case 1 : 
            System.out.println("===============================");
            System.out.println(" ** Pilih Bangun Datar ** ");
            System.out.println("===============================");
            System.out.println(" 1. Persegi ");
            System.out.println(" 2. Persegi Panjang ");
            System.out.println(" 3. Segitiga ");
            System.out.println(" 4. Lingkaran ");
            System.out.println(" 5. Jajar Genjang ");
            System.out.println(" 6. Trapesium ");
            System.out.println(" 7. Belah Ketupat ");
            System.out.println(" 8. Layang-layang ");
            System.out.println("===============================");
            System.out.println();
            System.out.println(" Ketik angka untuk memilih : ");
            pilih1 = input.nextInt();
            switch (pilih1) {
                case 1 :
                    System.out.println(" Masukkan sisi : ");
                    s = input.nextInt();
                    Luas = s*s;
                    System.out.println(" Luas Persegi : " +Luas);
                    break;
                case 2 :
                    System.out.println(" Masukkan Panjang : ");
                    p = input.nextInt();
                    System.out.println(" Masukkan Lebar : ");
                    l = input.nextInt();
                    Luas = p*l;
                    System.out.println(" Luas Persegi Panjang : " +Luas);
                    break;
                case 3 :
                    System.out.println(" Masukkan Alas : ");
                    a = input.nextInt();
                    System.out.println(" Masukkan Tinggi : ");
                    t = input.nextInt();
                    Luas = 0.5*a*t;
                    System.out.println(" Luas Segitiga : " + Luas);
                    break;
                case 4 :
                    System.out.println(" Masukkan Jari-jari : ");
                    r = input.nextInt();
                    Luas = phi*r*r;
                    System.out.println(" Luas Lingkaran : " + Luas);
                    break;
                case 5 : 
                    System.out.println(" Masukkan Alas : ");
                    a = input.nextInt();
                    System.out.println(" Masukkan Tinggi : ");
                    t = input.nextInt();
                    Luas = a*t;
                    System.out.println(" Luas Jajargenjang : " + Luas);
                    break;
                case 6 :
                    System.out.println(" Masukkan Jumlah Sisi Sejajar : ");
                    s = input.nextInt();
                    System.out.println(" Masukkan Tinggi : ");
                    t = input.nextInt();
                    Luas = 0.5*s*t;
                    System.out.println(" Luas Trapesium : " + Luas);
                    break;
                case 7 :
                    System.out.println(" Masukkan Diagonal1 : ");
                    d1 = input.nextInt();
                    System.out.println(" Masukkan Diagonal2 : ");
                    d2 = input.nextInt();
                    Luas = 0.5*d1*d2;
                    System.out.println(" Luas Layang-layang : " + Luas);
                    break;
                case 8 :
                    System.out.println(" Masukkan Diagonal1 : ");
                    d1 = input.nextInt();
                    System.out.println( " Masukkan Diagonal2: ");
                    d2 = input.nextInt();
                    Luas = 0.5*d1*d2;
                    System.out.println(" Masukkan Luas Belah Ketupat : " + Luas);
                break;
            }
        break;
        case 2 : 
            System.out.println("===============================");
            System.out.println(" ** Pilih Bangun Ruang ** ");
            System.out.println("===============================");
            System.out.println(" 1. Kubus ");
            System.out.println(" 2. Balok ");
            System.out.println(" 3. Limas Segiempat ");
            System.out.println(" 4. Bola ");
            System.out.println(" 5. Prisma segitiga ");
            System.out.println(" 6. Tabung ");
            System.out.println(" 7. Kerucut ");
            System.out.println("===============================");
            System.out.println();
            System.out.println(" Ketik angka untuk memilih : " );
            pilih2 = input.nextInt();
            switch (pilih2) {
                case 1 :
                    System.out.println(" Masukkan sisi : ");
                    s = input.nextInt();
                    Volume = s*s*s;
                    System.out.println(" Volume Kubus : " + Volume);
                    break;
                case 2 :
                    System.out.println(" Masukkan Panjang : ");
                    p = input.nextInt();
                    System.out.println(" Masukkan Lebar : ");
                    l = input.nextInt();
                    System.out.println(" Masukkan Tinggi : ");
                    t = input.nextInt();
                    Volume = p*l*t;
                    System.out.println(" Volume Balok: " + Volume);
                    break;
                case 3 :
                    System.out.println(" Masukkan Sisi Alas : ");
                    s = input.nextInt();
                    System.out.println(" Masukkan Tinggi : ");
                    t = input.nextInt();
                    Volume = 0.33*s*s*t;
                    System.out.println(" Volume Limas Segiempat : " + Volume);
                    break;
                case 4 :
                    System.out.println(" Masukkan Jari-jari : ");
                    r = input.nextInt();
                    Volume = 1.33*phi*r*r*r;
                    System.out.println(" Volume Bola : " + Volume);
                    break;
                case 5 : 
                    System.out.println(" Masukkan Panjang : ");
                    p = input.nextInt();
                    System.out.println(" Masukkan Lebar : ");
                    l = input.nextInt();
                    System.out.println(" Masukkan Tinggi : ");
                    t = input.nextInt();
                    Volume = 0.5*p*l*t;
                    System.out.println(" Volume Prisma Segitiga : " + Volume);
                    break;
                case 6 :
                    System.out.println(" Masukkan Jari-jari : ");
                    r = input.nextInt();
                    System.out.println(" Masukkan Tinggi : ");
                    t = input.nextInt();
                    Volume = phi*r*r*t;
                    System.out.println(" Volume Tabung : " + Volume);
                    break;
                case 7 :
                    System.out.println(" Masukkan Jari-jari : ");
                    r = input.nextInt();
                    System.out.println(" Masukkan Tinggi : ");
                    t = input.nextInt();
                    Volume = 0.5*phi*r*r*t;
                    System.out.println(" Volume Kerucut : " + Volume);
                    break;

            }
    }
    }
}      
       

           