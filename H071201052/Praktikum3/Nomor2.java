import java.util.Scanner;
public class Nomor2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan nilai x");
        int x = input.nextInt();
        System.out.println("masukkan nilai y");
        int y = input.nextInt();
        for (int i = 1; i <= y; i++) {
            System.out.print(i + " ");
        if (i%x == 0) {
            System.out.println();
        } 
        }
    }
} 