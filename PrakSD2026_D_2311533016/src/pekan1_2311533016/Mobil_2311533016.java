package pekan1_2311533016;

public class Mobil_2311533016 {

    private String nama;
    private int tahun;
    private int cc;
    private double harga;
    private String merk;

    // Konstruktor
    public Mobil_2311533016(String nama, int tahun, int cc, double harga, String merk) {
        this.nama = nama;
        this.tahun = tahun;
        this.cc = cc;
        this.harga = harga;
        this.merk = merk;
    }

    // Selector (Getter)
    public String getNama() {
        return nama;
    }

    public int getTahun() {
        return tahun;
    }

    public int getCc() {
        return cc;
    }

    public double getHarga() {
        return harga;
    }

    public String getMerk() {
        return merk;
    }

    // Mutator (Setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Method tambah mobil (simulasi)
    public void tambahMobil() {
        System.out.println("Mobil berhasil ditambahkan!");
    }

    // Method hapus mobil (simulasi)
    public void hapusMobil() {
        System.out.println("Mobil berhasil dihapus!");
    }

    // toString
    public String toString() {
        return nama + " | " + tahun + " | " + cc + "cc | Rp" + harga + " | " + merk;
    }
}