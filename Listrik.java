import java.util.Scanner;

public class Listrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kwhAwal = 8000;
        int kwhAkhir = 9000;
        int beban = 140;
        int PPJ = 10;

        System.out.println("===================PLN Java===================");
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Kelurahan : ");
        String kelurahan = input.nextLine();
        System.out.print("Masukkan posisi awal Kwh Meter : ");
        kwhAwal = input.nextInt();
        System.out.print("Masukkan posisi akhir Kwh Meter : ");
        kwhAkhir = input.nextInt();
        System.out.print("Masukkan biaya beban saat ini : ");
        beban = input.nextInt();
        System.out.print("Masukkan PPJ (dalam persen): ");
        PPJ = input.nextInt();

        int pemakaian = kwhAkhir - kwhAwal;
        int tarifListrik = pemakaian * beban;
        int ppj = (tarifListrik * PPJ) / 100;
        int totalBayar = tarifListrik + ppj;

        System.out.println("==============================================");
        System.out.println("Nama : " + nama);
        System.out.println("Kelurahan : " + kelurahan);
        System.out.println("Pemakaian bulan ini : " + pemakaian + " Kwh Meter");
        System.out.println("Tarif Listrik : Rp " + tarifListrik + ",-");
        System.out.println("PPJ " + PPJ + "% : Rp " + ppj + ",-");
        System.out.println("Total Bayar : Rp " + totalBayar + ",-");
        System.out.println("==============================================");

        input.close();
    }
}
