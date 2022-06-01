import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        Candid_User test = new Candid_User("mariossskar", "123", "mariossskar@gmail.com");
        test.Insert_data("Marios", "Karelis", "Karaiskaki 80", "18/10/2000", "Greek", "6957631801");
        test.Insert_Bio();
    }
}