import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Accept_list {
    public void Insert_ACandidate(String Candid_User, String job, Map<String, Queue<String>> accepted){
        employer_usecases uc3 = new employer_usecases();
        if(accepted.containsKey(job)){
            accepted.get(job).add(Candid_User);
        }
        else{
            Queue queue = new LinkedList<>();
            queue.add(Candid_User);
            accepted.putIfAbsent(job, queue);
        }
        uc3.setAccepted(accepted);
    }
}
