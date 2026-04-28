package pekan3_2311533016;

public class Website_2311533016 {

    private String judul_3016;
    private String url_3016;

    // Constructor
    public Website_2311533016(String judul, String url) {
        this.judul_3016 = judul;
        this.url_3016 = url;
    }

    // Getter
    public String getJudul() {
        return judul_3016;
    }

    public String getUrl() {
        return url_3016;
    }

    // Setter
    public void setJudul(String judul) {
        this.judul_3016 = judul;
    }

    public void setUrl(String url) {
        this.url_3016 = url;
    }

    // toString
    public String toString() {
        return "Judul: " + judul_3016 + ", URL: " + url_3016;
    }
}