
public class Percabangan {
    public static void main(String[] args) {
        int gender = 8;

        if (gender ==1) {
            System.out.println("Gender saya laki laki");
        } else if (gender == 0){
            System.out.println("gender saya perempuan");
        } else {
            System.out.println("Gender tidak terdefinisikan");
        }
    }
}


// import java.util.Scanner;

// public class Percabangan {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         String player1, player2, hasil;
//         // System.out.print("player 1 : ");
//         player1 = input.nextLine();
//         // System.out.print("player 2 : ");
//         player2 = input.nextLine();

        

//         if (player1.equals(player2)) {
//             hasil = "DRAW";
//         } else if ((player1.equals("BATU") && player2.equals("GUNTING")) ||
//                    (player1.equals("GUNTING") && player2.equals("KERTAS")) ||
//                    (player1.equals("KERTAS") && player2.equals("BATU"))) {
//             hasil = "PLAYER 1 MENANG!";
//         } else {
//             hasil = "PLAYER 2 MENANG!";
//         }

//         System.out.println(hasil);
//         input.close();
//     }
// }