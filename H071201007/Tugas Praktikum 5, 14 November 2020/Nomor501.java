import java.util.Scanner;

public class Nomor501 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println(" ======================= ");
        System.out.println(" Masukkan bilangan 1 ");
        System.out.println(" ======================= ");
        int a = input.nextInt();
        System.out.println(" ======================= ");
        System.out.println(" Masukkan bilangan 2 ");
        System.out.println(" ======================= ");
        int b = input.nextInt();
        input.close();
        int FPB = cariFPB(a,b);
        System.out.println("=========================");
        System.out.println(" FPB dari Kedua Bilangan ");
        System.out.println("=========================");
        System.out.println("FPB dari " + a + " dan " + b + " adalah " + FPB);
    }
    public static int cariFPB(int a, int b) {
        int besar, kecil;
        int FPB = 0;
        besar = b;
        kecil = a;
        if (a > b) {
            besar = a;
            kecil = b;
        }
        for (int i = kecil; i > 0; i--) {
            if (kecil % i == 0 && besar % i == 0) {
                FPB = i;
                
            break;
            }
        }
        return FPB;
    }
}

        

