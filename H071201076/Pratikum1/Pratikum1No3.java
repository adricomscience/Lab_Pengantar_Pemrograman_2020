import java.util.Scanner;

public class Pratikum1No3 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Masukkan Tinggi Menara (m) : ");
        double h = read.nextInt();
        System.out.println("Keterangan : 90<a<b");
        System.out.print("Masukkan Sudut a : ");
        double a = read.nextInt();
        System.out.print("Masukkan Sudut b : ");
        double b = read.nextInt();
        double x1 = Math.tan(Math.toRadians(b))*h;
        double x = Math.tan(Math.toRadians(a))*h;
        double x2 = x-x1;
        System.out.printf("Panjang Kapal (m) : " + "%1.1f %n", x2); 
    
    }
}