package pekan3_2311533016;

import java.util.Stack;
import java.util.Scanner;

public class Browser_2311533016 {

    public static void main(String[] args) {

        Stack<Website_2311533016> history = new Stack<>();
        Scanner input = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("\n=== Browser History NIM: 2311533016 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine(); // penting

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();

                    System.out.print("Masukkan URL: ");
                    String url = input.nextLine();

                    history.push(new Website_2311533016(judul, url));
                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    if (!history.isEmpty()) {
                        Website_2311533016 removed = history.pop();
                        System.out.println("Kembali dari: " + removed.getJudul());
                    } else {
                        System.out.println("History kosong.");
                    }
                    break;

                case 3:
                    if (!history.isEmpty()) {
                        System.out.println("Halaman aktif: " + history.peek());
                    } else {
                        System.out.println("Tidak ada halaman aktif.");
                    }
                    break;

                case 4:
                    if (history.isEmpty()) {
                        System.out.println("History kosong.");
                    } else {
                        System.out.println("Jumlah history: " + history.size());
                    }
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 5);

        input.close();
    }
}