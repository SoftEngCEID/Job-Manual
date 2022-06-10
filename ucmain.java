import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ucmain {
    public static <plan> void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Type 1 if you want to edit <My Jobs> or 2 if you want to exit ");
        int number = myObj.nextInt();

        switch (number) {
            case 1:
                Scanner myoption = new Scanner(System.in);
                System.out.println(
                        "Choose:\n 1 If you want to publish job \n 2 If you want to edit \n 3 If you want to delete a job");
                int optnumber = myoption.nextInt();
                switch (optnumber) {
                    case 1:

                        HashMap<String, String> jobs = new HashMap<String, String>();
                        boolean checklist = jobs.isEmpty();
                        if (checklist) {
                            Scanner insertjobtitle = new Scanner(System.in);
                            System.out.println(
                                    "Enter job title");
                            String myjobtitle = insertjobtitle.nextLine();
                            Scanner insertjobdescr = new Scanner(System.in);
                            System.out.println(
                                    "Enter job description");
                            String myjobdescr = insertjobdescr.nextLine();
                            jobs job1 = new jobs(myjobtitle, myjobdescr);
                            job1.setDescription(myjobdescr);
                            job1.setJob_title(myjobtitle);
                            jobs.put("myjobtitle", "myjobdescr");
                            System.out.println(jobs);
                        } else {
                            user_plan usrpl = new user_plan("Standard");
                            String userplan = usrpl.getplan();
                            switch (userplan) {
                                case "Standard":
                                    System.out.println(
                                            "Your plan is standard you can insert another job.Please update your plan");
                                    break;
                                case "Premium":
                                    break;

                            }

                        }
                        break;
                    case 2:
                        jobs job1 = new jobs("Software Engineer Position", "HI, we looking for a java developer ");
                        break;
                    case 3:

                        break;
                }

                break;
            case 2:
                break;

        }

    }
}
