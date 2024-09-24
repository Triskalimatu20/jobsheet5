import java.util.Scanner;

public class PemilihanHariDenganIf19 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner sc = new Scanner(System.in);
        int dayNumber;

        // Meminta pengguna untuk memasukkan angka
        System.out.print("Input a number (1-7): ");
        dayNumber = sc.nextInt();

        // Menentukan tipe hari berdasarkan input bilangan bulat
        if (dayNumber >= 1 && dayNumber <= 5) {
            System.out.println("Weekday");
        } else if (dayNumber == 6 || dayNumber == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
    }
}