import java.util.Scanner;

class Tugastambahan02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //delarasi variabel
        double V,r,d,t;
        double phi = 3.14;

        //input nilai yang diketahui
        System.out.print(" Masukkan nilai diameter : ");
        d = input.nextDouble();
        System.out.print(" Masukkan nilai tinggi : ");
        t = input.nextDouble();

        //proses
        r = d/2;
        V = (phi*r*r*t);

        //output
        System.out.print(" Volume Tabung : " + V);

    }
}