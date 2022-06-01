public class Biography {
    private String Bio;
    private boolean is_public;

    public Biography(String Bio, boolean is_public) {
        this.Bio = Bio;
        this.is_public = is_public;
    }

    public void setBio(String Bio) {
        this.Bio = Bio;
    }

    public void is_public() {
        this.is_public = true;
    }

    public String getBio() {
        return Bio;
    }

    public boolean getis_Public() {
        return is_public;
    }

}