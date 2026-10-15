import java.util.Scanner;

public class switchcase {
    public static void main (String [] args){
        Scanner Inputkey = new Scanner (System.in);

        System.out.print("Masukkan Hari dalam Angka : ");
        int angka = Inputkey.nextInt();
            String hari = "";
            switch (angka){
                case 1: hari = "Hari Senin";
                    break;
                case 2: hari = "Hari Selasa";
                    break;
                case 3: hari = "Hari Rabu";
                    break;
                case 4: hari = "Hari Kamis";
                    break;
                case 5: hari = "hari Jumat";
                    break;
                case 6: hari = "Hari Sabtu";
                    break;
                case 7: hari = "hari Minggu";
                    break;
            }
        System.out.println("Yang anda inputkan adalah "+hari);

        Inputkey.close();
    }
}
