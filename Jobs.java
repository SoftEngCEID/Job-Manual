public class Jobs {
    private String Job_title;
    private String Description;

    public Jobs(String Job_title, String Description) {
        this.Job_title = Job_title;
        this.Description = Description;
    }

    public void setJob_title(String Job_title) {
        this.Job_title = Job_title;

    }

    public String getJob_title() {
        return Job_title;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getDescription() {
        return Description;
    }

}