import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ucmain {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Type 1 if you want to edit <My Jobs> or 2 if you want to exit ");
        int number = myObj.nextInt();

        switch (number) {
            case 1:
                Scanner myoption = new Scanner(System.in);
                System.out.println(
                        "Choose 1 if you want to publish job \n 2 if you want to edit \n 3 if you want to delete a job ");
                int optnumber = myoption.nextInt();
                switch (optnumber) {
                    case 1:
                        ArrayList<String> jobs = new ArrayList<String>();
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
                            jobs.add(myjobdescr);
                            System.out.println(jobs);
                        } else {

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
