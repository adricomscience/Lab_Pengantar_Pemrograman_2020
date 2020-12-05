import java.util.Scanner;
import java.util.*;
class Praktikum2_GenapGanjil{
    public static void main(String[] args){
        try{
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        e = input.nextInt();
        
        if (a%2==0 && a>=0){
            System.out.println(a + " bilangan genap positif");
        }else if (a%2==0 && a<0) {
            System.out.println(a + " bilangan genap negatif");
        }else if(a%2==1 && a>0){
            System.out.println(a + " bilangan ganjil positif");
        }else if (a%2==1 && a<0){ 
            System.out.println(a + " bilangan ganjil negatif");
        }

        if (b%2==0 && b>=0){
            System.out.println(b + " bilangan genap positif");
        }else if (b%2==0 && b<0) {
            System.out.println(b + " bilangan genap negatif");
        }else if(b%2==1 && b>0){
            System.out.println(b + " bilangan ganjil positif");
        }else if (b%2==1 && b<0){
            System.out.println(b + " bilangan ganjil negatif");
        }

        if (c%2==0 && c>=0){
            System.out.println(c + " bilangan genap positif");
        }else if (c%2==0 && c<0) {
            System.out.println(c + " bilangan genap negatif");
        }else if(c%2==1 && c>0){
            System.out.println(c +  "bilangan ganjil positif");
        }else if (c%2==1 && c<0){
            System.out.println(c + " bilangan ganjil negatif");
        }

        if (d%2==0 && d>=0){
            System.out.println(d + " bilangan genap positif");
        }else if (d%2==0 && d<0) {
            System.out.println(d + " bilangan genap negatif");
        }else if(d%2==1 && d>0){
            System.out.println(d + " bilangan ganjil positif");
        }else if (d%2==1 && d<0){
            System.out.println(d + " bilangan ganjil negatif");
        }

        if (e%2==0 && e>=0){
            System.out.println(e + " bilangan genap positif");
        }else if (e%2==0 && e<0) {
            System.out.println(e + " bilangan genap negatif");
        }else if(e%2==1 && e>0){
            System.out.println(e + " bilangan ganjil positif");
        }else if (e%2==1 && e<0){
            System.out.println(e + " bilangan ganjil negatif");
        }
        }catch (InputMismatchException ime){
            System.out.println("Inputan Tidak Valid harap gunakan angka saja");
        }
    }
}