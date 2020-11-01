import java.util.Scanner;

public class Nomor302 {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            int X = input.nextInt();
            int Y = input.nextInt();
            for (int i=1;i<=Y;i++) {
                if (i%X==0)
                    System.out.println(i+" ");
                else
                    System.out.print(i+" ");
                
            }

        }
        catch (Exception er)
        {
            System.out.println("Nilai harus bilangan bulat");
        }
    }
}
