import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static Candid_User candidUser = new Candid_User("username", "123", "test@gmail.com", "candidate");
    private static Employer_user employerUser = new Employer_user("username", "123", "test@gmail.com", "employer");
    
    public static void main(String[] args){
        candidUser.Insert_data("Onoma", "Epitheto", "Odos 1", "12/03/2000", "Greek", "1234567890");
        employerUser.setBusiness_description("This is my business");
        employerUser.setFund_date("01/01/2020");

        String user = candidUser.getProfile_category();

        if(user == "candidate"){
            int choice_user = 0;

            while(choice_user != 3){
                System.out.println("*Αρχική οθόνη αναζήτησης εργασίας*\n" + "1. Προφίλ\t" + "2. Αξιολόγηση Επιχείρησης\t" + "3. 'Εξοδος'");
                Scanner getObj = new Scanner(System.in);
                choice_user = getObj.nextInt();
                switch(choice_user){
                    case 1:
                        user_usecases.run_usecase2(candidUser, employerUser, candidUser.getProfile_category());
                        break;
                        
                    case 2:
                        user_usecases.run_usecase7();
                }
            }
            
        }
        else if(user == "employer"){
            int choice_employer = 0;

            while(choice_employer != 3){
            System.out.println("*Αρχική οθόνη αναζήτησης εργασίας*\n" + "1. Προφίλ\t" + "2. Οι θέσεις μου\t" + "3. Έξοδος");
            Scanner getObj = new Scanner(System.in);
            choice_employer = getObj.nextInt();

            switch(choice_employer){
                case 1:
                    user_usecases.run_usecase2(candidUser, employerUser, employerUser.getProfile_category());
                    break;

                case 2:
                    System.out.println("*ΟΘόνη θέσεων εργασίας*\n" + "1. Οι θέσεις μου\t" + "2. Δημοσίευση νέας θέσης εργασίας\t" + "3. Έξοδος");
                    int choice3 = getObj.nextInt();
                    if(choice3 == 1){
                        employer_usecases.run_usecase3();
                    }
                    else if(choice3 == 2){
                        employer_usecases.run_usecase5();
                    }

                case 3:
                    break;
            }
            }
        }
    }  
}

    
    class user_usecases{
        private static Employer_user employer1 = new Employer_user();
        private static Employer_user employer2 = new Employer_user();
        private static Employer_user employer3 = new Employer_user();

        static void run_usecase2(Candid_User user, Employer_user employer, String whatIs){ 
            System.out.println("1. Προβολή προφίλ\t" + "2. Επεξεργασία προφίλ");
            Scanner myObj1 = new Scanner(System.in);
            int choice = myObj1.nextInt();
            switch(choice){
                case 1:
                    System.out.println("\n" + user.Get_Data() + "\n");
                    break;
                case 2:
                    switch (whatIs) {
                        case "candidate":
                            Scanner myedit = new Scanner(System.in);
        
                            System.out.println("Τι θέλετε να επεξεργαστείτε?\n");
                            System.out.println("1. Όνομα\t" + "2. Επώνυμο\t" + "3. Διεύθυνση");
                            System.out.println("4. Ημ. γέννησης\t" + "5. Υπηκοότητα\t" + "6. Τηλέφωνο\n" + "7. Βιογραφικό\t" + "8. Επιστροφή");

                            Scanner myObj_edit = new Scanner(System.in);
                            int choice1 = myObj_edit.nextInt();
                            switch(choice1){
                                case 1:
                                    Scanner myname = new Scanner(System.in);
                                    System.out.println("Αλλαγή ονόματος");
                                    String initname = myname.nextLine();
                                    user.Insert_name(initname);
                                    break;
                                case 2:
                                    Scanner mylastname = new Scanner(System.in);
                                    System.out.println("Αλλαγή επωνύμου");
                                    String initlastname = mylastname.nextLine();
                                    user.Insert_lastname(initlastname);
                                    break;
                                case 3:
                                    Scanner myadress = new Scanner(System.in);
                                    System.out.println("Αλλαγή διεύθυνσης");
                                    String initmyadress = myadress.nextLine();
                                    user.Insert_adress(initmyadress);
                                    break;
                                case 4:
                                    Scanner mybirthdate = new Scanner(System.in);
                                    System.out.println("Αλλαγή ημ. γέννησης");
                                    String initmybirthdate = mybirthdate.nextLine();
                                    user.Insert_newBirth(initmybirthdate);
                                    break;
                                case 5:
                                    Scanner mynationality = new Scanner(System.in);
                                    System.out.println("Αλλαγή υποκοότητας");
                                    String initmynationality = mynationality.nextLine();
                                    user.Insert_newnationality(initmynationality);
                                    break;
                                case 6:
                                    Scanner myphonenumber = new Scanner(System.in);
                                    System.out.println("Αλλαγή τηλεφώνου");
                                    String initmyphonenumber = myphonenumber.nextLine();
                                    user.Insert_newphone_number(initmyphonenumber);
                                    break;
                                case 7:
                                    Scanner myObj = new Scanner(System.in); //
                                    System.out.println("Αλλαγή βιογραφικού:");
                                    String bio1 = myObj.nextLine();
                    
                                    System.out.println("Πίεσε true αν θες να είναι public:");
                                    boolean ispublic = myObj.nextBoolean();
                    
                                    Biography bio = new Biography(bio1, ispublic);
                    
                                    boolean check = bio.getis_Public();
                                    if (check) {
                                        System.out.println("Το βιογραφικό είναι public\n");
                                    } else {
                                        System.out.println("Το βιογραφικό είναι private");
                                    }
                                    break;
                                case 8:
                                    break;
                            }
                            break;

                        case "employer":
                            System.out.println("Επιλέξτε για επεξεργασία:\n");
                            System.out.println("1. Company description\t" + "2. Έξοδος");
                            Scanner scdescr = new Scanner(System.in);
                            int getEdit = scdescr.nextInt();
                            switch(getEdit){
                                case 1:
                                    System.out.println("Enter Company description: ");
                                    Scanner scdescr1 = new Scanner(System.in);
                                    String comp_descr = scdescr1.nextLine();
                                    employer.setBusiness_description(comp_descr);
                                    System.out.println("To Company description είναι:" + employer.getBusiness_description());
                                    break;
                                
                                case 2:
                                    break;
                            }
                            break;
                    }
            }
        }
        static void run_usecase7(){

            employer1.setBusiness_description("business_description 1");
            employer2.setBusiness_description("business_description 2");
            employer3.setBusiness_description("business_description 3");
            History job1history = new History("job1", false);
            History job2history = new History("job2", true);
            History job3history = new History("job3", true);
    
            System.out.println("Επιλέξτε την επιχείρηση που θέλετε να αφήσετε review");
            System.out.println("1 - " + employer1.getBusiness_description() + "\n");
            System.out.println("2 - " + employer2.getBusiness_description() + "\n");
            System.out.println("3 - " + employer3.getBusiness_description() + "\n");
    
            Scanner numscan = new Scanner(System.in);
            int typednum = numscan.nextInt();
    
            System.out.println("\nΒαθμολογίστε με αστέρια (0 - 5)\n");
    
            Scanner starsscan = new Scanner(System.in);
            int typedstars = starsscan.nextInt();
    
            System.out.println("\nΑφήστε σχόλια:\n");
    
            Scanner commentsscan = new Scanner(System.in);
            String typedcomments = commentsscan.nextLine();
            
            if (typednum == 1){
                if (job1history.Is_verified() == true){
                    Reviews review1 = new Reviews(typedcomments, typedstars);
                    System.out.println("\nΤο review σας έχει αποθηκευτεί!\n");
                    System.out.println(review1.getreview() + "\n");
                    System.out.println("Αστέρια: " + review1.getstars());
                }
                else {
                    System.out.println("Δεν έχετε επιβεβαιωμένη προηγούμενη εμπειρία στην επιχείρηση και δεν μπορείτε να αφήσετε review.");
                }
            }
    
            else if (typednum == 2){
                if (job2history.Is_verified() == true){
                    Reviews review1 = new Reviews(typedcomments, typedstars);
                    System.out.println("\nΤο review σας έχει αποθηκευτεί!\n");
                    System.out.println(review1.getreview());
                    System.out.println("Αστέρια: " + review1.getstars());
                }
                else {
                    System.out.println("Δεν έχετε επιβεβαιωμένη προηγούμενη εμπειρία στην επιχείρηση και δεν μπορείτε να αφήσετε review.");
                }
            }
    
            else if (typednum == 3){
                if (job3history.Is_verified() == true){
                    Reviews review1 = new Reviews(typedcomments, typedstars);
                    System.out.println("\nΤο review σας έχει αποθηκευτεί!\n");
                    System.out.println(review1.getreview() + "\n");
                    System.out.println("Αστέρια: " + review1.getstars());
                }
                else {
                    System.out.println("Δεν έχετε επιβεβαιωμένη προηγούμενη εμπειρία στην επιχείρηση και δεν μπορείτε να αφήσετε review.");
                }
            }
        }
    }
   
    class employer_usecases{
        private static Map<String, List<String>> job_map = new HashMap<String, List<String>>();
        private static Map<String, Queue<String>> candids = new HashMap<String, Queue<String>>();
        private static Map<String, Queue<String>> accepted = new HashMap<String, Queue<String>>();
        private static Candid_list cand_list = new Candid_list();
        private static Queue queue = new LinkedList<String>();
        private static HashMap<String, String> jobs = new HashMap<String, String>();
        private static User_plan usrpl = new User_plan("Standard");

        static void run_usecase5(){

            Scanner myoption = new Scanner(System.in);
            System.out.println("\n1. Δημοσίευση νέας θέσης εργασίας\n" + "2. Επεξεργασία θέσης εργασίας\n" + "3. Διαγραφή");
            int optnumber = myoption.nextInt();
            switch (optnumber) {
                case 1:
                    boolean checklist = jobs.isEmpty();
                    if (checklist) {
                        Scanner insertjobtitle = new Scanner(System.in);
                        System.out.println("Εισάγετε τίτλο");
                        String myjobtitle = insertjobtitle.nextLine();
                        Scanner insertjobdescr = new Scanner(System.in);
                        System.out.println("Εισάγετε Company description");
                        String myjobdescr = insertjobdescr.nextLine();
                        Jobs job1 = new Jobs(myjobtitle, myjobdescr);
                        job1.setDescription(myjobdescr);
                        job1.setJob_title(myjobtitle);
                        jobs.put("myjobtitle", "myjobdescr");
                        System.out.println(jobs);
                    } else {
                        
                        String userplan = usrpl.getplan();
                        switch (userplan) {
                            case "Standard":
                                System.out.println("Το πλάνο σας είναι standard, δεν μπορείτε να δημοσιεύσετε άλλη θέση. Παρακαλώ αναβαθμίστε το πλάνο σας");
                                break;
                            case "Premium":
                                // ???????????????
                                break;
                        }
                    }
                    break;
                case 2:
                    HashMap<String, String> jobslist = new HashMap<String, String>();
                    Jobs job2 = new Jobs("Software Engineer Position", "HI, we looking for a java developer ");
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
                    Jobs job3 = new Jobs(choosejobtitle, choosejobdescr);
                    job3.setJob_title(choosejobtitle);
                    job3.setDescription(choosejobdescr);

                    break;
                case 3:
                    break;  
            }                   
            }

        static void run_usecase3(){
            employer_usecases uc3 = new employer_usecases();
    
            //Maps gia douleies tou ka8e employer & gia lista aitountwn
            job_map = uc3.getJobMap();
            candids = uc3.getCandids();
            accepted = uc3.getAccepted();
    
            //Endeiktikh oura gia tous aitountes
            queue = uc3.getQueue();
            queue.add("Marios");
            queue.add("Arho");
            queue.add("Dimitris");
    
            //Vazei sto map to list1 pou periexei tis douleies
            List<String> list1 = new ArrayList<>();
            Collections.addAll(list1, "Douleia 1", "Douleia 2", "Douleia 3");
            job_map.putIfAbsent("mariossskar", list1);
    
            //Lista aitountwn mono gia th douleia 1
            candids.putIfAbsent("Douleia 1", queue);

            int choice = 0;

            //Ektupwsh twn thesewn ergasias tou sugkekrimenou employer
            for (String key: job_map.keySet()){
                System.out.println(job_map.get(key));
            }
            Scanner getObj1 = new Scanner(System.in);
            System.out.println("\nΕπιλέξτε μια θέση εργασίας");
            String job = getObj1.nextLine();

            System.out.println("\n1. Εμφάνιση αιτούντων\t2. Εμφάνιση λίστας αποδοχής");
            int choice2 = getObj1.nextInt();

            if(choice2==1){
                //Ektupwsh ouras aitountwn
                cand_list.Get_Candidate_List(candids, job, accepted);
            }
            else if(choice2==2){
                System.out.println("Λίστα αποδοχής\n" + uc3.getAccepted() + "\n");
            }

        }

        //Getters
        public Map<String, List<String>> getJobMap(){
            return job_map;
        }

        public Map<String, Queue<String>> getCandids(){
            return candids;
        }
    
        public Map<String, Queue<String>> getAccepted(){
            return accepted;
        }
    
        public Queue getQueue(){
            return queue;
        }
    
        //Setters
        public void setCandids(Map<String, Queue<String>> candids){
            this.candids = candids;
        }
    
        public void setAccepted(Map<String, Queue<String>> accepted){
            this.accepted = accepted;
        }
    
        public void setQueue(Queue queue){
            this.queue = queue;
        }
    }