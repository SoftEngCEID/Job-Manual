import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ucmain {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Type 1 if you want to edit <My Jobs> or 2 if you want to exit ");
        int number = myObj.nextInt();

        switch (number) {
            case 1:
                Scanner myoption = new Scanner(System.in);
                System.out.println(
                        "Choose 1 if you want to publish job \n 2 if you want to edit \n 3 if you want to delete a job ");
                int optnumber = myObj.nextInt();
                switch (optnumber) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                }

                break;
            case 2:
                break;

        }

    }
}
