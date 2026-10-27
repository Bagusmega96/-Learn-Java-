/**
 * ============================================================================
 * NAMA PROGRAM  : Sistem Rekapitulasi Tagihan Internet
 * DESKRIPSI     : Program berbasis CLI untuk merekapitulasi dan 
 *                 menghitung tagihan sewa internet pelanggan.
 * 
 * PENJELASAN    :
 * 
 * 1. Inisiasi  : Admin memasukkan jumlah total pelanggan yang akan diproses 
 *                untuk satu sesi rekapitulasi.
 * 2. Input     : Untuk setiap pelanggan, admin memasukkan nama, durasi pemakaian 
 *                internet (dalam hari), dan pemakaian kuota (GB) untuk setiap 
 *                hari selama durasi tersebut.
 * 3. Validasi  : Saat input harian, sistem akan menolak angka pemakaian di 
 *                luar rentang batas wajar (wajib di antara 1 - 50 GB/hari).
 * 4. Kalkulasi : Di akhir input per pelanggan, sistem menghitung total biaya
 *                berdasarkan total pemakaian, dengan tarif berlaku untuk
 *                seluruh pemakaian (bukan hanya kelebihannya):
 *                - Tier Normal (Total <= 50 GB) : Rp 2.000/GB
 *                - Tier Tinggi (Total > 50 GB)  : Rp 2.500/GB
 * 5. Output    : Sistem mencetak "Invoice" tagihan per pelanggan, dan setelah 
 *                semua selesai, mencetak "Laporan Keuangan".
 * ============================================================================
 */


import java.util.Scanner;

public class KalkulasiTagihanInternet {
    public static void main (String [] args){
        // Deklarasi Variable
        int jumlah_pelanggan015, jumlah_hari015, pemakaian_harian015, kategori_normal015, kategori_tinggi015, urutan_pelanggan015, total_pemakaian015, I015, J015;
        double pendapatan015, biaya015;
        String nama_pelanggan015, kategori015;

        Scanner inputMasukan015 = new Scanner (System.in);

        // Header 
        System.out.println("=================================================");
        System.out.println("           REKAPITULASI TAGIHAN INTERNET         ");
        System.out.println("=================================================");

        // Total Pelanggan yang akan di-input
        do {
        System.out.print("> Masukkan Total Pelanggan yang akan direkap (orang) : ");
        jumlah_pelanggan015 = inputMasukan015.nextInt();
        } while (jumlah_pelanggan015 < 1);
       
        inputMasukan015.nextLine();

        // Menyimpan jumlah pelanggan awal untuk perhitungan rata-rata di laporan akhir
        I015 = jumlah_pelanggan015;

        // Inisialisasi Nilai Variable
        pendapatan015 = 0;
        kategori_normal015 = 0;
        kategori_tinggi015 = 0;
        urutan_pelanggan015 = 1;

        // Perulangan pertama : Memproses setiap pelanggan
        while (jumlah_pelanggan015 > 0){
            System.out.println("\n--- Input Data Pelanggan Ke-" + urutan_pelanggan015 + " dari " + I015 + " ---");
            System.out.print("\n> Masukkan Nama Pelanggan : ");
            nama_pelanggan015 = inputMasukan015.nextLine();

            // Durasi Sewa (dalam satuan hari)
            do {
            System.out.print("> Total Durasi Pemakaian (Hari): ");
            jumlah_hari015 = inputMasukan015.nextInt();
            } while (jumlah_hari015 < 1);

            // Mereset total pemakaian menjadi 0 agar tidak bercampur dengan data pelanggan sebelumnya
            total_pemakaian015 = 0;

            // Perulangan untuk input pemakaian pelanggan per hari
            for (J015 = 0; J015<jumlah_hari015; J015++){
                do {
                    System.out.print("> Masukkan Pemakaian Internet (GB) dalam sehari : ");
                    pemakaian_harian015 = inputMasukan015.nextInt();
                } while (pemakaian_harian015 < 1 || pemakaian_harian015 > 50);
                total_pemakaian015 = total_pemakaian015 + pemakaian_harian015;
            }

            inputMasukan015.nextLine();
            
            // Penentuan kategori dan kalkulasi biaya sesuai Tier Kategori
            if (total_pemakaian015 <= 50){
                biaya015 = total_pemakaian015 * 2000;
                kategori015 = "Normal";
                kategori_normal015 = kategori_normal015 + 1;
            } else {
                biaya015 = total_pemakaian015 * 2500;
                kategori015 = "Tinggi";
                kategori_tinggi015 = kategori_tinggi015 + 1;
            }

            // Output rincian tagihan individual
            System.out.println("\n=================================================");
            System.out.println("                 INVOICE "+ nama_pelanggan015.toUpperCase());
            System.out.println("===================================================");
            System.out.println("Nama Pelanggan  : " + nama_pelanggan015);
            System.out.println("Total Pemakaian : " + total_pemakaian015 + " GB");
            System.out.println("Kategori        : " + kategori015);
            System.out.println("Total Tagihan   : Rp " + biaya015);
            System.out.println("===================================================");

            // Akumulasi data untuk Laporan Akhir 
            pendapatan015 = pendapatan015 + biaya015;
            jumlah_pelanggan015 = jumlah_pelanggan015 - 1;
            urutan_pelanggan015 = urutan_pelanggan015 + 1;
        }

        // Output rekapitulasi performa bisnis
        System.out.println("\n=================================================");
        System.out.println("                 LAPORAN KEUANGAN                  ");
        System.out.println("===================================================");
        System.out.println("Total Pelanggan Diproses : " + I015 + " Pelanggan");
        System.out.println("Pengguna Tier Normal     : " + kategori_normal015 + " Orang");
        System.out.println("Pengguna Tier Tinggi     : " + kategori_tinggi015 + " Orang");
        System.out.println("Pendapatan               : Rp " + pendapatan015);
        System.out.println("Rata - Rata Pendapatan   : Rp " + (pendapatan015 / I015));
        System.out.println("===================================================\n");
        
        inputMasukan015.close();
    }
}
