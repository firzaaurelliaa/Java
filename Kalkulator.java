import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2, hasilPenjumlahan, hasilPengurangan, hasilPerkalian;
        double hasilPembagian;

        System.out.print("Masukkan operator pertama : ");
        nilai1 = input.nextInt();

        System.out.print("Masukkan operator kedua : ");
        nilai2 = input.nextInt();

        hasilPenjumlahan = nilai1 + nilai2;
        hasilPengurangan = nilai1 - nilai2;

        hasilPembagian = (double) nilai1 / nilai2;

        hasilPerkalian = nilai1 * nilai2;

        System.out.println("Hasil Penjumlahan : " + hasilPenjumlahan);
        System.out.println("Hasil Pengurangan : " + hasilPengurangan);
        System.out.println("Hasil Pembagian : " + hasilPembagian);
        System.out.println("Hasil Perkalian : " + hasilPerkalian);

        input.close(); 
    }
}
