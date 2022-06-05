import java.util.Scanner;

public class App {
    public enum profile_category {
        CANDIDATAE, EMPLOYER
    }

    public static void main(String[] args) throws Exception {
        User user1 = new User("sdvv", "12345", "aser@gmail.com", "candidate");
        User user2 = new User("sdsw", "123456", "sdsw@gmail.com", "candidate");
        User user3 = new User("sdretv", "123457", "sdretvr@gmail.com", "employer");

        String userprfl1 = user1.getprofile_category();
        String userprfl2 = user2.getprofile_category();
        String userprfl3 = user3.getprofile_category();

        switch (userprfl3) {

            case "candidate":
                Scanner myObj = new Scanner(System.in); //
                System.out.println("Enter Bio: ");
                String bio1 = myObj.nextLine(); // myobj and bio1 viriable for bio

                Scanner mysc = new Scanner(System.in);
                System.out.println("Press true if you want to be public:");
                boolean ispublic = mysc.nextBoolean();

                Biography bio = new Biography(bio1, ispublic); // bio object for class Biography
                // System.out.println(bio.getBio());
                // System.out.println(bio.getis_public());

                boolean tr = bio.getis_public();
                if (tr) {
                    System.out.println("Your bio is public\n");
                } else {
                    System.out.println("Your bio is private");
                }

            case "employer":
                Scanner scdescr = new Scanner(System.in); // + bio.getis_public()
                System.out.println("Enter Company Description: ");
                String comp_descr = scdescr.nextLine();
                Company_description cmp_descr = new Company_description(comp_descr);
                cmp_descr.setdescription(comp_descr);
                System.out.println("The description is :" + cmp_descr.getdescription());
                break;

        }

    }

}