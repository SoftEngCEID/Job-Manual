import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    //Ενδεικτικά αντικείμενα Candid_User & Employer_user
    private static Candid_User candidUser = new Candid_User("username", "123", "test@gmail.com", "candidate");
    private static Employer_user employerUser = new Employer_user("username", "123", "test@gmail.com", "employer");
    
    public static void main(String[] args){

        //Τιμές στα attributes
        candidUser.Insert_data("Onoma", "Epitheto", "Odos 1", "12/03/2000", "Greek", "1234567890");
        employerUser.setBusiness_description("This is my business");
        employerUser.setFund_date("01/01/2020");

        //Αρχικοποίηση ουράς υποψηφίων για use case 3
        employer_usecases test = new employer_usecases();
        test.setQueue(test.getQueue(), "Marios");
        test.setQueue(test.getQueue(), "Arho");
        test.setQueue(test.getQueue(), "Dennis");
        test.setQueue(test.getQueue(), "Dimitris");

        Scanner getUser = new Scanner(System.in);

        //Pseudo-login. Επιλογή candidate ή employer
        System.out.println("Log in as:\n" + "1. candidate\t2. employer");
        String user = getUser.nextLine();

        switch(user){

            //Αν επιλέξω candidate τρέχει αυτό το case
            case "candidate":
                int choice_user = 0;

                //Λούπα ώστε να τρέχει μέχρι να κάνει έξοδο από το σύστημα
                while(choice_user != 3){

                    //Main Page & αντίστοιχες λειτουργίες που μπορεί να κάνει ο candidate
                    System.out.println("*Main Page*\n" + "1. Προφίλ\t" + "2. Αξιολόγηση Επιχείρησης\t" + "3. 'Εξοδος");
                    
                    Scanner getObj = new Scanner(System.in);
                    choice_user = getObj.nextInt();


                    //Επιλογή του χρήστη
                    switch(choice_user){

                        //Αν επιλέξει Προφίλ τρέχει το run_usecase2
                        case 1:
                            user_usecases.run_usecase2(candidUser, employerUser, candidUser.getProfile_category());
                            break;

                        //Αν επιλέξει Αξιολόγηση Επιχείρησης τρέχει το run_usecase7
                        case 2:
                            user_usecases.run_usecase7();
                            break;

                        case 3:
                            break;
                    }
                }

            //Αν επιλέξω employer τρέχει αυτό το case
            case "employer":
                int choice_employer = 0;
                
                //Λούπα ώστε να τρέχει μέχρι να κάνει έξοδο από το σύστημα
                while(choice_employer != 3){

                //Main Page & αντίστοιχες λειτουργίες που μπορεί να κάνει ο employer
                System.out.println("*Main Page*\n" + "1. Προφίλ\t" + "2. Οι θέσεις μου\t" + "3. Έξοδος");
                Scanner getObj = new Scanner(System.in);
                choice_employer = getObj.nextInt();

                //Επιλογή του χρήστη
                switch(choice_employer){

                    //Αν επλέξει Προφίλ τρέχει το run_usecase2
                    case 1:
                        user_usecases.run_usecase2(candidUser, employerUser, employerUser.getProfile_category());
                        break;

                    //Αν επιλέξει Οι θέσεις μου τον μεταφέρει στην Jobs Screen
                    case 2:
                        //Jobs Screen & αντίστοιχες λειτουργίες που μπορεί να κάνει ο employer
                        System.out.println("*Jobs Screen*\n" + "1. Οι θέσεις μου\t" + "2. Δημοσίευση νέας θέσης εργασίας\t" + "3. Έξοδος");
                        int choice3 = getObj.nextInt();

                        //Αν επιλέξει Οι θέσεις μου τρέχει το run_usecase3
                        if(choice3 == 1){
                            employer_usecases.run_usecase3();
                        }

                        //Αν επιλέξει Δημοσίευση νέας θέσης εργασίας τρέχει το run_usecase5
                        else if(choice3 == 2){
                            employer_usecases.run_usecase5();
                        }
                        break;

                    case 3:
                        break;
                    
                }
                }
        }
    }  
}

    //Κλάση με μεθόδους για τα use cases του candidate
    class user_usecases{

        //Δημιουργία μερικών αντικειμένων Employer_user & History
        private static Employer_user employer1 = new Employer_user();
        private static Employer_user employer2 = new Employer_user();
        private static Employer_user employer3 = new Employer_user();
        private static History job1history = new History("job1", false);
        private static History job2history = new History("job2", true);
        private static History job3history = new History("job3", true);

        //Μέθοδος για το use case 2. Παίρνει ορίσματα 2 αντικείμενα(Candid_User & Employer_user) και ένα String που υποδεικνύει ποιός κάλεσε τη μέθοδο
        static void run_usecase2(Candid_User user, Employer_user employer, String whatIs){ 

                    //Ελέγχει τι είδος χρήστη έχει καλέσει τη μέθοδο και μπαίνει στο αντίστοιχο case
                    switch (whatIs) {

                        //Αν είναι candidate
                        case "candidate":

                            //User Profile & αντίστοιχες ενέργειες που μπορεί να κάνει ο candidate
                            System.out.println("1. Προβολή προφίλ\t" + "2. Επεξεργασία προφίλ");
                            Scanner getChoice = new Scanner(System.in);
                            int cand_choice = getChoice.nextInt();
                        
                            //Επιλογή του χρήστη
                            switch(cand_choice){

                                //Αν επιλέξει Προβολή προφίλ καλείται η μέθοδος Get_Data της κλάσης Candid_User
                                case 1:
                                    System.out.println("\n" + user.Get_Data() + "\n");
                                    break;

                                //Αν επιλέξει Επεξεργασία προφίλ
                                case 2:
                                    Scanner myedit = new Scanner(System.in);

                                    //Εκτύπωση των επιλογών που έχει ο χρήστης
                                    System.out.println("Τι θέλετε να επεξεργαστείτε?\n");
                                    System.out.println("1. Όνομα\t" + "2. Επώνυμο\t" + "3. Διεύθυνση");
                                    System.out.println("4. Ημ. γέννησης\t" + "5. Υπηκοότητα\t" + "6. Τηλέφωνο\n" + "7. Βιογραφικό\t" + "8. Επιστροφή");

                                    Scanner myObj_edit = new Scanner(System.in);
                                    int choice1 = myObj_edit.nextInt();

                                    //Επιλογή του χρήστη
                                    switch(choice1){

                                        //Αλλαγή ονόματος
                                        case 1:
                                            Scanner myname = new Scanner(System.in);
                                            System.out.println("Αλλαγή ονόματος");
                                            String initname = myname.nextLine();
                                            user.Insert_name(initname);
                                            break;

                                        //Αλλαγή επωνύμου
                                        case 2:
                                            Scanner mylastname = new Scanner(System.in);
                                            System.out.println("Αλλαγή επωνύμου");
                                            String initlastname = mylastname.nextLine();
                                            user.Insert_lastname(initlastname);
                                            break;

                                        //Αλλαγή διεύθυνσης
                                        case 3:
                                            Scanner myadress = new Scanner(System.in);
                                            System.out.println("Αλλαγή διεύθυνσης");
                                            String initmyadress = myadress.nextLine();
                                            user.Insert_adress(initmyadress);
                                            break;

                                        //Αλλαγή ημ. γέννησης
                                        case 4:
                                            Scanner mybirthdate = new Scanner(System.in);
                                            System.out.println("Αλλαγή ημ. γέννησης");
                                            String initmybirthdate = mybirthdate.nextLine();
                                            user.Insert_newBirth(initmybirthdate);
                                            break;

                                        //Αλλαγή υποκοότητας
                                        case 5:
                                            Scanner mynationality = new Scanner(System.in);
                                            System.out.println("Αλλαγή υποκοότητας");
                                            String initmynationality = mynationality.nextLine();
                                            user.Insert_newnationality(initmynationality);
                                            break;

                                        //Αλλαγή τηλεφώνου
                                        case 6:
                                            Scanner myphonenumber = new Scanner(System.in);
                                            System.out.println("Αλλαγή τηλεφώνου");
                                            String initmyphonenumber = myphonenumber.nextLine();
                                            user.Insert_newphone_number(initmyphonenumber);
                                            break;

                                        //Αλλαγή βιογραφικού
                                        case 7:
                                            Scanner myObj = new Scanner(System.in); //
                                            System.out.println("Αλλαγή βιογραφικού:");
                                            String bio1 = myObj.nextLine();
                            
                                            //Ο χρήστης επιλέγει αν θέλει το βιογραφικό του να είναι public ή private
                                            System.out.println("Πίεσε true αν θες να είναι public:");
                                            boolean ispublic = myObj.nextBoolean();
                            
                                            //Δημιουργία αντικειμένου bio
                                            Biography bio = new Biography(bio1, ispublic);
                            
                                            boolean check = bio.getis_Public();
                                            if (check) {
                                                System.out.println("Το βιογραφικό είναι public\n");
                                            } else {
                                                System.out.println("Το βιογραφικό είναι private\n");
                                            }
                                            break;
                                        case 8:
                                            break;
                                    }
                                    break;
                            }break;

                        //Αν είναι employer
                        case "employer":

                            //User Profile & αντίστοιχες ενέργειες που μπορεί να κάνει ο employer
                            System.out.println("1. Προβολή προφίλ\t" + "2. Επεξεργασία προφίλ");
                            Scanner myObj1 = new Scanner(System.in);
                            int choice = myObj1.nextInt();

                            //Επιλογή του χρήστη
                            switch(choice){

                                //Αν επιλέξει Προβολή προφίλ καλείται η μέθοδος Get_Data της κλάσης Employer_user
                                case 1:
                                    System.out.println("\n" + employer.Get_Data() + "\n");
                                    break;

                                //Αν επιλέξει Επεξεργασία προφίλ
                                case 2:

                                    //Εκτύπωση των επιλογών που έχει ο χρήστης
                                    System.out.println("Επιλέξτε για επεξεργασία:\n");
                                    System.out.println("1. Company description\t" + "2. Έξοδος");
                                    Scanner scdescr = new Scanner(System.in);
                                    int getEdit = scdescr.nextInt();

                                    //Επιλογή του χρήστη
                                    switch(getEdit){

                                        //Αλλαγή του Company description
                                        case 1:
                                            System.out.println("Enter Company description: ");
                                            Scanner scdescr1 = new Scanner(System.in);
                                            String comp_descr = scdescr1.nextLine();
                                            employer.setBusiness_description(comp_descr);
                                            System.out.println("\nTo νέο Company description είναι:" + employer.getBusiness_description());
                                            break;
                                        
                                        //Έξοδος
                                        case 2:
                                            break;
                                    }
                                    break;
                            }
            }
        }

        //Μέθοδος για το use case 7
        static void run_usecase7(){
            //Αντικείμενο της κλάσης Messages για την εκτύπωση κατάλληλων μηνυμάτων
            Messages message = new Messages();

            //Τιμές στα attributes
            employer1.setBusiness_description("business_description 1");
            employer2.setBusiness_description("business_description 2");
            employer3.setBusiness_description("business_description 3");

            //Εκτύπωση των διαθέσιμων επιχειρήσεων και επιλογή από τον χρήστη
            System.out.println("Επιλέξτε την επιχείρηση που θέλετε να αφήσετε review");
            System.out.println("1 - " + employer1.getBusiness_description() + "\n");
            System.out.println("2 - " + employer2.getBusiness_description() + "\n");
            System.out.println("3 - " + employer3.getBusiness_description() + "\n");
    
            Scanner numscan = new Scanner(System.in);
            int typednum = numscan.nextInt();
    
            //Εισαγωγή αστεριών (0 - 5)
            System.out.println("\nΒαθμολογίστε με αστέρια (0 - 5)\n");
    
            Scanner starsscan = new Scanner(System.in);
            int typedstars = starsscan.nextInt();
    
            //Εισαγωγή σχολίων
            System.out.println("\nΑφήστε σχόλια:\n");
    
            Scanner commentsscan = new Scanner(System.in);
            String typedcomments = commentsscan.nextLine();
            
            //Ελέγχει αν θέλει να αφήσει review στην 1η επιχείρηση
            if (typednum == 1){

                //Αν έχει προηγούμενη εμπειρία στην επιχείρηση αποθηκεύει το review
                if (job1history.Is_verified() == true){
                    Reviews review1 = new Reviews(typedcomments, typedstars);
                    System.out.println("\nΤο review σας έχει αποθηκευτεί!\n");
                    System.out.println(review1.getreview() + "\n");
                    System.out.println("Αστέρια: " + review1.getstars());
                }

                //Αλλιώς εμφανίζει κατάλληλο μήνυμα
                else {
                    System.out.println(message.NotVerified());
                }
            }
    
            //Ελέγχει αν θέλει να αφήσει review στην 2η επιχείρηση
            else if (typednum == 2){

                //Αν έχει προηγούμενη εμπειρία στην επιχείρηση αποθηκεύει το review
                if (job2history.Is_verified() == true){
                    Reviews review1 = new Reviews(typedcomments, typedstars);
                    System.out.println("\nΤο review σας έχει αποθηκευτεί!\n");
                    System.out.println(review1.getreview());
                    System.out.println("Αστέρια: " + review1.getstars());
                }

                //Αλλιώς εμφανίζει κατάλληλο μήνυμα
                else {
                    System.out.println(message.NotVerified());
                }
            }
    
            //Ελέγχει αν θέλει να αφήσει review στην 3η επιχείρηση
            else if (typednum == 3){

                //Αν έχει προηγούμενη εμπειρία στην επιχείρηση αποθηκεύει το review
                if (job3history.Is_verified() == true){
                    Reviews review1 = new Reviews(typedcomments, typedstars);
                    System.out.println("\nΤο review σας έχει αποθηκευτεί!\n");
                    System.out.println(review1.getreview() + "\n");
                    System.out.println("Αστέρια: " + review1.getstars());
                }

                //Αλλιώς εμφανίζει κατάλληλο μήνυμα
                else {
                    System.out.println(message.NotVerified());
                }
            }
        }
    }
   
    //Κλάση με μεθόδους για τα use cases του employer
    class employer_usecases{
        //Απαραίτητες μεταβλητές για την αποθήκευση των τιμών
        private static Map<String, List<String>> job_map = new HashMap<String, List<String>>();
        private static Map<String, Queue<String>> candids = new HashMap<String, Queue<String>>();
        private static Map<String, Queue<String>> accepted = new HashMap<String, Queue<String>>();
        private static Candid_list cand_list = new Candid_list();
        private static Queue queue = new LinkedList<String>();
        private static HashMap<String, String> jobs = new HashMap<String, String>();
        private static User_plan usrpl = new User_plan("Standard");

        //Μέθοδος για το use case 5
        static void run_usecase5(){
            //Αντικείμενο της κλάσης Messages για την εκτύπωση κατάλληλων μηνυμάτων
            Messages message = new Messages();

            Scanner myoption = new Scanner(System.in);
            
            //Ενέργειες που μπορεί να κάνει ο employer
            System.out.println("\n1. Δημοσίευση νέας θέσης εργασίας\n" + "2. Επεξεργασία θέσης εργασίας\n" + "3. Διαγραφή");
            int optnumber = myoption.nextInt();

            //Επιλογή του χρήστη
            switch (optnumber) {

                //Αν επιλέξει Δημοσίευση νέας θέσης εργασίας
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
                        if (userplan == "Standard") {
                            System.out.println(message.Upgrade());
                        }
                    }
                    break;

                //Αν επιλέξει Επεξεργασία θέσης εργασίας
                case 2:
                    HashMap<String, String> jobslist = new HashMap<String, String>();
                    Jobs job2 = new Jobs("Software Engineer Position", "Hi, we looking for a java developer");
                    jobslist.put("Software Engineer Position", "Hi,we looking or a java developer\n");
                    jobslist.put("Barista", "Hi,we looking  for a barista\n");

                    //Εκτύπωση θέσεων εργασίας
                    jobslist.forEach((key, value) -> System.out.println(key + "\n" + value));
                    Scanner updatejob = new Scanner(System.in);
                    System.out.println("Επιλέξτε τη θέση που θέλετε να επεξεργαστείτε:");
                    String choosejobtitle = updatejob.nextLine();

                    //Επεξεργασία της θέσης
                    Scanner updatejobdescr = new Scanner(System.in);
                    System.out.println("Επεξεργασία:");
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

        //Μέθοδος για το use case 3
        static void run_usecase3(){
            employer_usecases uc3 = new employer_usecases();
    
            //Maps για θέσεις εργασίας του κάθε employer & για λίστα υποψηφίων
            job_map = uc3.getJobMap();
            candids = uc3.getCandids();
            accepted = uc3.getAccepted();

            queue = uc3.getQueue();

            //Βάζει σε Map τα ονόματα των employers και τις θέσεις εργασίας τους
            List<String> list1 = new ArrayList<>();
            Collections.addAll(list1, "Douleia 1", "Douleia 2", "Douleia 3");
            job_map.putIfAbsent("mariossskar", list1);

            //Λίστα υποψηφίων μόνο για τη "Douleia 1"
            candids.putIfAbsent("Douleia 1", queue);

            int choice = 0;

            //Εκτύπωση των θέσεων εργασίας του συγκεκριμένου employer
            for (String key: job_map.keySet()){
                System.out.println(job_map.get(key));
            }

            Scanner getObj1 = new Scanner(System.in);

            //Επιλογή θέσης εργασίας
            System.out.println("\nΕπιλέξτε μια θέση εργασίας");
            String job = getObj1.nextLine();

            //Ενέργειες που μπορεί να κάνει ο employer
            System.out.println("\n1. Εμφάνιση υποψηφίων\t2. Εμφάνιση λίστας αποδοχής");
            int choice2 = getObj1.nextInt();

            //Αν επιλέξει Εμφάνιση υποψηφίων καλείται η μέθοδος Get_Candidate_List της κλάσης Candid_list
            if(choice2==1){
                cand_list.Get_Candidate_List(candids, job, accepted);
            }

            //Αν επιλέξει Εμφάνιση λίστας αποδοχής εκτυπώνεται η λίστα αποδοχής για τη συγκεκριμένη θέση εργασίας
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
    
        public void setQueue(Queue queue, String s){
            this.queue.add(s);
        }
    }