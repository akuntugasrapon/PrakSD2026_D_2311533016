package pekan2_2311533016;

public class Musik_2311533016 {

    private String judul_3016;
    private String penyanyi_3016;
    private int durasi_3016;

    public Musik_2311533016(String judul, String penyanyi, int durasi) {
        this.judul_3016 = judul;
        this.penyanyi_3016 = penyanyi;
        this.durasi_3016 = durasi;
    }

    public String getJudul() {
        return judul_3016;
    }

    public String getPenyanyi() {
        return penyanyi_3016;
    }

    public int getDurasi() {
        return durasi_3016;
    }

    public void setJudul(String judul) {
        this.judul_3016 = judul;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi_3016 = penyanyi;
    }

    public void setDurasi(int durasi) {
        this.durasi_3016 = durasi;
    }

    public String toString() {
        return "Judul: " + judul_3016 +
               ", Penyanyi: " + penyanyi_3016 +
               ", Durasi: " + durasi_3016 + " detik";
    }
}