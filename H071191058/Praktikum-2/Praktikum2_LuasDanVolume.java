import java.util.Scanner;
class Praktikum2_LuasDanVolume{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("===Pilihan===");
        System.out.println("1. Mencari Luas Bangun datar");
        System.out.println("2. Mencari Volume Bangun ruang");
        System.out.println(" ");
        System.out.print("Input angka sesuai dengan Pilihan yang diinginkan :");
        int pilihan1 = scan.nextInt();
        switch ( pilihan1 ){
            case 1 :
                System.out.println("==Pilih Bangun Datar==");
                System.out.println("1. Persegi ");
                System.out.println("2. Persegi panjang ");
                System.out.println("3. Segitiga ");
                System.out.println("4. Lingkaran ");
                System.out.println("5. Jajar genjang ");
                System.out.println("6. Trapesium ");
                System.out.println("7. Belah ketupat ");
                System.out.println("8. Layang - layang ");
                System.out.println(" ");
                System.out.println("Input angka sesuai dengan nomor bangun datar yang  diinginkan : ");
                int pilihan2 = scan.nextInt();
                
                    switch ( pilihan2){
                        case 1:
                            System.out.print("Input sisi = ");
                            float sisi1 = scan.nextFloat();
                            float luas1 = sisi1 * sisi1;
                            System.out.println("Luas persegi = " + luas1);
                            break;
                        case 2:
                            System.out.print("Input panjang = ");
                            float panjang2 = scan.nextFloat();
                            System.out.print("Input Lebar = ");
                            float lebar2 = scan.nextFloat();
                            float luas2 = panjang2 * lebar2;
                            System.out.println("Luas persegi panjang = " + luas2);
                            break;
                        case 3:
                            System.out.print("Input alas = ");
                            float alas3 = scan.nextFloat();
                            System.out.print("Input tinggi = ");
                            float tinggi3 = scan.nextFloat();
                            float luas3 = 1 / 2 * ( alas3 * tinggi3);
                            System.out.println("Luas segitiga = " + luas3);
                            break;
                        case 4:
                            System.out.print("Input jari - jari = ");
                            float jari4 = scan.nextFloat();
                            float luas4 = (float)
                            Math.PI * jari4 * jari4;
                            System.out.println("Luas lingkaran = " + luas4);
                            break;
                        case 5:
                            System.out.print("Input panjang = ");
                            float panjang5 = scan.nextFloat();
                            System.out.print("Input tinggi = ");
                            float tinggi5 = scan.nextFloat();
                            float luas5 = panjang5 * tinggi5;
                            System.out.println("Luas jajar genjang = " + luas5);
                            break;
                        case 6:
                            System.out.print("Input alas = ");
                            float alas6 = scan.nextFloat();
                            System.out.print("Input tinggi = ");
                            float tinggi6 = scan.nextFloat();
                            System.out.print("Input sisi atas = ");
                            float atas6 = scan.nextFloat();
                            float luas6 = 1/2 * tinggi6 * ( alas6 + atas6);
                            System.out.println("Luas trapesium = " + luas6);
                            break;
                        case 7:
                            System.out.print("Input diagonal 1 = ");
                            float diagonal7 = scan.nextFloat();
                            System.out.println("Input diagonal 2 = ");
                            float diagonall7 = scan.nextFloat();
                            float luas7 = 1/2 * diagonal7 * diagonall7;
                            System.out.println("Luas belah ketupat = " + luas7);
                            break;
                        case 8:
                            System.out.print("Input diagonal 1 = ");
                            float diagonal8 = scan.nextFloat();
                            System.out.println("Input diagonal 2 = ");
                            float diagonall8 = scan.nextFloat();
                            float luas8 = 1/2 * diagonal8 * diagonall8;
                            System.out.println("Luas belah ketupat = " + luas8);
                            break;
                        default:
                            System.out.println("Bangun datar tidak ditemukan");
                    }
                break;

            case 2:
                System.out.println("===Pilih bangun  ruang===");
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("3. Limas segiempat");
                System.out.println("4. Prisma segitiga");
                System.out.println("5. Limas segitiga");
                System.out.println("6. Tabung");
                System.out.println("7. Kerucut");
                System.out.println("8. Bola");
                System.out.println("Input angka sesuai bangun ruang yang diinginkan : ");
                int pilihan3 = scan.nextInt();
                
                    switch ( pilihan3){
                        case 1 :
                            System.out.print("Input sisi = ");
                            float side1 = scan.nextFloat();
                            float volume1 = (float) Math.pow(side1, 3);
                            System.out.println("Volume kubus = " + volume1);
                            break;
                        case 2 :
                            System.out.print("Input panjang = ");
                            float long2 = scan.nextFloat();
                            System.out.print("Input lebar =");
                            float width2 = scan.nextFloat();
                            System.out.print("Input tinggi =");
                            float high2 = scan.nextFloat();
                            float  volume2 = long2 * width2 * high2;
                            System.out.println("Volume balok = " + volume2);
                            break;
                        case 3 :
                            System.out.print("Input luas alas = ");
                            float layer3 = scan.nextFloat();
                            System.out.print("Input tinggi = ");
                            float high3 = scan.nextFloat();
                            float volume3 = 1/3 * ( layer3 * high3);
                            System.out.println("Volume limas segiempat = " + volume3);
                            break;
                        case 4 :
                            System.out.print("Input alas = ");
                            float layer4 = scan.nextFloat();
                            System.out.print("Input tinggi = ");
                            float high4 = scan.nextFloat();
                            float volume4 = 1/2 * ( layer4 * high4);
                            System.out.println("Volume prisma segitiga = " + volume4);
                            break;
                        case 5 :
                            System.out.print("Input alas = ");
                            float layer5 = scan.nextFloat();
                            System.out.print("Input tinggi segitiga = ");
                            float triHigh5 = scan.nextFloat();
                            System.out.print("Input tinggi = ");
                            float high5 = scan.nextFloat();
                            float volume5 = 1/6 * ( layer5 * triHigh5 * high5);
                            System.out.println("Volume limas segitiga = " + volume5);
                            break;
                        case 6 :
                            System.out.print("Input jari - jari = ");
                            float finger6 = scan.nextFloat();
                            System.out.print("Input tinggi = ");
                            float high6 = scan.nextFloat();
                            double volume6 = (float) Math.PI * Math.pow(finger6, 2) * high6;
                            System.out.println("Volume tabung  = " + volume6);
                            break;
                        case 7 :
                            System.out.print("Input jari - jari = ");
                            float finger7 = scan.nextFloat();
                            System.out.print("Input tinggi = ");
                            float high7 = scan.nextFloat();
                            double volume7 = (float) 1/3 * Math.PI * Math.pow(finger7, 2) * high7;
                            System.out.println("Volume kerucut = " + volume7);
                            break;
                        case 8 :
                            System.out.print("Input jari - jari = ");
                            float finger8 = scan.nextFloat();
                            double volume8 = (float) 4/3 * ( Math.PI * Math.pow(finger8, 3) );
                            System.out.println("Volume bola = " + volume8);
                            break;
                        default:
                            System.out.println("Bangun ruang tidak ditemukan");
                    }
        }    
    }
}