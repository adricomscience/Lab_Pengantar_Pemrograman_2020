import java.util.Scanner;

class Praktikum013 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();

        double AC = Math.tan(Math.toRadians(a))*h;
        double BC = Math.tan(Math.toRadians(b))*h;
        double panjangkapal = AC-BC;

     System.out.print("Panjang Kapal : " + panjangkapal + " m ");
    }
}