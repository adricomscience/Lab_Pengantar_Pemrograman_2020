import java.util.Scanner;
public class TugastambahanNo2 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double d;
        double t;
        System.out.println("Masukkan Diameter Tabung:");
        d = input.nextInt();
        System.out.println("Masukkan Tinggi Tabung");
        t = input.nextInt();
        double phi = 3.14f;
        double r = d/2;
        double volume = (phi * r * r * t);
        System.out.printf("volume tabung: %.2f ", volume);
    }
}
