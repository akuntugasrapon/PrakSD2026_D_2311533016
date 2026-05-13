package pekan6_2311533016;

import java.util.Scanner;

public class Musik_2311533016 {

    Lagu_2311533016 head_3016;
    Lagu_2311533016 tail_3016;

    // tambah lagu di akhir
    public void tambahLagu_3016(String judul_3016, String penyanyi_3016) {

        Lagu_2311533016 laguBaru_3016 =
                new Lagu_2311533016(judul_3016, penyanyi_3016);

        if (head_3016 == null) {

            head_3016 = laguBaru_3016;
            tail_3016 = laguBaru_3016;

        } else {

            tail_3016.next_3016 = laguBaru_3016;
            laguBaru_3016.prev_3016 = tail_3016;

            tail_3016 = laguBaru_3016;
        }

        System.out.println("Lagu berhasil ditambahkan!");
    }

    // hapus lagu pertama
    public void hapusLaguAwal_3016() {

        if (head_3016 == null) {

            System.out.println("Playlist kosong!");
            return;
        }

        System.out.println("Lagu "
                + head_3016.judul_3016
                + " berhasil dihapus");

        head_3016 = head_3016.next_3016;

        if (head_3016 != null) {
            head_3016.prev_3016 = null;
        } else {
            tail_3016 = null;
        }
    }

    // tampil maju
    public void tampilMaju_3016() {

        if (head_3016 == null) {

            System.out.println("Playlist kosong!");
            return;
        }

        Lagu_2311533016 curr_3016 = head_3016;

        System.out.println("\n=== Playlist Maju ===");

        while (curr_3016 != null) {

            System.out.println(
                    curr_3016.judul_3016
                    + " - "
                    + curr_3016.penyanyi_3016);

            curr_3016 = curr_3016.next_3016;
        }
    }

    // tampil mundur
    public void tampilMundur_3016() {

        if (tail_3016 == null) {

            System.out.println("Playlist kosong!");
            return;
        }

        Lagu_2311533016 curr_3016 = tail_3016;

        System.out.println("\n=== Playlist Mundur ===");

        while (curr_3016 != null) {

            System.out.println(
                    curr_3016.judul_3016
                    + " - "
                    + curr_3016.penyanyi_3016);

            curr_3016 = curr_3016.prev_3016;
        }
    }

    // cari lagu
    public void cariLagu_3016(String judulCari_3016) {

        Lagu_2311533016 curr_3016 = head_3016;

        while (curr_3016 != null) {

            if (curr_3016.judul_3016
                    .equalsIgnoreCase(judulCari_3016)) {

                System.out.println("Lagu ditemukan!");
                System.out.println(
                        curr_3016.judul_3016
                        + " - "
                        + curr_3016.penyanyi_3016);

                return;
            }

            curr_3016 = curr_3016.next_3016;
        }

        System.out.println("Lagu tidak ditemukan!");
    }

    public static void main(String[] args) {

        Scanner input_3016 = new Scanner(System.in);

        Musik_2311533016 playlist_3016 =
                new Musik_2311533016();

        int pilihan_3016;

        do {

            System.out.println("\n=== Playlist Musik NIM: 2311533016 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");

            System.out.print("Pilihan: ");
            pilihan_3016 = input_3016.nextInt();
            input_3016.nextLine();

            switch (pilihan_3016) {

                case 1:

                    System.out.print("Judul Lagu: ");
                    String judul_3016 =
                            input_3016.nextLine();

                    System.out.print("Penyanyi: ");
                    String penyanyi_3016 =
                            input_3016.nextLine();

                    playlist_3016.tambahLagu_3016(
                            judul_3016,
                            penyanyi_3016);

                    break;

                case 2:

                    playlist_3016.hapusLaguAwal_3016();

                    break;

                case 3:

                    playlist_3016.tampilMaju_3016();

                    break;

                case 4:

                    playlist_3016.tampilMundur_3016();

                    break;

                case 5:

                    System.out.print("Masukkan judul lagu: ");

                    String cari_3016 =
                            input_3016.nextLine();

                    playlist_3016.cariLagu_3016(cari_3016);

                    break;

                case 6:

                    System.out.println("Program selesai");
                    break;

                default:

                    System.out.println("Pilihan tidak tersedia");
            }

        } while (pilihan_3016 != 6);

        input_3016.close();
    }
}