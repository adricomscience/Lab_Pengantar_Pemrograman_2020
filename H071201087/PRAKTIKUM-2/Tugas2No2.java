import java.util.Scanner;

public class Tugas2No2 {
    public static void main(String[] args) {
      Scanner x = new Scanner(System.in);
      
        System.out.println( "** Menu **");
        System.out.println( "1. mencari luas bangun datar");
        System.out.println( "2. mencari volume bangun ruang");
        System.out.println( "Input angka sesuai dengan menu yang diinginkan");
        int angka = x.nextInt();
        if(angka == 1){
            System.out.println("** pilih bangun datar **");
            System.out.println("1. persegi");
            System.out.println("2. persegi panjang");
            System.out.println("3. segi tiga");
            System.out.println("4. lingkaran");
            System.out.println("5. jajar genjang");
            System.out.println("6. Trapesium");
            System.out.println("7. belah ketupat");
            System.out.println("8. layang-layang"); 
            System.out.println( "Input angka sesuai dengan bangun datar yang diinginkan");
            int angka1 = x.nextInt();
           
            if (angka1==1){
                System.out.println("input panjang sisi :");
                float p = x.nextFloat();
                float luas = p*p;
                System.out.printf("luas persegi : %.1f ",luas);
            
            }else if (angka1==2 ){
                System.out.println("input panjang");
                float p = x.nextFloat();
                System.out.println("input lebar");
                float l = x.nextFloat();
                float luas = p*l;
                System.out.printf("luas persegi panjang : %.1f ",luas);
           
            }else if ( angka1==3){
                System.out.println("input panjang alas");
                float a = x.nextFloat();
                System.out.println("input tinggi");
                float t = x.nextFloat();
                float luas =( a*t/2);
                System.out.printf("luas segi tiga : %.1f ",luas);
           
            }else if ( angka1==4){
                System.out.println("input panjang jari jari");
                double r = x.nextDouble();
                double luas = Math.PI*r*r;
                System.out.printf("luas lingkaran : %.1f ",luas);
           
            }else if ( angka1==5){
                System.out.println("input panjang alas");
                float a = x.nextFloat();
                System.out.println("input tinggi");
                float t = x.nextFloat();
                float luas =(a*t);
                System.out.printf("luas jajar genjang : %.1f ",luas);

            }else if ( angka1==6){
                System.out.println("input panjang sisi yang sejajar");
                double a = x.nextFloat();
                double b = x.nextFloat();
                System.out.println("input tinggi");
                double t = x.nextFloat();
                double luas =(((a+b)*t))/2;
                System.out.printf("luas trapesium : %.1f ",luas);
           
            }else if ( angka1==7){
                System.out.println("input panjang diagonal 1 dan diagonal 2");
                float d1 = x.nextFloat();
                float d2 = x.nextFloat();
                float luas =( d1*d2/2);
                System.out.printf("luas belah ketupat : %.1f ",luas);
            
            }else if ( angka1==8){
                System.out.println("input panjang diagonal 1 dan diagonal 2");
                float d1 = x.nextFloat();
                float d2 = x.nextFloat();
                float luas =(d1*d2/2);
                System.out.printf("luas layang-layang : %.1f ",luas);
            
            }else{System.out.println("tidak terdapat menu "+ angka1);}
        }else if(angka==2){
            System.out.println("** pilih bangun ruang **");
            System.out.println("1. kubus");
            System.out.println("2. balok");
            System.out.println("3. prisma segi tiga");
            System.out.println("4. limas segi empat");
            System.out.println("5. limas segi tiga");
            System.out.println("6. Tabung");
            System.out.println("7. kerucut");
            System.out.println("8. bola"); 
            System.out.println( "Input angka sesuai dengan bangun datar yang diinginkan");
            int angka1 = x.nextInt();
            if (angka1==1){
                System.out.println("input panjang sisi :");
                float p = x.nextFloat();
                float volume = p*p*p;
                System.out.printf("volume kubus : %.1f ",volume);
            
            }else if(angka1==2){
                System.out.println("input panjang:");
                float p = x.nextFloat();
                System.out.println("input lebar:");
                float l = x.nextFloat();
                System.out.println("input tinggi:");
                float t = x.nextFloat();
                float volume = p*l*t;
                System.out.printf(" volume balok  : %.1f ",volume);
            
            }else if(angka1==3){
                System.out.println("input panjang alas segi tiga:");
                float a = x.nextFloat();
                System.out.println("input tinggi alas:");
                float t = x.nextFloat();
                System.out.println("input tinggi prisma:");
                float tp = x.nextFloat();
                float luas = a*t/2;
                float volume= luas*tp;
                System.out.printf(" volume prisma segi tiga  : %.1f ",volume);
            
            }else if(angka1==4){
                System.out.println("input panjang alas:");
                float p = x.nextFloat();
                System.out.println("input lebar alas:");
                float l = x.nextFloat();
                System.out.println("input tinggi limas:");
                float t = x.nextFloat();
                float volume = (p*l*t/3);
                System.out.printf(" volume limas segi empat   : %.1f ",volume);
            
            }else if(angka1==5){
                System.out.println("input panjang alas segi tiga:");
                float a = x.nextFloat();
                System.out.println("input tinggi alas:");
                float t = x.nextFloat();
                System.out.println("input tinggi limas:");
                float tl = x.nextFloat();
                float luas = a*t/2;
                float volume= luas*tl/3;
                System.out.printf(" volume limas segi tiga  : %.1f ",volume);
            
            }else if(angka1==6){
                System.out.println("input jari jari Tabung:");
                double r = x.nextDouble();
                System.out.println("input tinggi tabung:");
                double t = x.nextDouble();
                double volume = Math.PI *r*r*t;
                System.out.printf(" volume tabung  : %.1f ",volume);
            
            }else if(angka1==7){
                System.out.println("input jari jari kerucut:");
                double r = x.nextDouble();
                System.out.println("input tinggi kerucut:");
                double t = x.nextDouble();
                double volume = Math.PI*r*r*t/3;
                System.out.printf(" volume kerucut : %.1f ",volume);
            
            }else if(angka1==8){
                System.out.println("input jari jari bola:");
                double r = x.nextDouble();
                double volume = 4*Math.PI*r*r*r/3;
                System.out.printf(" volume bola : %.1f ",volume);
    
            }else{System.out.println("tidak terdapat menu "+ angka1);}
        }else{System.out.println("tidak ada menu : "+ angka);}





    }
}
