import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Employer_user test = new Employer_user("mariossskar", "123", "mariossskar@gmail.com");

        Map<String, ArrayList<String>> job_map = new HashMap<String, ArrayList<String>>();

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Douleia 1");
        list1.add("Douleia 2");
        list1.add("Douleia 3");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Douleia 4");
        list2.add("Douleia 5");
        list2.add("Douleia 6");
        job_map.putIfAbsent("mariossskar", list1);
        job_map.putIfAbsent("arhodia12", list2);

        for (String key: job_map.keySet()){
			System.out.println(key+ " = " + job_map.get(key));
        }
    }
}