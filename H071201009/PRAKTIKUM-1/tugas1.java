import java.util.Scanner;
public class tugas1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sisi = in.nextInt();
        
        int luaskubus = 6 *(sisi* sisi);

        System.out.print("Luasnya adalah :"+luaskubus);
    }
}