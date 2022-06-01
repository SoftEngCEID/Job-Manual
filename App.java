import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File; // Import the File class;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Biographic: ");
        String str = scan.nextLine(); // reads string
        // System.out.print("You have entered: " + str);

        System.out.print("\nSet Biographic public or private: ");
        String isss_public = scan.nextLine(); // reads string

        Biography bio = new Biography(str, isss_public); // create an instance of the class
        // System.out.println("You have entered: " + isss_public);
        System.out.println(bio.getBio());
    }

}
