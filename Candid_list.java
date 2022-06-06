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
        Scanner getObj = new Scanner(System.in);
        System.out.println(map.get(job));
        System.out.println("Επιλέξτε τον αιτούντα που επιθυμείτε:");
        String choice = getObj.nextLine();

        Insert_Candidate(choice, job, accepted);
    }
}