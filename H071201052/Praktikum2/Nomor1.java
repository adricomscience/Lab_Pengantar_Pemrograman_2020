import java.util.Scanner;
public class Nomor1{

public static void main (String [] args){
Scanner input=new Scanner(System.in);
int a,b,c,d,e; 
int genap=0;
int ganjil=0;
int positif=0; 
int negatif=0;
System.out.print("masukkan 5 bilangan bulat yang dipisahkan oleh (SPASI) :");
try {
a = input.nextInt();
b = input.nextInt();
c = input.nextInt();
d = input.nextInt();
e = input.nextInt();

if (a == 0 && b == 0 && c == 0 && d == 0 && e == 0) {
genap++;
}
if(a%2==0) {
genap++;
}
else {   
ganjil++;
}
if(a > 0) {
positif++;
}
if(a < 0) {
negatif++;
}
if(b%2==0) {
genap++;
}
else {   
ganjil++;
}
if(b > 0) {
positif++;
}
if(b < 0) {
negatif++;
}
if(c%2==0) {
genap++;
}
else {   
ganjil++;
}
if(c > 0) {
positif++;
}
if(c < 0) {
negatif++;
}
if(d%2==0) {
genap++;
}
else {   
ganjil++;
}
if(d > 0) {
positif++;
}
if(d < 0) {
negatif++;
}
if(e%2==0) {
genap++;
}
else {  
ganjil++;
}
if(e > 0) {
positif++;
}
if(e < 0) {
negatif++;
}
    System.out.println(genap + " angka genap " );
    System.out.println(ganjil + " angka ganjil ");
    System.out.println(positif + " angka positif ");
    System.out.println(negatif + " angka negatif ");
}catch (Exception x){
    System.out.println("inputan tidak valid");
}

}

}