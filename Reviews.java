public class Reviews {
    private String review;
    private int stars;

    //constructor
    public Reviews(String review, int stars){
        this.review = review;
        this.stars = stars;
    }

    //setter
    public void setreview(String setreview){
        this.review = setreview;
    }

    public void setstars(int setstars){
        this.stars = setstars;
    }

    //getter
    public String getreview(){
        return review;
    }
    
    public int getstars(){
        return stars;
    }
}