import java.util.Scanner;

public class PemilihanBilangan19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) 
        {
            System.out.print("Angka " + angka + " termasuk bilangan genap");
        }
        else
        {
            System.out.print("Angka " + angka + " termasuk bilangan ganjil");
        }
    }
}