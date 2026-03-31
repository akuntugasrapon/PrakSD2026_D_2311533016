package pekan1_2311533016;

public class MobilDriver_2311533016 {
    public static void main(String[] args) {

        // Membuat objek mobil
        Mobil_2311533016 m1 = new Mobil_2311533016("Avanza", 2020, 1300, 150000000, "Toyota");

        // Menampilkan data
        System.out.println("Data Mobil:");
        System.out.println(m1);

        // Testing method
        m1.tambahMobil();
        m1.hapusMobil();

        // Testing mutator
        m1.setHarga(160000000);
        System.out.println("Harga setelah update:");
        System.out.println(m1);
    }
}