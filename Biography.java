public class Biography {
    private String Bio;
    private Boolean is_public;

    public Biography(String Bio, Boolean is_public) {
        this.Bio = Bio;
        this.is_public = is_public;
    }

    public void setBio(String Bio) {
        this.Bio = Bio;

    }

    public String getBio() {
        return Bio;
    }

    public void setis_public(Boolean is_public) {
        this.is_public = is_public;
    }

    public Boolean getis_public() {
        return is_public;
    }

}