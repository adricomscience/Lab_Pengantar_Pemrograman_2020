import java.util.Scanner;

class ttb2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double volume,r,d,tinggi;
        double phi = 3.14;

        System.out.print(" Masukkan nilai diameter : ");
        d = scan.nextDouble();
        System.out.print(" Masukkan nilai tinggi : ");
        tinggi = scan.nextDouble();

        r = d/2f;
        volume = (phi*r*r*tinggi);

        System.out.print(" Volume Tabung : " + String.format("%.3f",volume));

    }
} 