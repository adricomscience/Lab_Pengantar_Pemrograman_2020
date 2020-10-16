import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double phi = Math.PI;
        double diameter = in.nextDouble();
        double tinggi = in.nextDouble();
        
        double volumetabung = phi * diameter/2 *diameter/2 * tinggi;
        System.out.println("volumetabungnya adalah :" +volumetabung);
    }
}
