package pekan2_2311533016;

import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaDriver_2311533016 {

    // 1. Menu
    public static void tampilkanMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Tampilkan Semua Mahasiswa");
        System.out.println("3. Hapus Mahasiswa Berdasarkan NIM");
        System.out.println("4. Cari Mahasiswa Berdasarkan NIM");
        System.out.println("5. Keluar");
    }

    // 2. Tambah mahasiswa
    public static void tambahMahasiswa(ArrayList<Mahasiswa_2311533016> list, Scanner sc) {
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan Prodi: ");
        String prodi = sc.nextLine();

        list.add(new Mahasiswa_2311533016(nim, nama, prodi));
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    // 3. Tampilkan semua
    public static void tampilkanSemuaMahasiswa(ArrayList<Mahasiswa_2311533016> list) {
        if (list.isEmpty()) {
            System.out.println("Daftar mahasiswa kosong.");
        } else {
            System.out.println("Data Mahasiswa:");
            for (Mahasiswa_2311533016 mhs : list) {
                System.out.println(mhs);
            }
        }
    }

    // 4. Hapus mahasiswa
    public static void hapusMahasiswa(ArrayList<Mahasiswa_2311533016> list, Scanner sc) {
        System.out.print("Masukkan NIM yang akan dihapus: ");
        String nimHapus = sc.nextLine();

        boolean removed = list.removeIf(mhs -> mhs.nim.equals(nimHapus));

        if (removed) {
            System.out.println("Data dengan NIM " + nimHapus + " berhasil dihapus.");
        } else {
            System.out.println("NIM tidak ditemukan.");
        }
    }

    // 5. Cari mahasiswa
    public static void cariMahasiswa(ArrayList<Mahasiswa_2311533016> list, Scanner sc) {
        System.out.print("Masukkan NIM yang dicari: ");
        String nimCari = sc.nextLine();

        boolean ditemukan = false;

        for (Mahasiswa_2311533016 mhs : list) {
            if (mhs.nim.equals(nimCari)) {
                System.out.println("Hasil Pencarian: " + mhs);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("NIM tidak ada.");
        }
    }

    // MAIN
    public static void main(String[] args) {
        ArrayList<Mahasiswa_2311533016> mahasiswaList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            tampilkanMenu();
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // penting!

            switch (choice) {
                case 1:
                    tambahMahasiswa(mahasiswaList, scanner);
                    break;
                case 2:
                    tampilkanSemuaMahasiswa(mahasiswaList);
                    break;
                case 3:
                    hapusMahasiswa(mahasiswaList, scanner);
                    break;
                case 4:
                    cariMahasiswa(mahasiswaList, scanner);
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (choice != 5);

        scanner.close();
    }
}