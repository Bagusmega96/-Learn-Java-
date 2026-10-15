import java.util.Scanner;

public class percabangan_if {
    public static void main (String [] args){

    final double PI = 3.14235;
    double jari_jari, luas;

    Scanner inputKey = new Scanner (System.in);

    System.out.print("Masukkan Bilangan : ");
    int bil1 = inputKey.nextInt();
    int sisa = bil1 % 2;

        if (sisa == 1){
            System.out.println("\nIni Bilangan ganjil");
        } else {
            System.out.println("\nIni Bilangan Genap");
        }
        
        if (bil1 == 100){
            System.out.println("Ini adalah bilangan sempurna");
        }

    System.out.print("Jari-jari Lingkaran : ");
    jari_jari = inputKey.nextInt();
    luas = PI * jari_jari * jari_jari;

    System.out.println("Luas Lingkaran itu adalah : "+luas);

    inputKey.close();
    
    }
}
