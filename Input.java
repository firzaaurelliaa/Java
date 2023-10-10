import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nilai1, nilai2, hasil;
        System.out.print("masukkan nilai 1 : ");
        nilai1 = input.nextInt();
        System.out.print("masukkan nilai 2 : ");
        nilai2 = input.nextInt();
        hasil = nilai1 + nilai2;
        System.out.println("maka hasil penjumlahannya adalah : " + hasil);
        System.out.println("Nama : Firza Aurellia Iskandar");
        System.out.println("NIM : 235150600111001");
        input.close();
    }
    
}
