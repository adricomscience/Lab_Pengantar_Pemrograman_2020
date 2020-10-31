import java.util.Scanner;
public class Nomor2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("         ~~ Menu ~~       ");
            System.out.println(" 1. mencari luas bangun datar ");
            System.out.println(" 2. mencari volume bangun ruang ");
            System.out.println(" ");
            System.out.println(" input angka sesuai dengan menu yang diinginkan :"); 
        try {
        int pilihan = input.nextInt();
        int sisi,panjang,lebar,alas,tinggi;
        float jarijari;
        
        if (pilihan==1) {
            System.out.println(" ~~ pilih bangun datar ~~ ");
            System.out.println("");
            System.out.println("1. persegi");
            System.out.println("2. persegi panjang");
            System.out.println("3. segitiga");
            System.out.println("4. lingkaran");
            System.out.println("5. jajar genjang");
            System.out.println("6. trapesium");
            System.out.println("7. belah ketupat");
            System.out.println("8. layang layang");
            System.out.println("");
            System.out.println("input data sesuai dengan bangun datar yang diinginkan :");
        int rumus = input.nextInt();    
        System.out.println("");        
        if (rumus==1) {
            System.out.println("input sisi");
        sisi = input.nextInt();
            System.out.println("luas persegi = " + sisi * sisi);
        }
        else if (rumus==2) {
            System.out.println("input panjang");
        panjang = input.nextInt();
            System.out.println("input lebar");
        lebar = input.nextInt();
            System.out.println("luas persegi panjang = " + panjang * lebar);
        } 
        else if (rumus==3) {
            System.out.println("masukkan alas");
        alas = input.nextInt();
            System.out.println("masukkan tinggi");
        tinggi = input.nextInt();
            System.out.println("luas segitiga = " + 0.5 * (alas * tinggi));
        }
        else if (rumus==4) {
            System.out.println("masukkan jari-jari lingkaran");
        jarijari = input.nextInt();
            System.out.println("luas lingkaran = " + Math.PI *jarijari *jarijari);
        }
        else if (rumus==5) {
            System.out.println("masukkan alas");
        alas = input.nextInt();
            System.out.println("masukkan tinggi");
        tinggi = input.nextInt();
            System.out.println("luas jajar genjang = " + alas * tinggi);
        }
        else if (rumus==6) {
            System.out.println("masukkan jumlah sisi sejajar a dan b");
        int a = input.nextInt();
        int b = input.nextInt();
            System.out.println("masukkan tinggi");
        tinggi = input.nextInt();
            System.out.println("luas trapesium = " + 0.5 * (a + b) * tinggi );
        }
        else if (rumus==7) {
            System.out.println("masukkan diagonal 1");
        int d1 = input.nextInt();
            System.out.println("masukkan diagonal 2");
        int d2 = input.nextInt();
            System.out.println("luas belah ketupat = " + d1 * d2 / 2);
        }
        else if (rumus==8) {
            System.out.println("masukkan diagonal 1");
        int d1 = input.nextInt();
            System.out.println("masukkan diagonal 2");
        int d2 = input.nextInt();
            System.out.println("luas layang - layang = " + d1 * d2 / 2);
        }
        else {
            System.out.println("maaf inputan tidak valid");
        }
        }
        else if (pilihan==2) {
            System.out.println("pilih bangun ruang");
            System.out.println("");
            System.out.println("1. kubus ");
            System.out.println("2. balok");
            System.out.println("input data sesuai dengan data yang diinginkan");
        int rumus = input.nextInt();
        if (rumus==1) {
            System.out.println("masukkan sisi");
        sisi = input.nextInt();
            System.out.println("volume kubus = " + sisi * sisi * sisi); 
        }
        else if (rumus==2) {
            System.out.println("masukkan panjang");
        panjang = input.nextInt();
            System.out.println("masukkan lebar");
        lebar = input.nextInt();
            System.out.println("masukkan tinggi");
        tinggi = input.nextInt();
            System.out.println("volume balok = " + panjang * lebar * tinggi);
        }
        else {
            System.out.println("maaf inputan tidak valid");
        }
        }
        else {
            System.out.println("maaf inputan tidak  valid");
        }
        }catch (Exception e) {
            System.out.println("maaf inputan tidak valid");
        }
    
    }

    
}
