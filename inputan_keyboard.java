import java.util.Scanner;

public class inputan_keyboard {
    public static void main (String [] args){
        Scanner inputKey = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama_mahasiswa = inputStr.nextLine();

        System.out.print("Masukkan Bilangan Pertama : ");
        int bil1 = inputKey.nextInt();

        System.out.print("Masukkan Bilangan Kedua : ");
        int bil2 = inputKey.nextInt();


        int hasil = bil1 + bil2;
        System.out.println();
        System.out.println();
        System.out.println("Nama Mahasiswa : "+nama_mahasiswa);
        System.out.println("Hasil Penjumlahan "+bil1+" + "+bil2+" = "+hasil);

        inputKey.close();
        inputStr.close();

    }
}
