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
                            jobs job1 = new jobs(myjobtitle, myjobdescr);// create object named job1 of class job
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
                                    // ???????????????
                                    break;

                            }

                        }
                        break;
                    case 2:

                        HashMap<String, String> jobslist = new HashMap<String, String>();
                        jobs job2 = new jobs("Software Engineer Position", "HI, we looking for a java developer ");
                        jobslist.put("Software Engineer Position", "HI,we looking or a java  developer\n");
                        jobslist.put("Barista", "HI,we looking  for a barista\n");
                        // System.out.println(jobs_list);
                        jobslist.forEach((key, value) -> System.out.println(key + "\n" + value));
                        Scanner updatejob = new Scanner(System.in);
                        System.out.println("Choose your job-title you want to edit:");
                        String choosejobtitle = updatejob.nextLine();

                        Scanner updatejobdescr = new Scanner(System.in);
                        System.out.println("Please Edit your job:");
                        String choosejobdescr = updatejobdescr.nextLine();
                        jobslist.put(choosejobtitle, choosejobdescr);
                        jobslist.forEach((key, value) -> System.out.println(key + "\n" + value));
                        String value = jobslist.get(choosejobtitle);
                        System.out.println(value);
                        jobs job3 = new jobs(choosejobtitle, choosejobdescr);
                        job3.setJob_title(choosejobtitle);
                        job3.setDescription(choosejobdescr);

                        break;
                    case 3:
                      
                    
                        
                        break;
                        
                        
                      
                    }            
                         
    }

}
}
