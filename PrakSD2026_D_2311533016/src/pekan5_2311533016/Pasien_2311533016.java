package pekan5_2311533016;

public class Pasien_2311533016 {

    private String namaPasien_3016;
    private String keluhan_3016;
    private int nomorAntrian_3016;

    Pasien_2311533016 next_3016;

    // constructor
    public Pasien_2311533016(String namaPasien_3016,
            String keluhan_3016,
            int nomorAntrian_3016) {

        this.namaPasien_3016 = namaPasien_3016;
        this.keluhan_3016 = keluhan_3016;
        this.nomorAntrian_3016 = nomorAntrian_3016;
        this.next_3016 = null;
    }

    // getter
    public String getNamaPasien_3016() {
        return namaPasien_3016;
    }

    public String getKeluhan_3016() {
        return keluhan_3016;
    }

    public int getNomorAntrian_3016() {
        return nomorAntrian_3016;
    }

    public Pasien_2311533016 getNext_3016() {
        return next_3016;
    }

    // setter
    public void setNamaPasien_3016(String namaPasien_3016) {
        this.namaPasien_3016 = namaPasien_3016;
    }

    public void setKeluhan_3016(String keluhan_3016) {
        this.keluhan_3016 = keluhan_3016;
    }

    public void setNomorAntrian_3016(int nomorAntrian_3016) {
        this.nomorAntrian_3016 = nomorAntrian_3016;
    }

    public void setNext_3016(Pasien_2311533016 next_3016) {
        this.next_3016 = next_3016;
    }
}