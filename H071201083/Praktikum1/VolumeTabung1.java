import java.util.Scanner;
public class VolumeTabung1 {

    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
       
        double v, r;
        double d, t;
        double phi  =  Math.PI;
       
    
        System.out.print("diameter tabung = ");
        d = x.nextDouble();

        System.out.print("tinggi tabung = ");
        t = x.nextDouble();
       
        r = d / 2;
        v = (phi * Math.pow(r, 2) * t);
        System.out.printf("Volume"+" Adalah = %.2f \n", v);
    }
}