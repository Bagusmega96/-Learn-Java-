/*
    Program Penjumlahan, Pengurangan, dan Perkalian dua bilangan menggunakan keyword While(...)
*/

import java.util.Scanner;

public class Program_Perulangan {
    public static void main (String [] args){
        
        Scanner inputint = new Scanner (System.in);
        
        int pilihan = 0;
        int bil1 = 0;
        int bil2 = 0;
        int hasil = 0; 

        while (pilihan!=4){
            System.out.println();
            System.out.println("==============================");
            System.out.println("         Menu Program         ");
            System.out.println("  1. Penjumlahan 2 Bilangan   ");
            System.out.println("  2. Pengurangan 2 Bilangan   ");
            System.out.println("  3. Perkalian 2 Bilangan     ");
            System.out.println("  4. Keluar Program           ");
            System.out.println("==============================");
            System.out.println();
            
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = inputint.nextInt();

            if (pilihan == 1){
                System.out.println("=== Program Penjumlahan 2 Bilangan ===");
                System.out.print("\n> Masukkan Bilangan Pertama : ");
                bil1 = inputint.nextInt();

                System.out.print("> Masukkan Bilangan Kedua : ");
                bil2 = inputint.nextInt();

                hasil = bil1 + bil2;

                System.out.println("\nHasil dari "+bil1+"+"+bil2+" = "+hasil);
                System.out.println();
                System.out.println();

            } else if (pilihan == 2){ 
                System.out.println("=== Program Pengurangan 2 Bilangan ===");
                System.out.print("\n> Masukkan Bilangan Pertama : ");
                bil1 = inputint.nextInt();

                System.out.print("> Masukkan Bilangan Kedua : ");
                bil2 = inputint.nextInt();

                hasil = bil1 - bil2;

                System.out.println("\nHasil dari "+bil1+"-"+bil2+" = "+hasil);
                System.out.println();
                System.out.println();
                
            } else if (pilihan == 3){
                System.out.println("=== Program Perkalian 2 Bilangan ===");
                System.out.print("\n> Masukkan Bilangan Pertama : ");
                bil1 = inputint.nextInt();

                System.out.print("> Masukkan Bilangan Kedua : ");
                bil2 = inputint.nextInt();

                hasil = bil1 * bil2;

                System.out.println("\nHasil dari "+bil1+"x"+bil2+" = "+hasil);
                System.out.println();
                System.out.println();
            } else {
                System.out.println("Anda Keluar dari Program...");
            }

        }

        inputint.close();
    }
}