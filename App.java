import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File; // Import the File class;
import java.io.FileReader;
import java.io.IOException;
//import  com.aspose.cells.Workbook; 

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("database_text.txt"));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter username: ");
        String str = scan.nextLine(); // reads string

        // System.out.print("You have entered: " + str);

        System.out.print("\nSet Biographic public or private: ");
        String isss_public = scan.nextLine(); // reads string

        Biography bio = new Biography(str, isss_public); // create an instance of the class
        // System.out.println("You have entered: " + isss_public);
        System.out.println(bio.getBio());
        Candid_User test = new Candid_User("mariossskar", "123", "mariossskar@gmail.com", "CANDIDATE");
        test.Insert_data("Marios", "Karelis", "Karaiskaki 80", "18/10/2000", "Greek", "6957631801");
        test.Insert_Bio();
        Scanner user = new Scanner(System.in);
        System.out.println("Enter name: ");

        String user1 = user.nextLine();
        cand_empl = "CANDIDATE";
        switch (cand_empl) {
            case CANDIDATE:
                Insert_Bio();
                break;
            case EMPLOYEE:
                // code block
                break;
        }

    }

}
