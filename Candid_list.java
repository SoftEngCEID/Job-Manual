import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Candid_list {
    public void Insert_Candidate(String Candid_User, String job, Map<String, Queue<String>> accepted){
        employer_usecases uc3 = new employer_usecases();
        Map<String, Queue<String>> candids = uc3.getCandids();

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
                uc3.setAccepted(accepted);
                break;
            default:
                break;
        }
    }

    public void Get_Candidate_List(Map<String, Queue<String>> map, String job, Map<String, Queue<String>> accepted){
        employer_usecases uc3 = new employer_usecases();
        Accept_list acceptlist = new Accept_list();
        Candid_User user1 = new Candid_User();
        Candid_User user2 = new Candid_User();
        Candid_User user3 = new Candid_User();
        Candid_User user4 = new Candid_User();
        user1.Insert_data("Marios", "Karelis", "Karaiskaki 80", "18/10/2000", "Greek", "6957631801");
        user2.Insert_data("Arho", "Giannopoulou", "Odos 1", "30/06/2000", "Greek", "1234567890");
        user3.Insert_data("Dimitris", "Vasilakis", "Odos 23", "18/11/2000", "Greek", "1234567890");
        user4.Insert_data("Dionisis", "Christod", "Odos 5", "30/05/2000", "Greek", "1234567890");

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
                    switch(candid){
                        case "Marios":
                            System.out.println("\n" + user1.Get_Data() + "\n");
                            break;
                        case "Arho":
                            System.out.println("\n" + user2.Get_Data() + "\n");
                            break;
                        case "Dimitris":
                            System.out.println("\n" + user3.Get_Data() + "\n");
                            break;
                        case "Dionisis":
                            System.out.println("\n" + user4.Get_Data() + "\n");
                            break;
                    }
                    break;
                case 2:
                    acceptlist.Insert_ACandidate(candid, job, accepted);
                    candid_queue.remove(candid);
                    map.replace(job, candid_queue);
                    uc3.setCandids(map);
                    break;
                case 3:
                    candid_queue.remove(candid);
                    map.replace(job, candid_queue);
                    uc3.setCandids(map);
                    break;
                default:
                    break;
            }
        }
    }
}