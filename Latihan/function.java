
public class function {

    public static int hitungluaspersegi (int panjang, int lebar){
        int luas;
            luas = panjang * lebar;
            return luas;
    } 

    public static double hitungluassegitiga (double alas, double tinggi){
        double luas;
            luas = 0.5 * alas * tinggi;
            return luas;
    } 
    
    public static void tampilkanoutput (String namaobjek, int panjang, int lebar, int luas){
        String str = "";
        str = str + "> Luas "+namaobjek;
        str = str + "dengan panjang : "+panjang+" cm"; 
        str = str + " dan lebar : "+lebar+" cm";
        str = str + " adalah "+luas+" cm^2";
        System.out.println(str);
    } 

    public static void tampilkanoutput (String namaobjek, double alas, double tinggi, double luas){
        String str = "";
        str = str + "> Luas "+namaobjek;
        str = str + " dengan alas : "+alas+" cm"; 
        str = str + " dan tinggi : "+tinggi+" cm";
        str = str + " adalah "+luas+" cm^2";
        System.out.println(str);
    }

    public static void main (String [] args){
        int panjang1 = 20;
        int lebar1 = 4;

        int panjang2 = 30;
        int lebar2 = 3;
        
        int alas = 10;
        int tinggi = 6;

        int luas = hitungluaspersegi(panjang1, lebar1);
        tampilkanoutput("Persegi Panjang 1 ", panjang1, lebar1, luas);
        luas = hitungluaspersegi(panjang2, lebar2);
        tampilkanoutput("Persegi Panjang 2 ", panjang2, lebar2, luas);
        double luas2 = hitungluassegitiga(alas, tinggi);
        tampilkanoutput("Segitiga", alas, tinggi, luas2);
        
    }
}
