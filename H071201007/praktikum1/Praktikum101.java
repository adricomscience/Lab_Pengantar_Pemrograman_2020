import java.util.Scanner;

class Praktikum101 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int waktutempuh = input.nextInt();
        int kecepatan = input.nextInt();
        int efesiensi = 14;

        float x = waktutempuh*kecepatan;
        float bensin = x/efesiensi;
        
        System.out.print(" bensin yang digunakan : " + bensin + "L");
    }
}