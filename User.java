import java.util.Scanner;

public class User {
    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Setter
    public void setName(String newUsername, String newPassword, String newEmail) {
        this.username = newUsername;
        this.password = newPassword;
        this.email = newEmail;
    }
}

class Candid_User extends User {
    public Candid_User(String username, String password, String email) {
        super(username, password, email);
    }

    private String name, last_name, address, birth_date, nationality, phone_number;

    public void Insert_data(String newName, String newLast, String newAdd, String newBirth, String newNation,
            String newPhone) {
        this.name = newName;
        this.last_name = newLast;
        this.address = newAdd;
        this.birth_date = newBirth;
        this.nationality = newNation;
        this.phone_number = newPhone;
    }

    public String Get_Data() {
        String s = "Name: " + name + "\nLast name: " + last_name + "\nAddress: " + address + "\nBirthday: " + birth_date
                + "\nNationality: " + nationality + "\nPhone number: " + phone_number;
        return s;
    }

    public void Insert_Bio() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Bio: ");

        String bio1 = myObj.nextLine();

        System.out.println("Do you want it to be public?\nYES: Press 1\tNO: Press 2");
        int choice = myObj.nextInt();
        boolean istrue;
        switch (choice) {
            case 1:
                istrue = true;
            case 2:
                istrue = false;
            default:
                istrue = false;
        }

        // Biography bio = new Biography(bio1, is
        // System.out.println(bio.getBio());
        //System.out.println(bio.getis_Public());
    }

}