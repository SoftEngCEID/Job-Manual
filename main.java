import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Biographic: ");
        String str = scan.nextLine(); // reads string
        System.out.print("You have entered: " + str);
        String isss_public = scan.nextLine(); // reads string
        System.out.print("Set Biographic public or private: " + isss_public);

        // Biography bio = new Biography(str, str1); //create an instance of the class
    }

}
