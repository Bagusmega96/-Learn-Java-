import java.util.Scanner;

public class perulangan_for {
    public static void main (String [] args){
        Scanner inputKey = new Scanner (System.in);

        System.out.print("Masukkan Jumlah Perulangan : ");
        int jumlah_perulangan = inputKey.nextInt();

        for (int i=0; i<jumlah_perulangan; i++){
            System.out.println("Bilangan "+(i+1));
        }

        inputKey.close();
    }
}
