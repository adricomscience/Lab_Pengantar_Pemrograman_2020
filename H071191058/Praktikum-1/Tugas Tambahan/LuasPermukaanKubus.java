import java.util.Scanner;
public class LuasPermukaanKubus{
    public static void main(String[] arg){
        Scanner n = new Scanner(System.in);
        System.out.printf("Masukkan Panjang Rusuk : ");
        int s = n.nextInt();
        int luasPermukaan = 6*(s*s);
        System.out.printf("Luas Permukaan : %d",luasPermukaan);

    }
}