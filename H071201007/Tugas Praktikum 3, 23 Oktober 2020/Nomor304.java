import java.util.Scanner;

public class Nomor304 {
    public static void main(String[] args) {
        try
        {
            Scanner input = new Scanner(System.in);
            int seratusribu=0,limapuluhribu=0,duapuluhribu=0,sepuluhribu=0,limaribu=0,duaribu=0,seribu=0;
            int harga = input.nextInt();
            int pembayaran = input.nextInt();
            if (harga<pembayaran)
            {
                int kembalian = pembayaran-harga;
                while(kembalian > 0)
                {
                    if(kembalian-100000>=0)
                    {
                        kembalian -= 100000;
                        seratusribu++;
                    }
                    else if(kembalian-50000>=0)
                    {
                        kembalian -= 50000;
                        limapuluhribu++;
                    }
                    else if(kembalian-20000>=0)
                    {
                        kembalian -= 20000;
                        duapuluhribu++;
                    }
                    else if(kembalian-10000>=0)
                    {
                        kembalian -= 10000;
                        sepuluhribu++;
                    }
                    else if(kembalian-5000>=0)
                    {
                        kembalian -= 5000;
                        limaribu++;
                    }
                    else if(kembalian-2000>=0)
                    {
                        kembalian -= 2000;
                        duaribu++;
                    }
                    else
                    {
                        kembalian -= 1000;
                        if(kembalian==0)
                            seribu++;
                    }
                }
                System.out.println(seratusribu+" uang Rp.100.000");
                System.out.println(limapuluhribu+" uang Rp.50.000");
                System.out.println(duapuluhribu+" uang Rp.20.000");
                System.out.println(sepuluhribu+" uang Rp.10.000");
                System.out.println(limaribu+" uang Rp.5.000");
                System.out.println(duaribu+" uang Rp.2.000");
                System.out.println(seribu+" uang Rp.1.000");
            }
            else
                System.out.println("Pembayaran Anda tidak cukup untuk membayar");
        }
        catch(Exception e)
        {
            System.out.println("mohon masukkan nilai yang benar");
        }
    }
    
}
