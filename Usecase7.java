import java.util.Scanner;

public class Usecase7 {

    public static void main(String[] args){
        Company_description descr1 = new Company_description("epeixhrhsh1 perigrafh");
        Company_description descr2 = new Company_description("epeixhrhsh2 perigrafh");
        Company_description descr3 = new Company_description("epeixhrhsh3 perigrafh");
        History job1history = new History("job1", false);
        History job2history = new History("job2", true);
        History job3history = new History("job3", true);


        System.out.println("Select the company you want to leave a review for (type the number of the company)");
        System.out.println("1 - " + descr1.getdescription() + "\n");
        System.out.println("2 - " + descr2.getdescription() + "\n");
        System.out.println("3 - " + descr3.getdescription() + "\n");

        Scanner numscan = new Scanner(System.in);
        int typednum = numscan.nextInt();

        System.out.println("\nRate with number of stars (0 - 5)\n");

        Scanner starsscan = new Scanner(System.in);
        int typedstars = starsscan.nextInt();

        System.out.println("\nLeave your comments:\n");

        Scanner commentsscan = new Scanner(System.in);
        String typedcomments = commentsscan.nextLine();
        
        if (typednum == 1){
            if (job1history.Is_verified() == true){
                Reviews review1 = new Reviews(typedcomments, typedstars);
                System.out.println("\nYour review has been saved!\n");
                System.out.println(review1.getreview() + "\n");
                System.out.println("stars: " + review1.getstars());
            }
            else {
                System.out.println("You don't have verified experience in this company to leave a review");

            }
        }

        else if (typednum == 2){
            if (job2history.Is_verified() == true){
                Reviews review1 = new Reviews(typedcomments, typedstars);
                System.out.println("\nYour review has been saved!\n");
                System.out.println(review1.getreview());
                System.out.println("stars: " + review1.getstars());
            }
            else {
                System.out.println("You don't have verified experience in this company to leave a review");

            }
        }

        else if (typednum == 3){
            if (job3history.Is_verified() == true){
                Reviews review1 = new Reviews(typedcomments, typedstars);
                System.out.println("\nYour review has been saved!\n");
                System.out.println(review1.getreview() + "\n");
                System.out.println("stars: " + review1.getstars());
            }
            else {
                System.out.println("You don't have verified experience in this company to leave a review");

            }
        }
    }     
}