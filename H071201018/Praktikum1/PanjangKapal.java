import java.util.Scanner;
class PanjangKapal
{

    public static void main(String[] args)
    {

        // int h, a, b;
        double h, a, b, s1, s2, p;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Masukan ketinggian (h) = ");
        h = obj.nextInt();
        System.out.print("Masukan sudut 1 (a) = ");
        a = obj.nextInt();
        System.out.print("Masukan sudut 2 (b) = ");
        b = obj.nextInt();

        s1 = Math.tan(Math.toRadians(a))*h;
        s2 = Math.tan(Math.toRadians(b))*h;
        p = s1-s2;

        System.out.printf("Panjang kapal = " + "%.1f",p);
        System.out.print(" meter");
       
    }
}