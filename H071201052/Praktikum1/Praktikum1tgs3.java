import java.util.Scanner;
public class Praktikum1tgs3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double h,a,b;
        System.out.println("masukkan h"); 
        h = input.nextDouble();
        System.out.println("masukkan a");
        a = input.nextDouble();
        System.out.println("masukkan b");
        b = input.nextDouble();

        
        a =  Math.tan(Math.toRadians(a));
        b =  Math.tan(Math.toRadians(b));
        h = (a - b) * h;
                              
        System.out.printf("panjang kapal = %.1f  m ", h );
         

    }
}
