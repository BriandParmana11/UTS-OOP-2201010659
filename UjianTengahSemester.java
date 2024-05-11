package ujiantengahsemester;

import java.util.Scanner;

/**
 *
 * @author briandparmana 2201010659
 * TGL: 2024-05-07
 */
public class UjianTengahSemester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PembelianiPhone[] pembelianiPhones = new PembelianiPhone[10];
        int count = 0;

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Menu Aplikasi iBox");
            System.out.println("------------------");
            System.out.println("1. Pencatatan Pembelian iPhone");
            System.out.println("2. Menampilkan Data Pembelian iPhone");
            System.out.println("3. Mengubah Data Pembelian iPhone");
            System.out.println("4. Menghapus Data Pembelian iPhone");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Serial Number: ");
                    String serialNumber = scanner.nextLine();
                    System.out.print("Masukkan Model: ");
                    String model = scanner.nextLine();
                    System.out.print("Masukkan Harga: ");
                    double harga = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    pembelianiPhones[count] = new PembelianiPhone(serialNumber, model, harga);
                    count++;
                    break;
                case 2:
                    System.out.println("Data Pembelian iPhone: ");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + pembelianiPhones[i]);
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nomor data yang ingin diubah: ");
                    int indexToEdit = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume newline
                    if (indexToEdit >= 0 && indexToEdit < count) {
                        System.out.print("Masukkan Serial Number baru: ");
                        pembelianiPhones[indexToEdit].setSerialNumber(scanner.nextLine());
                        System.out.print("Masukkan Model baru: ");
                        pembelianiPhones[indexToEdit].setModel(scanner.nextLine());
                        System.out.print("Masukkan Harga baru: ");
                        pembelianiPhones[indexToEdit].setHarga(scanner.nextDouble());
                        scanner.nextLine(); // Consume newline
                        System.out.println("Data berhasil diubah.");
                    } else {
                        System.out.println("Nomor data tidak valid.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nomor data yang ingin dihapus: ");
                    int indexToDelete = scanner.nextInt() - 1;
                    if (indexToDelete >= 0 && indexToDelete < count) {
                        for (int i = indexToDelete; i < count - 1; i++) {
                            pembelianiPhones[i] = pembelianiPhones[i + 1];
                        }
                        count--;
                        System.out.println("Data berhasil dihapus.");
                    } else {
                        System.out.println("Nomor data tidak valid.");
                    }
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        }
        scanner.close();
    }
}
