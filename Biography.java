public class Biography {
    String Bio;
    String is_public;

    public Biography(String Bio, String is_public) {
        this.Bio = Bio;
        this.is_public = is_public;
    }

    public void setBio(String Bio) {
        this.Bio = Bio;
    }

    public void is_public(String is_public) {
        this.is_public = is_public;
    }

    public String getBio() {
        return Bio;
    }

    public String getis_Public() {
        return is_public;
    }

}