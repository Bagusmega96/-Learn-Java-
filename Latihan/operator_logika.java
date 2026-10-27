public class operator_logika{
    public static void main (String [] args){
        boolean kondisi1 = true;
        boolean kondisi2 = false;
        boolean hasilB;

        hasilB = kondisi1 && kondisi2;
        System.out.println("Hasil dari "+kondisi1+" AND "+kondisi2+" = "+hasilB);
        // Logika 1 AND 2

        hasilB = kondisi1 && kondisi2 && kondisi1;
        System.out.println("\nHasil dari "+kondisi1+" AND "+kondisi2+" AND "+kondisi1+" = "+hasilB);
        // Logika 1 AND 2 AND 1

        hasilB = kondisi1 || kondisi2;
        System.out.println("Hasil dari "+kondisi1+" || "+kondisi2+" = "+hasilB);
        // Logika 1 OR 2

    }
}
