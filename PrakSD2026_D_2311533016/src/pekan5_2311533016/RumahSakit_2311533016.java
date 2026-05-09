package pekan5_2311533016;

import java.util.Scanner;

public class RumahSakit_2311533016 {

    static Pasien_2311533016 head_3016 = null;
    static int counter_3016 = 0;

    // insert tail
    public static void daftarPasien_3016(String nama_3016, String keluhan_3016) {

        counter_3016++;

        Pasien_2311533016 pasienBaru_3016 =
                new Pasien_2311533016(
                        nama_3016,
                        keluhan_3016,
                        counter_3016);

        // jika list kosong
        if (head_3016 == null) {
            head_3016 = pasienBaru_3016;
        } else {

            Pasien_2311533016 temp_3016 = head_3016;

            while (temp_3016.next_3016 != null) {
                temp_3016 = temp_3016.next_3016;
            }

            temp_3016.next_3016 = pasienBaru_3016;
        }

        System.out.println(
                "Pasien berhasil didaftarkan! Nomor Antrian: "
                        + counter_3016);
    }

    // delete head
    public static void panggilPasien_3016() {

        if (head_3016 == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Pasien dipanggil:");
        System.out.println("Nama : "
                + head_3016.getNamaPasien_3016());

        System.out.println("Keluhan : "
                + head_3016.getKeluhan_3016());

        System.out.println("Nomor Antrian : "
                + head_3016.getNomorAntrian_3016());

        head_3016 = head_3016.next_3016;
    }

    // display
    public static void tampilkanAntrian_3016() {

        if (head_3016 == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        Pasien_2311533016 temp_3016 = head_3016;

        System.out.println("=== DAFTAR ANTRIAN ===");

        while (temp_3016 != null) {

            System.out.println(
                    "No: "
                            + temp_3016.getNomorAntrian_3016());

            System.out.println(
                    "Nama: "
                            + temp_3016.getNamaPasien_3016());

            System.out.println(
                    "Keluhan: "
                            + temp_3016.getKeluhan_3016());

            System.out.println("--------------------");

            temp_3016 = temp_3016.next_3016;
        }
    }

    // search
    public static void cariPasien_3016(String cari_3016) {

        Pasien_2311533016 temp_3016 = head_3016;

        boolean ditemukan_3016 = false;

        while (temp_3016 != null) {

            if (temp_3016.getNamaPasien_3016()
                    .equalsIgnoreCase(cari_3016)) {

                System.out.println("Pasien ditemukan!");
                System.out.println(
                        "Nomor Antrian: "
                                + temp_3016.getNomorAntrian_3016());

                System.out.println(
                        "Keluhan: "
                                + temp_3016.getKeluhan_3016());

                ditemukan_3016 = true;
                break;
            }

            temp_3016 = temp_3016.next_3016;
        }

        if (!ditemukan_3016) {
            System.out.println("Pasien tidak ditemukan!");
        }
    }

    // status antrian
    public static void cekStatusAntrian_3016() {

        if (head_3016 == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        int jumlah_3016 = 0;

        Pasien_2311533016 temp_3016 = head_3016;

        while (temp_3016 != null) {
            jumlah_3016++;
            temp_3016 = temp_3016.next_3016;
        }

        System.out.println("Jumlah pasien: " + jumlah_3016);

        System.out.println(
                "Pasien terdepan: "
                        + head_3016.getNamaPasien_3016());
    }

    // main
    public static void main(String[] args) {

        Scanner input_3016 = new Scanner(System.in);

        int pilihan_3016;

        do {

            System.out.println(
                    "\n=== Antrian Rumah Sakit 2311533016 ===");

            System.out.println("1. Daftarkan Pasien");
            System.out.println("2. Panggil Pasien");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Cari Pasien");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");

            System.out.print("Pilihan: ");
            pilihan_3016 = input_3016.nextInt();
            input_3016.nextLine();

            switch (pilihan_3016) {

                case 1:

                    System.out.print("Nama Pasien: ");
                    String nama_3016 =
                            input_3016.nextLine();

                    System.out.print("Keluhan: ");
                    String keluhan_3016 =
                            input_3016.nextLine();

                    daftarPasien_3016(
                            nama_3016,
                            keluhan_3016);

                    break;

                case 2:

                    panggilPasien_3016();
                    break;

                case 3:

                    tampilkanAntrian_3016();
                    break;

                case 4:

                    System.out.print(
                            "Masukkan nama pasien: ");

                    String cari_3016 =
                            input_3016.nextLine();

                    cariPasien_3016(cari_3016);

                    break;

                case 5:

                    cekStatusAntrian_3016();
                    break;

                case 6:

                    System.out.println("Program selesai");
                    break;

                default:

                    System.out.println("Pilihan tidak valid");
            }

        } while (pilihan_3016 != 6);

        input_3016.close();
    }
}