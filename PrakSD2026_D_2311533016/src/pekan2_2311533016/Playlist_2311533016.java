package pekan2_2311533016;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2311533016 {

    public static void main(String[] args) {
        ArrayList<Musik_2311533016> playlist = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("\n=== Playlist Musik ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Lihat Playlist");
            System.out.println("3. Hapus Lagu");
            System.out.println("4. Cek Jumlah Lagu");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine(); // penting

            switch (pilihan) {

                case 1:
                    System.out.print("Judul: ");
                    String judul = input.nextLine();

                    System.out.print("Penyanyi: ");
                    String penyanyi = input.nextLine();

                    System.out.print("Durasi (detik): ");
                    int durasi = input.nextInt();
                    input.nextLine();

                    playlist.add(new Musik_2311533016(judul, penyanyi, durasi));
                    System.out.println("Lagu berhasil ditambahkan!");
                    break;

                case 2:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist kosong.");
                    } else {
                        for (int i = 0; i < playlist.size(); i++) {
                            System.out.println(i + ". " + playlist.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Masukkan index lagu yg ingin dihapus: ");
                    int index = input.nextInt();
                    input.nextLine();

                    if (index >= 0 && index < playlist.size()) {
                        playlist.remove(index);
                        System.out.println("Lagu berhasil dihapus!");
                    } else {
                        System.out.println("Index tidak valid.");
                    }
                    break;

                case 4:
                    System.out.println("Jumlah lagu: " + playlist.size());
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