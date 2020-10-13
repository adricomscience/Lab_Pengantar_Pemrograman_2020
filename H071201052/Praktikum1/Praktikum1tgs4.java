import java.util.Scanner;
public class Praktikum1tgs4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan panjang rusuk");
        int rusuk = input.nextInt();
        
        rusuk = 6 * rusuk * rusuk;

    System.out.println("luas permukaan kubus");
    System.out.println( rusuk );
    }
}