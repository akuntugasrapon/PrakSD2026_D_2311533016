package pekan2_2311533016;

import java.util.ArrayList;

public class DaftarKata_2311533016 {
    private final ArrayList<String> data;

    // Konstruktor: inisialisasi list kosong
    public DaftarKata_2311533016() {
        this.data = new ArrayList<>();
    }

    /** Menambahkan elemen di akhir list. */
    public void tambah(String elemen) {
        data.add(elemen);
    }

    /** Menambahkan elemen pada indeks tertentu (menyisipkan). */
    public void tambahPada(int index, String elemen) {
        data.add(index, elemen);
    }

    /**
     * Mengubah elemen pada posisi 'index' menjadi 'nilaiBaru'.
     * Bertindak sebagai "setter" untuk elemen tertentu.
     */
    public void ubahElemen(int index, String nilaiBaru) {
        data.set(index, nilaiBaru);
    }

    /**
     * Menghapus elemen pada posisi 'index' dan mengembalikan nilai yang dihapus.
     */
    public String hapusElemen(int index) {
        return data.remove(index);
    }

    /**
     * Melakukan iterasi dan mencetak setiap elemen dalam format: [index] nilai
     */
    public void tampilkan() {
        for (int i = 0; i < data.size(); i++) {
            System.out.println("[" + i + "] " + data.get(i));
        }
    }


    public void iterasiCetak() {
        for (int i = 0; i < data.size(); i++) {
            System.out.print(data.get(i) + " ");
        }
    }

    /** Mengambil elemen berdasarkan indeks. */
    public String get(int index) {
        return data.get(index);
    }

    /** Representasi string agar mudah dicetak */
    @Override
    public String toString() {
        return data.toString();
    }
}