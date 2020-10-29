import java.util.Scanner;

public class Tugas2No1 {
    public static void main(String[] args) {
        
     
        Scanner p = new Scanner(System.in);
      System.out.println("input 5 bilangan bulat");
      try{ int a = p.nextInt();
       int b = p.nextInt();
       int c = p.nextInt();
       int d = p.nextInt();
       int e = p.nextInt();
       int w = 0;
       int x = 0;
       int y = 0;
       int z = 0;
    if (a%2==0){ w++;} 
        else {x++;}
    if (a > 0){y++;} 
        else{z++;}
   

    if (b%2==0){ w++;} 
        else {x++;}
    if (b > 0){y++;} 
        else{z++;}

    if (c%2==0){ w++;} 
        else {x++;}
    if (c > 0){y++;} 
        else{z++;}
   
    if (d%2==0){ w++;} 
        else {x++;}
    if (d > 0){y++;} 
        else{z++;}
   
    if (e%2==0){ w++;} 
        else {x++;}
    if (e > 0){y++;} 
     else{z++;}
   

System.out.println("Hasilnya Adalah");
System.out.println(w+" Angka Genap");
System.out.println(x+ " Angka Ganjil");
System.out.println(y+ " Angka Positif");
System.out.println(z+ "Angka Negatif");

}catch(Exception e){System.out.println("Input Tidak Valid");}










    }
}
