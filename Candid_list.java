import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Candid_list {
    public void Insert_Candidate(String Candid_User, String job, Map<String, Queue<String>> accepted){
        Main main = new Main();
        Map<String, Queue<String>> candids = main.getCandids();

        Scanner getObj = new Scanner(System.in);
        System.out.println("Αποδοχή του αιτούντα?");
        int choice = getObj.nextInt();

        switch(choice){
            case 1:
                if(accepted.containsKey(job)){
                    accepted.get(job).add(Candid_User);
                }
                else{
                    Queue queue = new LinkedList<>();
                    queue.add(Candid_User);
                    accepted.putIfAbsent(job, queue);
                }
                main.setAccepted(accepted);
                break;
            default:
                break;
        }
    }

    public void Get_Candidate_List(Map<String, Queue<String>> map, String job, Map<String, Queue<String>> accepted){
        Main main = new Main();
        Accept_list acceptlist = new Accept_list();
        Candid_User user = new Candid_User();
        user.Insert_data("Marios", "Karelis", "Karaiskaki 80", "18/10/2000", "Greek", "6957631801");

        Scanner getObj = new Scanner(System.in);
        Queue candid_queue = map.get(job);
        System.out.println(candid_queue);
        System.out.println("Επιλέξτε τον αιτούντα που επιθυμείτε:");
        String candid = getObj.nextLine();

        int choice = 1;

        while(choice==1){
            System.out.println("\n1. Προβολή προφίλ\t" + "2. Ενδιαφέρομαι\n" + "3. Δεν ενδιαφέρομαι\t" + "4. Επιστροφή");
            choice = getObj.nextInt();
            switch(choice){
                case 1:
                    System.out.println("\n" + user.Get_Data() + "\n");
                    break;
                case 2:
                    acceptlist.Insert_ACandidate(candid, job, accepted);
                    candid_queue.remove(candid);
                    map.replace(job, candid_queue);
                    main.setCandids(map);
                    break;
                case 3:
                    candid_queue.remove(candid);
                    map.replace(job, candid_queue);
                    main.setCandids(map);
                    break;
                default:
                    break;
            }
        }
    }
}