import java.util.Scanner;
public class Praktikum1tgs5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan diameter tabung dan tinggi tabung");
        double diameter = input.nextDouble();
        double tinggi = input.nextDouble();
        
        diameter = diameter / 2;
        double volume = Math.PI * Math.pow(diameter,2) * tinggi;
            
        System.out.println("volume tabung");
        System.out.printf("%.2f", volume);
    }
}
