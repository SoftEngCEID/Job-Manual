import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    //Maps gia douleies tou ka8e employer & gia lista aitountwn
    private Map<String, List<String>> job_map = new HashMap<String, List<String>>();
    private Map<String, Queue<String>> candids = new HashMap<String, Queue<String>>();
    private Map<String, Queue<String>> accepted = new HashMap<String, Queue<String>>();
    private Queue queue = new LinkedList<String>();
    public static void main(String[] args){
        Employer_user test = new Employer_user("mariossskar", "123", "mariossskar@gmail.com", "Employer");
        Candid_list pepe = new Candid_list();
        Main main = new Main();

        //Maps gia douleies tou ka8e employer & gia lista aitountwn
        Map<String, List<String>> job_map = new HashMap<String, List<String>>();
        job_map = main.getJobMap();
        Map<String, Queue<String>> candids = new HashMap<String, Queue<String>>();
        candids = main.getCandids();
        Map<String, Queue<String>> accepted = new HashMap<String, Queue<String>>();
        accepted = main.getAccepted();

        //Endeiktikh oura gia tous aitountes
        Queue queue = new LinkedList<String>();
        queue = main.getQueue();
        queue.add("Marios");
        queue.add("Arho");
        queue.add("Dennis");

        //Vazei sto map to list1 pou periexei tis douleies
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "Douleia 1", "Douleia 2", "Douleia 3", "Douleia 4", "Douleia 5");
        job_map.putIfAbsent("mariossskar", list1);

        //Lista aitountwn mono gia th douleia 1
        candids.putIfAbsent("Douleia 1", queue);

        int choice = 0;

        while(choice!=3){
            Scanner getObj = new Scanner(System.in);
            System.out.println("Επιλέξτε μια ενέργεια");
            System.out.println("1. Οι θέσεις μου\n2. Δημοσίευση νέας θέσης εργασίας\n3. Έξοδος");

            choice = getObj.nextInt();
            switch(choice){
            case 1:
                //Ektupwsh twn thesewn ergasias tou sugkekrimenou employer
                for (String key: job_map.keySet()){
                    System.out.println(job_map.get(key));
                }
                Scanner getObj1 = new Scanner(System.in);
                System.out.println("Επιλέξτε μια θέση εργασίας");
                String job = getObj1.nextLine();

                System.out.println("1. Εμφάνιση αιτούντων\t2. Accepted");
                int choice2 = getObj.nextInt();
                if(choice2==1){
                    //Ektupwsh ouras aitountwn
                    pepe.Get_Candidate_List(candids, job, accepted);
                }
                else if(choice2==2){
                    System.out.println("Accepted\n" + main.getAccepted() + "\n");
                }
                break;

            case 2:
            //Use case 5
            case 3:
                System.out.println("Έξοδος");
                break;
            default:
                System.out.println("Παρακαλώ επιλέξτε κάτι από τα παρακάτω");
                break;
            }
        }  
    }

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