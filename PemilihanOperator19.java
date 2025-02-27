import java.util.Scanner;

public class PemilihanOperator19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angka1, angka2, hasil = 0;
        char operator;

        System.out.print("Masukkan angka 1: ");
        angka1 = sc.nextDouble();
        System.out.print("Masukkan angka 2: ");
        angka2 = sc.nextDouble();
        System.out.print("Masukkan operator (+ - * /): ");
        operator = sc.next().charAt(0);

        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                return; // Menghentikan program jika terjadi pembagian dengan nol
            }
        } else {
            System.out.println("Operator yang dipilih tidak sesuai. Silakan pilih +, -, *, atau /.");
            return; // Menghentikan program jika operator tidak valid
        }

        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
    }
}