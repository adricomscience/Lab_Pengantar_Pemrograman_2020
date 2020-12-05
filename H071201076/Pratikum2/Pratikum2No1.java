import java.util.InputMismatchException;
import java.util.Scanner;

public class Pratikum2No1 {

	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int bil1, bil2, bil3, bil4, bil5;
        try {
        bil1 = read.nextInt();
        bil2 = read.nextInt();
        bil3 = read.nextInt();
        bil4 = read.nextInt();
        bil5 = read.nextInt();
            int positif = 0, negatif = 0, genap = 0, ganjil = 0;
        if (bil1>0) {
           positif++;
        } else if (bil1<0) {
            negatif++;
        } if (bil2>0) {
            positif++;
        } else if (bil2<0){
            negatif++;
        } if (bil3>0) {
            positif++;
        } else if (bil3<0) {
            negatif++;
        } if (bil4>0) {
            positif++;
        } else if (bil4<0){
            negatif++;
        } if (bil5>0) {
            positif++;
        } else if (bil5<0) {
            negatif++;
        } if (bil1%2 == 0) {
            genap++;
        } else {
            ganjil++;
        } if (bil2%2 == 0) {
            genap++;
        } else {
            ganjil++;
        } if (bil3%2 == 0) {
            genap++;
        } else {
            ganjil++;
        } if (bil4%2 == 0) {
            genap++;
        } else {
            ganjil++;
        } if (bil5%2 == 0) {
            genap++;
        } else {
            ganjil++;
        }
        System.out.println(genap + " angka genap");
        System.out.println(ganjil + " angka ganjil");
        System.out.println(positif + " angka positif");
        System.out.println(negatif + " angka negatif");
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
        System.out.println("Inputan Tidak Valid");

        
    }
}

    