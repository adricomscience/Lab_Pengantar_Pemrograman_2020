import java.util.Scanner;
public class Tugas22 {
   

    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
       
        double v, r, d, t;
        double phi  =  Math.PI;
       
    
        System.out.print("Masukkan Diameter Tabung = ");
        d = x.nextDouble();
        System.out.print("Masukkan Tinggi Tabung = ");
        t = x.nextDouble();
       
        r = d / 2;
        v = (phi * Math.pow(r, 2) * t);

        
        System.out.printf("Volume Tabungnya"+" Adalah = %.2f \n", v);
    }
}

