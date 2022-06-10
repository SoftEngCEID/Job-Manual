public class History{
    private String Job_title;
    private boolean Is_verified = false;

    public History(String Job_title, Boolean Is_verified){
        this.Job_title = Job_title;
        this.Is_verified = Is_verified;
    }

    public void verify(){
        Is_verified = true;
    }

    public String getHistory(){
        return Job_title;
    }
    public boolean Is_verified(){
        return Is_verified;
    }

}
