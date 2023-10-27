import java.util.Scanner;

public class SimpleKalkulator {
    public static void main(String[] args) {
        System.out.println("Selamat datang di Kalkulator Sederhana!");
        System.out.println("====================================");

        Boolean loop = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "silahkan anda ingin memasukan operasi apa \n(1)pertambahan + \n(2)Pengurangan - \n(3)Perkalian * \n(4)Pembagian / \nSilahkan Pilih Salah Satu dengan memasukan Angka :");
        char operator = scanner.next().charAt(0);
        while (loop) {

            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();

            double hasil = 0.0;

            switch (operator) {
                case '1':
                    hasil = angka1 + angka2;
                    break;
                case '2':
                    hasil = angka1 - angka2;
                    break;
                case '3':
                    hasil = angka1 * angka2;
                    break;
                case '4':
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    } else {
                        System.out.println("Pembagian dengan nol tidak valid.");
                        System.exit(0);
                    }
                    break;

                default:
                    System.out.println("Operasi tidak valid.");
                    System.exit(0);
            }

            System.out.println("Hasil: " + hasil);
            System.out.println("Apakah Anda ingin mengulang atau keluar(Y/N)");
            String check = scanner.next();

            if (check.equals("N")) {
                loop = false;
            }
        }
        System.out.println("Terima Kasih Telah Menggunakan Kalkulator Sederhana!");
        scanner.close();
    }
}